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
 * <p>Java class for stParkingSuffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stParkingSuffix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GATE_A"/>
 *     &lt;enumeration value="GATE_B"/>
 *     &lt;enumeration value="GATE_C"/>
 *     &lt;enumeration value="GATE_D"/>
 *     &lt;enumeration value="GATE_E"/>
 *     &lt;enumeration value="GATE_F"/>
 *     &lt;enumeration value="GATE_G"/>
 *     &lt;enumeration value="GATE_H"/>
 *     &lt;enumeration value="GATE_I"/>
 *     &lt;enumeration value="GATE_J"/>
 *     &lt;enumeration value="GATE_K"/>
 *     &lt;enumeration value="GATE_L"/>
 *     &lt;enumeration value="GATE_M"/>
 *     &lt;enumeration value="GATE_N"/>
 *     &lt;enumeration value="GATE_O"/>
 *     &lt;enumeration value="GATE_P"/>
 *     &lt;enumeration value="GATE_Q"/>
 *     &lt;enumeration value="GATE_R"/>
 *     &lt;enumeration value="GATE_S"/>
 *     &lt;enumeration value="GATE_T"/>
 *     &lt;enumeration value="GATE_U"/>
 *     &lt;enumeration value="GATE_V"/>
 *     &lt;enumeration value="GATE_W"/>
 *     &lt;enumeration value="GATE_X"/>
 *     &lt;enumeration value="GATE_Y"/>
 *     &lt;enumeration value="GATE_Z"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stParkingSuffix")
@XmlEnum
public enum StParkingSuffix {

    GATE_A,
    GATE_B,
    GATE_C,
    GATE_D,
    GATE_E,
    GATE_F,
    GATE_G,
    GATE_H,
    GATE_I,
    GATE_J,
    GATE_K,
    GATE_L,
    GATE_M,
    GATE_N,
    GATE_O,
    GATE_P,
    GATE_Q,
    GATE_R,
    GATE_S,
    GATE_T,
    GATE_U,
    GATE_V,
    GATE_W,
    GATE_X,
    GATE_Y,
    GATE_Z,
    NONE;

    public String value() {
        return name();
    }

    public static StParkingSuffix fromValue(String v) {
        return valueOf(v);
    }

}