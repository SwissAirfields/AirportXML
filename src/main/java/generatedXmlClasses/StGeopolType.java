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
 * <p>Java class for stGeopolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stGeopolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COASTLINE"/>
 *     &lt;enumeration value="BOUNDARY"/>
 *     &lt;enumeration value="DASHED_BOUNDARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stGeopolType")
@XmlEnum
public enum StGeopolType {

    COASTLINE,
    BOUNDARY,
    DASHED_BOUNDARY;

    public String value() {
        return name();
    }

    public static StGeopolType fromValue(String v) {
        return valueOf(v);
    }

}