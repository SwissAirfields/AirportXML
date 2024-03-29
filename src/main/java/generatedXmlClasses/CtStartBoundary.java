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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctStartBoundary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctStartBoundary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="lat" type="{}stLatitude" />
 *       &lt;attribute name="lon" type="{}stLongitude" />
 *       &lt;attribute name="altitudeMinimum" type="{}stAltitude" />
 *       &lt;attribute name="minimumAltitudeType" type="{}stAltitudeType" />
 *       &lt;attribute name="altitudeMaximum" type="{}stAltitude" />
 *       &lt;attribute name="maximumAltitudeType" type="{}stAltitudeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctStartBoundary")
public class CtStartBoundary {

    @XmlAttribute(name = "lat")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double lat;
    @XmlAttribute(name = "lon")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double lon;
    @XmlAttribute(name = "altitudeMinimum")
    protected String altitudeMinimum;
    @XmlAttribute(name = "minimumAltitudeType")
    protected StAltitudeType minimumAltitudeType;
    @XmlAttribute(name = "altitudeMaximum")
    protected String altitudeMaximum;
    @XmlAttribute(name = "maximumAltitudeType")
    protected StAltitudeType maximumAltitudeType;

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(Double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLon(Double value) {
        this.lon = value;
    }

    /**
     * Gets the value of the altitudeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeMinimum() {
        return altitudeMinimum;
    }

    /**
     * Sets the value of the altitudeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeMinimum(String value) {
        this.altitudeMinimum = value;
    }

    /**
     * Gets the value of the minimumAltitudeType property.
     * 
     * @return
     *     possible object is
     *     {@link StAltitudeType }
     *     
     */
    public StAltitudeType getMinimumAltitudeType() {
        return minimumAltitudeType;
    }

    /**
     * Sets the value of the minimumAltitudeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StAltitudeType }
     *     
     */
    public void setMinimumAltitudeType(StAltitudeType value) {
        this.minimumAltitudeType = value;
    }

    /**
     * Gets the value of the altitudeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeMaximum() {
        return altitudeMaximum;
    }

    /**
     * Sets the value of the altitudeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeMaximum(String value) {
        this.altitudeMaximum = value;
    }

    /**
     * Gets the value of the maximumAltitudeType property.
     * 
     * @return
     *     possible object is
     *     {@link StAltitudeType }
     *     
     */
    public StAltitudeType getMaximumAltitudeType() {
        return maximumAltitudeType;
    }

    /**
     * Sets the value of the maximumAltitudeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StAltitudeType }
     *     
     */
    public void setMaximumAltitudeType(StAltitudeType value) {
        this.maximumAltitudeType = value;
    }

}
