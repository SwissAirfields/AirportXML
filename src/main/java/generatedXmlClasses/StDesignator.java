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
 * <p>Java class for stDesignator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stDesignator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CENTER"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="LEFT"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="RIGHT"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="WATER"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stDesignator")
@XmlEnum
public enum StDesignator {

    NONE,
    C,
    CENTER,
    L,
    LEFT,
    R,
    RIGHT,
    W,
    WATER,
    A,
    B;

    public String value() {
        return name();
    }

    public static StDesignator fromValue(String v) {
        return valueOf(v);
    }

}
