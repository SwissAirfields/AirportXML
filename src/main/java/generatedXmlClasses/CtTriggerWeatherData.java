//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctTriggerWeatherData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctTriggerWeatherData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" type="{}stTriggerWeatherDataType" />
 *       &lt;attribute name="heading" type="{}stHeading" />
 *       &lt;attribute name="scalar" type="{}stTriggerWeatherDataScalar" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctTriggerWeatherData")
public class CtTriggerWeatherData {

    @XmlAttribute(name = "type")
    protected StTriggerWeatherDataType type;
    @XmlAttribute(name = "heading")
    protected Double heading;
    @XmlAttribute(name = "scalar")
    protected Double scalar;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StTriggerWeatherDataType }
     *     
     */
    public StTriggerWeatherDataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTriggerWeatherDataType }
     *     
     */
    public void setType(StTriggerWeatherDataType value) {
        this.type = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeading(Double value) {
        this.heading = value;
    }

    /**
     * Gets the value of the scalar property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScalar() {
        return scalar;
    }

    /**
     * Sets the value of the scalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScalar(Double value) {
        this.scalar = value;
    }

}
