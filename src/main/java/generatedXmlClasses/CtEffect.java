//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.05 at 10:27:20 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="effectName" type="{}stString80" />
 *       &lt;attribute name="effectParams" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctEffect")
public class CtEffect {

    @XmlAttribute(name = "effectName")
    protected String effectName;
    @XmlAttribute(name = "effectParams")
    protected String effectParams;

    /**
     * Gets the value of the effectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectName() {
        return effectName;
    }

    /**
     * Sets the value of the effectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectName(String value) {
        this.effectName = value;
    }

    /**
     * Gets the value of the effectParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectParams() {
        return effectParams;
    }

    /**
     * Sets the value of the effectParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectParams(String value) {
        this.effectParams = value;
    }

}