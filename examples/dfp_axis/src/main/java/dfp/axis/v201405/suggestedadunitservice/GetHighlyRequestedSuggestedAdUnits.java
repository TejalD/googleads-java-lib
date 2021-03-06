// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201405.suggestedadunitservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.StatementBuilder;
import com.google.api.ads.dfp.axis.v201405.SuggestedAdUnit;
import com.google.api.ads.dfp.axis.v201405.SuggestedAdUnitPage;
import com.google.api.ads.dfp.axis.v201405.SuggestedAdUnitServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;

/**
 * This example gets all highly requested suggested ad units. To approve
 * suggested ad units, run ApproveSuggestedAdUnits.java. This feature is only
 * available to DFP premium solution networks.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: SuggestedAdUnitService.getSuggestedAdUnitsByStatement
 *
 * @author Adam Rogal
 */
public class GetHighlyRequestedSuggestedAdUnits {

  // Set the number of requests for suggested ad units greater than which to
  // fetch.
  private static final String NUM_REQUESTS = "INSERT_NUMBER_OF_REQUESTS_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long numRequests)
      throws Exception {
    // Get the SuggestedAdUnitService.
    SuggestedAdUnitServiceInterface suggestedAdUnitService =
        dfpServices.get(session, SuggestedAdUnitServiceInterface.class);

    // Create a statement to only select suggested ad units that have a high
    // request rate.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("numRequests >= :numRequests")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("numRequests", numRequests);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get suggested ad units by statement.
      SuggestedAdUnitPage page =
          suggestedAdUnitService.getSuggestedAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
          System.out.printf("%d) Suggested ad unit with ID \"%s\", path \"%s\", "
              + "and number of requests \"%d\" was found.\n",
              i++, suggestedAdUnit.getId(), Joiner.on('/').join(suggestedAdUnit.getPath()),
              suggestedAdUnit.getNumRequests());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(NUM_REQUESTS));
  }
}
