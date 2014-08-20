
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Initiates the execution of a {@link ReportQuery} on the server.
 *             
 *             <p>The following fields are required:
 *             <ul>
 *             <li>{@link ReportJob#reportQuery}</li>
 *             </ul>
 *             
 *             @param reportJob the report job to run
 *             @return the report job with its ID filled in
 *           
 * 
 * <p>Java class for runReportJob element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="runReportJob">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reportJob" type="{https://www.google.com/apis/ads/publisher/v201408}ReportJob" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportJob"
})
@XmlRootElement(name = "runReportJob")
public class ReportServiceInterfacerunReportJob {

    protected ReportJob reportJob;

    /**
     * Gets the value of the reportJob property.
     * 
     * @return
     *     possible object is
     *     {@link ReportJob }
     *     
     */
    public ReportJob getReportJob() {
        return reportJob;
    }

    /**
     * Sets the value of the reportJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportJob }
     *     
     */
    public void setReportJob(ReportJob value) {
        this.reportJob = value;
    }

}
