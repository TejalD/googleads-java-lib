
package com.google.api.ads.dfp.jaxws.v201308;

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
@WebServiceClient(name = "WorkflowActionService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201308/WorkflowActionService?wsdl")
public class WorkflowActionService
    extends Service
{

    private final static URL WORKFLOWACTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException WORKFLOWACTIONSERVICE_EXCEPTION;
    private final static QName WORKFLOWACTIONSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowActionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201308/WorkflowActionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKFLOWACTIONSERVICE_WSDL_LOCATION = url;
        WORKFLOWACTIONSERVICE_EXCEPTION = e;
    }

    public WorkflowActionService() {
        super(__getWsdlLocation(), WORKFLOWACTIONSERVICE_QNAME);
    }

    public WorkflowActionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns WorkflowActionServiceInterface
     */
    @WebEndpoint(name = "WorkflowActionServiceInterfacePort")
    public WorkflowActionServiceInterface getWorkflowActionServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowActionServiceInterfacePort"), WorkflowActionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkflowActionServiceInterface
     */
    @WebEndpoint(name = "WorkflowActionServiceInterfacePort")
    public WorkflowActionServiceInterface getWorkflowActionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowActionServiceInterfacePort"), WorkflowActionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKFLOWACTIONSERVICE_EXCEPTION!= null) {
            throw WORKFLOWACTIONSERVICE_EXCEPTION;
        }
        return WORKFLOWACTIONSERVICE_WSDL_LOCATION;
    }

}
