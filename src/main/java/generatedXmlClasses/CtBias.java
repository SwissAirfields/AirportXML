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
 * <p>Java class for ctBias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctBias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="biasX" type="{}stDistance" />
 *       &lt;attribute name="biasY" type="{}stDistance" />
 *       &lt;attribute name="biasZ" type="{}stDistance" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctBias")
public class CtBias {

    @XmlAttribute(name = "biasX")
    protected String biasX;
    @XmlAttribute(name = "biasY")
    protected String biasY;
    @XmlAttribute(name = "biasZ")
    protected String biasZ;

    /**
     * Gets the value of the biasX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiasX() {
        return biasX;
    }

    /**
     * Sets the value of the biasX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasX(String value) {
        this.biasX = value;
    }

    /**
     * Gets the value of the biasY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiasY() {
        return biasY;
    }

    /**
     * Sets the value of the biasY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasY(String value) {
        this.biasY = value;
    }

    /**
     * Gets the value of the biasZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiasZ() {
        return biasZ;
    }

    /**
     * Sets the value of the biasZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasZ(String value) {
        this.biasZ = value;
    }

}
