//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stTaxiwayPathType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stTaxiwayPathType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARKING"/>
 *     &lt;enumeration value="RUNWAY"/>
 *     &lt;enumeration value="PATH"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="TAXI"/>
 *     &lt;enumeration value="VEHICLE"/>
 *     &lt;enumeration value="ROAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stTaxiwayPathType")
@XmlEnum
public enum StTaxiwayPathType {

    PARKING,
    RUNWAY,
    PATH,
    CLOSED,
    TAXI,
    VEHICLE,
    ROAD;

    public String value() {
        return name();
    }

    public static StTaxiwayPathType fromValue(String v) {
        return valueOf(v);
    }

}
