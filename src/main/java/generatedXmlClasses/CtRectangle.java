//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctRectangle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctRectangle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RunwayDeformation" type="{}ctRunwayDeformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Heightmap" type="{}ctHeightmap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="falloff" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="surface" type="{}stGuid" />
 *       &lt;attribute name="latitude" use="required" type="{}stLatitude" />
 *       &lt;attribute name="longitude" use="required" type="{}stLongitude" />
 *       &lt;attribute name="altitude" use="required" type="{}stAltitude" />
 *       &lt;attribute name="latitude2" use="required" type="{}stLatitude" />
 *       &lt;attribute name="longitude2" use="required" type="{}stLongitude" />
 *       &lt;attribute name="altitude2" use="required" type="{}stAltitude" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctRectangle", propOrder = {
    "runwayDeformation",
    "heightmap"
})
public class CtRectangle {

    @XmlElement(name = "RunwayDeformation")
    protected List<CtRunwayDeformation> runwayDeformation;
    @XmlElement(name = "Heightmap")
    protected List<CtHeightmap> heightmap;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "width", required = true)
    protected double width;
    @XmlAttribute(name = "falloff", required = true)
    protected double falloff;
    @XmlAttribute(name = "surface")
    protected String surface;
    @XmlAttribute(name = "latitude", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double latitude;
    @XmlAttribute(name = "longitude", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double longitude;
    @XmlAttribute(name = "altitude", required = true)
    protected String altitude;
    @XmlAttribute(name = "latitude2", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double latitude2;
    @XmlAttribute(name = "longitude2", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double longitude2;
    @XmlAttribute(name = "altitude2", required = true)
    protected String altitude2;
    @XmlAttribute(name = "priority")
    protected BigInteger priority;

    /**
     * Gets the value of the runwayDeformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayDeformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayDeformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtRunwayDeformation }
     * 
     * 
     */
    public List<CtRunwayDeformation> getRunwayDeformation() {
        if (runwayDeformation == null) {
            runwayDeformation = new ArrayList<CtRunwayDeformation>();
        }
        return this.runwayDeformation;
    }

    /**
     * Gets the value of the heightmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heightmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightmap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtHeightmap }
     * 
     * 
     */
    public List<CtHeightmap> getHeightmap() {
        if (heightmap == null) {
            heightmap = new ArrayList<CtHeightmap>();
        }
        return this.heightmap;
    }

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
     * Gets the value of the falloff property.
     * 
     */
    public double getFalloff() {
        return falloff;
    }

    /**
     * Sets the value of the falloff property.
     * 
     */
    public void setFalloff(double value) {
        this.falloff = value;
    }

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurface(String value) {
        this.surface = value;
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
     * Gets the value of the latitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLatitude2() {
        return latitude2;
    }

    /**
     * Sets the value of the latitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude2(Double value) {
        this.latitude2 = value;
    }

    /**
     * Gets the value of the longitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLongitude2() {
        return longitude2;
    }

    /**
     * Sets the value of the longitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude2(Double value) {
        this.longitude2 = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

}
