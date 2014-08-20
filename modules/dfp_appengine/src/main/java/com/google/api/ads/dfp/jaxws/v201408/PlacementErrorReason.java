
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacementError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ENTITY_TYPE"/>
 *     &lt;enumeration value="SHARED_INVENTORY_ASSIGNED"/>
 *     &lt;enumeration value="PLACEMENTS_CANNOT_INCLUDE_INVENTORY_FROM_MULTIPLE_DISTRIBUTOR_NETWORKS"/>
 *     &lt;enumeration value="PLACEMENTS_CANNOT_INCLUDE_BOTH_LOCAL_AND_SHARED_INVENTORY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlacementError.Reason")
@XmlEnum
public enum PlacementErrorReason {


    /**
     * 
     *                 Entity type is something other than inventory or content.
     *               
     * 
     */
    INVALID_ENTITY_TYPE,

    /**
     * 
     *                 Shared inventory cannot be assigned to a placement.
     *               
     * 
     */
    SHARED_INVENTORY_ASSIGNED,

    /**
     * 
     *                 Shared inventory from one distributor network cannot be in the same placement with
     *                 inventory from another distributor.
     *               
     * 
     */
    PLACEMENTS_CANNOT_INCLUDE_INVENTORY_FROM_MULTIPLE_DISTRIBUTOR_NETWORKS,

    /**
     * 
     *                 Shared inventory and local inventory cannot be in the same placement.
     *               
     * 
     */
    PLACEMENTS_CANNOT_INCLUDE_BOTH_LOCAL_AND_SHARED_INVENTORY,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PlacementErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
