//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.05 at 10:27:20 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stTriggerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stTriggerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REFUEL_REPAIR"/>
 *     &lt;enumeration value="WEATHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stTriggerType")
@XmlEnum
public enum StTriggerType {

    REFUEL_REPAIR,
    WEATHER;

    public String value() {
        return name();
    }

    public static StTriggerType fromValue(String v) {
        return valueOf(v);
    }

}
