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
 * <p>Java class for stApproachType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stApproachType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GPS"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="LDA"/>
 *     &lt;enumeration value="LOCALIZER"/>
 *     &lt;enumeration value="LOCALIZER_BACKCOURSE"/>
 *     &lt;enumeration value="NDB"/>
 *     &lt;enumeration value="NDBDME"/>
 *     &lt;enumeration value="RNAV"/>
 *     &lt;enumeration value="SDF"/>
 *     &lt;enumeration value="VOR"/>
 *     &lt;enumeration value="VORDME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stApproachType")
@XmlEnum
public enum StApproachType {

    GPS,
    ILS,
    LDA,
    LOCALIZER,
    LOCALIZER_BACKCOURSE,
    NDB,
    NDBDME,
    RNAV,
    SDF,
    VOR,
    VORDME;

    public String value() {
        return name();
    }

    public static StApproachType fromValue(String v) {
        return valueOf(v);
    }

}
