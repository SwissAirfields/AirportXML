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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctVor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctVor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dme" type="{}ctDme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VisualModel" type="{}ctVisualModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lat" type="{}stLatitude" />
 *       &lt;attribute name="lon" type="{}stLongitude" />
 *       &lt;attribute name="alt" type="{}stAltitude" />
 *       &lt;attribute name="altType" type="{}stAltitudeTypeEG" />
 *       &lt;attribute name="type" type="{}stVorType" />
 *       &lt;attribute name="frequency" type="{}stFrequencyMhz" />
 *       &lt;attribute name="magvar" type="{}stAngle" />
 *       &lt;attribute name="range" type="{}stDistance" />
 *       &lt;attribute name="region" type="{}stString2" />
 *       &lt;attribute name="ident" type="{}stString5" />
 *       &lt;attribute name="name" type="{}stString48" />
 *       &lt;attribute name="nav" type="{}stBool" />
 *       &lt;attribute name="dmeOnly" type="{}stBool" />
 *       &lt;attribute name="dme" type="{}stBool" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctVor", propOrder = {
    "dme",
    "visualModel"
})
public class CtVor {

    @XmlElement(name = "Dme")
    protected List<CtDme> dme;
    @XmlElement(name = "VisualModel")
    protected List<CtVisualModel> visualModel;
    @XmlAttribute(name = "lat")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double lat;
    @XmlAttribute(name = "lon")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double lon;
    @XmlAttribute(name = "alt")
    protected String alt;
    @XmlAttribute(name = "altType")
    protected StAltitudeTypeEG altType;
    @XmlAttribute(name = "type")
    protected StVorType type;
    @XmlAttribute(name = "frequency")
    protected Double frequency;
    @XmlAttribute(name = "magvar")
    protected Double magvar;
    @XmlAttribute(name = "range")
    protected String range;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nav")
    protected StBool nav;
    @XmlAttribute(name = "dmeOnly")
    protected StBool dmeOnly;
    @XmlAttribute(name = "dme")
    protected StBool hasDme;

    /**
     * Gets the value of the dme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtDme }
     * 
     * 
     */
    public List<CtDme> getDme() {
        if (dme == null) {
            dme = new ArrayList<CtDme>();
        }
        return this.dme;
    }

    /**
     * Gets the value of the visualModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtVisualModel }
     * 
     * 
     */
    public List<CtVisualModel> getVisualModel() {
        if (visualModel == null) {
            visualModel = new ArrayList<CtVisualModel>();
        }
        return this.visualModel;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StVorType }
     *     
     */
    public StVorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StVorType }
     *     
     */
    public void setType(StVorType value) {
        this.type = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrequency(Double value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the magvar property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMagvar() {
        return magvar;
    }

    /**
     * Sets the value of the magvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMagvar(Double value) {
        this.magvar = value;
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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
     * Gets the value of the nav property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getNav() {
        return nav;
    }

    /**
     * Sets the value of the nav property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setNav(StBool value) {
        this.nav = value;
    }

    /**
     * Gets the value of the dmeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getDmeOnly() {
        return dmeOnly;
    }

    /**
     * Sets the value of the dmeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setDmeOnly(StBool value) {
        this.dmeOnly = value;
    }

    /**
     * Gets the value of the hasDme property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getHasDme() {
        return hasDme;
    }

    /**
     * Sets the value of the hasDme property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setHasDme(StBool value) {
        this.hasDme = value;
    }

}
