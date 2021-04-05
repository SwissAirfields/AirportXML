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
 * <p>Java class for ctRunwayDeformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctRunwayDeformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ratio" use="required" type="{}stRatio" />
 *       &lt;attribute name="alt" use="required" type="{}stAltitude" />
 *       &lt;attribute name="altType" type="{}stAltitudeTypeEG" />
 *       &lt;attribute name="controlPointBefore" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="controlPointAfter" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctRunwayDeformation")
public class CtRunwayDeformation {

    @XmlAttribute(name = "ratio", required = true)
    protected double ratio;
    @XmlAttribute(name = "alt", required = true)
    protected String alt;
    @XmlAttribute(name = "altType")
    protected StAltitudeTypeEG altType;
    @XmlAttribute(name = "controlPointBefore")
    protected Double controlPointBefore;
    @XmlAttribute(name = "controlPointAfter")
    protected Double controlPointAfter;

    /**
     * Gets the value of the ratio property.
     * 
     */
    public double getRatio() {
        return ratio;
    }

    /**
     * Sets the value of the ratio property.
     * 
     */
    public void setRatio(double value) {
        this.ratio = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    /**
     * Gets the value of the altType property.
     * 
     * @return
     *     possible object is
     *     {@link StAltitudeTypeEG }
     *     
     */
    public StAltitudeTypeEG getAltType() {
        return altType;
    }

    /**
     * Sets the value of the altType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StAltitudeTypeEG }
     *     
     */
    public void setAltType(StAltitudeTypeEG value) {
        this.altType = value;
    }

    /**
     * Gets the value of the controlPointBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getControlPointBefore() {
        return controlPointBefore;
    }

    /**
     * Sets the value of the controlPointBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setControlPointBefore(Double value) {
        this.controlPointBefore = value;
    }

    /**
     * Gets the value of the controlPointAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getControlPointAfter() {
        return controlPointAfter;
    }

    /**
     * Sets the value of the controlPointAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setControlPointAfter(Double value) {
        this.controlPointAfter = value;
    }

}
