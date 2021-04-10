//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctLightSupport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctLightSupport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="latitude" use="required" type="{}stLatitude" />
 *       &lt;attribute name="longitude" use="required" type="{}stLongitude" />
 *       &lt;attribute name="altitude" use="required" type="{}stAltitude" />
 *       &lt;attribute name="altitude2" use="required" type="{}stAltitude" />
 *       &lt;attribute name="heading" use="required" type="{}stHeading" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="excludeLights" type="{}stBool" />
 *       &lt;attribute name="excludeLightObjects" type="{}stBool" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctLightSupport")
public class CtLightSupport {

    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "parentGroupID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentGroupID;
    @XmlAttribute(name = "groupIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupIndex;
    @XmlAttribute(name = "latitude", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double latitude;
    @XmlAttribute(name = "longitude", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double longitude;
    @XmlAttribute(name = "altitude", required = true)
    protected String altitude;
    @XmlAttribute(name = "altitude2", required = true)
    protected String altitude2;
    @XmlAttribute(name = "heading", required = true)
    protected double heading;
    @XmlAttribute(name = "width", required = true)
    protected double width;
    @XmlAttribute(name = "length", required = true)
    protected double length;
    @XmlAttribute(name = "excludeLights")
    protected StBool excludeLights;
    @XmlAttribute(name = "excludeLightObjects")
    protected StBool excludeLightObjects;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the parentGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentGroupID() {
        return parentGroupID;
    }

    /**
     * Sets the value of the parentGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentGroupID(BigInteger value) {
        this.parentGroupID = value;
    }

    /**
     * Gets the value of the groupIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupIndex() {
        return groupIndex;
    }

    /**
     * Sets the value of the groupIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupIndex(BigInteger value) {
        this.groupIndex = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitude(String value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the altitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitude2() {
        return altitude2;
    }

    /**
     * Sets the value of the altitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitude2(String value) {
        this.altitude2 = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     */
    public double getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     */
    public void setHeading(double value) {
        this.heading = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
    }

    /**
     * Gets the value of the excludeLights property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getExcludeLights() {
        return excludeLights;
    }

    /**
     * Sets the value of the excludeLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setExcludeLights(StBool value) {
        this.excludeLights = value;
    }

    /**
     * Gets the value of the excludeLightObjects property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getExcludeLightObjects() {
        return excludeLightObjects;
    }

    /**
     * Sets the value of the excludeLightObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setExcludeLightObjects(StBool value) {
        this.excludeLightObjects = value;
    }

}
