// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201411.customfieldservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.CustomField;
import com.google.api.ads.dfp.axis.v201411.CustomFieldPage;
import com.google.api.ads.dfp.axis.v201411.CustomFieldServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates a custom field's description. To determine which custom
 * fields exist, run GetAllCustomFields.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CustomFieldService.getCustomFieldsByStatement
 * Tags: CustomFieldService.updateCustomFields
 *
 * @author Adam Rogal
 */
public class UpdateCustomFields {

  // Set the ID of the custom field to update.
  private static final String CUSTOM_FIELD_ID = "INSERT_CUSTOM_FIELD_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long customFieldId)
      throws Exception {
    // Get the CustomFieldService.
    CustomFieldServiceInterface customFieldService =
        dfpServices.get(session, CustomFieldServiceInterface.class);

    // Create a statement to only select a single custom field by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", customFieldId);
    
    // Get the custom field.
    CustomFieldPage page =
        customFieldService.getCustomFieldsByStatement(statementBuilder.toStatement());
    
    CustomField customField = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the custom field description.
    customField.setDescription("New custom field description");

    // Update the custom field on the server.
    CustomField[] customFields =
        customFieldService.updateCustomFields(new CustomField[] {customField});

    for (CustomField updatedCustomField : customFields) {
      System.out.printf(
          "Custom field with ID \"%d\" and name \"%s\" was updated.\n",
          updatedCustomField.getId(), updatedCustomField.getName());
    }
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

    runExample(dfpServices, session, Long.parseLong(CUSTOM_FIELD_ID));
  }
}
