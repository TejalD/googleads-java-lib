
package com.google.api.ads.dfp.jaxws.v201306;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ActivityGroupService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201306/ActivityGroupService?wsdl")
public class ActivityGroupService
    extends Service
{

    private final static URL ACTIVITYGROUPSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACTIVITYGROUPSERVICE_EXCEPTION;
    private final static QName ACTIVITYGROUPSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201306", "ActivityGroupService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201306/ActivityGroupService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACTIVITYGROUPSERVICE_WSDL_LOCATION = url;
        ACTIVITYGROUPSERVICE_EXCEPTION = e;
    }

    public ActivityGroupService() {
        super(__getWsdlLocation(), ACTIVITYGROUPSERVICE_QNAME);
    }

    public ActivityGroupService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ActivityGroupServiceInterface
     */
    @WebEndpoint(name = "ActivityGroupServiceInterfacePort")
    public ActivityGroupServiceInterface getActivityGroupServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201306", "ActivityGroupServiceInterfacePort"), ActivityGroupServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ActivityGroupServiceInterface
     */
    @WebEndpoint(name = "ActivityGroupServiceInterfacePort")
    public ActivityGroupServiceInterface getActivityGroupServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201306", "ActivityGroupServiceInterfacePort"), ActivityGroupServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACTIVITYGROUPSERVICE_EXCEPTION!= null) {
            throw ACTIVITYGROUPSERVICE_EXCEPTION;
        }
        return ACTIVITYGROUPSERVICE_WSDL_LOCATION;
    }

}
