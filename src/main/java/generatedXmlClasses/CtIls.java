//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctIls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctIls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}grpIlsChildren" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lat" use="required" type="{}stLatitude" />
 *       &lt;attribute name="lon" use="required" type="{}stLongitude" />
 *       &lt;attribute name="alt" use="required" type="{}stAltitude" />
 *       &lt;attribute name="altType" type="{}stAltitudeTypeEG" />
 *       &lt;attribute name="heading" use="required" type="{}stHeading" />
 *       &lt;attribute name="frequency" use="required" type="{}stFrequencyMhz" />
 *       &lt;attribute name="end" type="{}stEnd" />
 *       &lt;attribute name="range" type="{}stDistance" />
 *       &lt;attribute name="magvar" use="required" type="{}stAngle" />
 *       &lt;attribute name="ident" use="required" type="{}stString5" />
 *       &lt;attribute name="width" type="{}stAngle" />
 *       &lt;attribute name="name" type="{}stString48" />
 *       &lt;attribute name="backCourse" type="{}stBool" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctIls", propOrder = {
    "grpIlsChildren"
})
public class CtIls {

    @XmlElements({
        @XmlElement(name = "GlideSlope", type = CtGlideSlope.class),
        @XmlElement(name = "Dme", type = CtDme.class),
        @XmlElement(name = "VisualModel", type = CtVisualModel.class)
    })
    protected List<Object> grpIlsChildren;
    @XmlAttribute(name = "lat", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double lat;
    @XmlAttribute(name = "lon", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double lon;
    @XmlAttribute(name = "alt", required = true)
    protected String alt;
    @XmlAttribute(name = "altType")
    protected StAltitudeTypeEG altType;
    @XmlAttribute(name = "heading", required = true)
    protected double heading;
    @XmlAttribute(name = "frequency", required = true)
    protected double frequency;
    @XmlAttribute(name = "end")
    protected StEnd end;
    @XmlAttribute(name = "range")
    protected String range;
    @XmlAttribute(name = "magvar", required = true)
    protected double magvar;
    @XmlAttribute(name = "ident", required = true)
    protected String ident;
    @XmlAttribute(name = "width")
    protected Double width;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "backCourse")
    protected StBool backCourse;

    /**
     * Gets the value of the grpIlsChildren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grpIlsChildren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpIlsChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtGlideSlope }
     * {@link CtDme }
     * {@link CtVisualModel }
     * 
     * 
     */
    public List<Object> getGrpIlsChildren() {
        if (grpIlsChildren == null) {
            grpIlsChildren = new ArrayList<Object>();
        }
        return this.grpIlsChildren;
    }

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
     * Gets the value of the frequency property.
     * 
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(double value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link StEnd }
     *     
     */
    public StEnd getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link StEnd }
     *     
     */
    public void setEnd(StEnd value) {
        this.end = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the magvar property.
     * 
     */
    public double getMagvar() {
        return magvar;
    }

    /**
     * Sets the value of the magvar property.
     * 
     */
    public void setMagvar(double value) {
        this.magvar = value;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the backCourse property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getBackCourse() {
        return backCourse;
    }

    /**
     * Sets the value of the backCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setBackCourse(StBool value) {
        this.backCourse = value;
    }

}
