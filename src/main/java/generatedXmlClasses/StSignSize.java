//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stSignSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stSignSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIZE1"/>
 *     &lt;enumeration value="SIZE2"/>
 *     &lt;enumeration value="SIZE3"/>
 *     &lt;enumeration value="SIZE4"/>
 *     &lt;enumeration value="SIZE5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stSignSize")
@XmlEnum
public enum StSignSize {

    @XmlEnumValue("SIZE1")
    SIZE_1("SIZE1"),
    @XmlEnumValue("SIZE2")
    SIZE_2("SIZE2"),
    @XmlEnumValue("SIZE3")
    SIZE_3("SIZE3"),
    @XmlEnumValue("SIZE4")
    SIZE_4("SIZE4"),
    @XmlEnumValue("SIZE5")
    SIZE_5("SIZE5");
    private final String value;

    StSignSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StSignSize fromValue(String v) {
        for (StSignSize c: StSignSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
