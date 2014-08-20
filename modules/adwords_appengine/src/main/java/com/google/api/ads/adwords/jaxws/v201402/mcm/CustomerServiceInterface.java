
package com.google.api.ads.adwords.jaxws.v201402.mcm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service to access basic details about any customer.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201402.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201402.mcm.ObjectFactory.class
})
public interface CustomerServiceInterface {


    /**
     * 
     *         Returns details of the authorized customer.
     *         
     *         @return customer associated with the caller
     *       
     * 
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.mcm.Customer
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.mcm.CustomerServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.mcm.CustomerServiceInterfacegetResponse")
    public Customer get()
        throws ApiException
    ;

    /**
     * 
     *         Update the authorized customer.
     *         
     *         <p>While there are a limited set of properties available to update, please read this
     *         <a href="https://support.google.com/analytics/answer/1033981">help center article
     *         on auto-tagging</a> before updating {@code customer.autoTaggingEnabled}.
     *         
     *         @param customer the requested updated value for the customer.
     *         @throws ApiException
     *       
     * 
     * @param customer
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.mcm.Customer
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.mcm.CustomerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.mcm.CustomerServiceInterfacemutateResponse")
    public Customer mutate(
        @WebParam(name = "customer", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201402")
        Customer customer)
        throws ApiException
    ;

}
