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
 * <p>Java class for stComplexity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stComplexity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERY_SPARSE"/>
 *     &lt;enumeration value="SPARSE"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="DENSE"/>
 *     &lt;enumeration value="VERY_DENSE"/>
 *     &lt;enumeration value="EXTREMELY_DENSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stComplexity")
@XmlEnum
public enum StComplexity {

    VERY_SPARSE,
    SPARSE,
    NORMAL,
    DENSE,
    VERY_DENSE,
    EXTREMELY_DENSE;

    public String value() {
        return name();
    }

    public static StComplexity fromValue(String v) {
        return valueOf(v);
    }

}
