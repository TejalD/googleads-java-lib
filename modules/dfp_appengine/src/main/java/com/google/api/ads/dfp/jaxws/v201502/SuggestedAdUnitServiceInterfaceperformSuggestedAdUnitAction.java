
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link SuggestedAdUnit} objects that match the given
 *             {@link Statement#query}.  The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link SuggestedAdUnit#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code numRequests}</td>
 *             <td>{@link SuggestedAdUnit#numRequests}</td>
 *             </tr>
 *             </table>
 *             
 *             @param suggestedAdUnitAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of suggested ad units
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performSuggestedAdUnitAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performSuggestedAdUnitAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="suggestedAdUnitAction" type="{https://www.google.com/apis/ads/publisher/v201502}SuggestedAdUnitAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201502}Statement" minOccurs="0"/>
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
    "suggestedAdUnitAction",
    "filterStatement"
})
@XmlRootElement(name = "performSuggestedAdUnitAction")
public class SuggestedAdUnitServiceInterfaceperformSuggestedAdUnitAction {

    protected SuggestedAdUnitAction suggestedAdUnitAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the suggestedAdUnitAction property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestedAdUnitAction }
     *     
     */
    public SuggestedAdUnitAction getSuggestedAdUnitAction() {
        return suggestedAdUnitAction;
    }

    /**
     * Sets the value of the suggestedAdUnitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedAdUnitAction }
     *     
     */
    public void setSuggestedAdUnitAction(SuggestedAdUnitAction value) {
        this.suggestedAdUnitAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
