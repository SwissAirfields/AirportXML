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
 * <p>Java class for stTaxiPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stTaxiPointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="HOLD_SHORT"/>
 *     &lt;enumeration value="ILS_HOLD_SHORT"/>
 *     &lt;enumeration value="HOLD_SHORT_NO_DRAW"/>
 *     &lt;enumeration value="ILS_HOLD_SHORT_NO_DRAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stTaxiPointType")
@XmlEnum
public enum StTaxiPointType {

    NORMAL,
    HOLD_SHORT,
    ILS_HOLD_SHORT,
    HOLD_SHORT_NO_DRAW,
    ILS_HOLD_SHORT_NO_DRAW;

    public String value() {
        return name();
    }

    public static StTaxiPointType fromValue(String v) {
        return valueOf(v);
    }

}
