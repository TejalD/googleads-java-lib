
package com.google.api.ads.dfp.jaxws.v201408;

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
@WebServiceClient(name = "ContentService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201408/ContentService?wsdl")
public class ContentService
    extends Service
{

    private final static URL CONTENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTENTSERVICE_EXCEPTION;
    private final static QName CONTENTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201408", "ContentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201408/ContentService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTENTSERVICE_WSDL_LOCATION = url;
        CONTENTSERVICE_EXCEPTION = e;
    }

    public ContentService() {
        super(__getWsdlLocation(), CONTENTSERVICE_QNAME);
    }

    public ContentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ContentServiceInterface
     */
    @WebEndpoint(name = "ContentServiceInterfacePort")
    public ContentServiceInterface getContentServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201408", "ContentServiceInterfacePort"), ContentServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContentServiceInterface
     */
    @WebEndpoint(name = "ContentServiceInterfacePort")
    public ContentServiceInterface getContentServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201408", "ContentServiceInterfacePort"), ContentServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTENTSERVICE_EXCEPTION!= null) {
            throw CONTENTSERVICE_EXCEPTION;
        }
        return CONTENTSERVICE_WSDL_LOCATION;
    }

}
