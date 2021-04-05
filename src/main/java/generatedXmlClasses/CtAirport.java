//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.05 at 10:27:20 PM CEST 
//


package generatedXmlClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctAirport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctAirport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}grpAirportChildren" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="country" type="{}stString48" />
 *       &lt;attribute name="state" type="{}stString48" />
 *       &lt;attribute name="city" type="{}stString48" />
 *       &lt;attribute name="name" type="{}stString48" />
 *       &lt;attribute name="region" type="{}stString48" />
 *       &lt;attribute name="lat" use="required" type="{}stLatitude" />
 *       &lt;attribute name="lon" use="required" type="{}stLongitude" />
 *       &lt;attribute name="alt" use="required" type="{}stAltitude" />
 *       &lt;attribute name="altType" type="{}stAltitudeTypeEG" />
 *       &lt;attribute name="magvar" type="{}stAngle" />
 *       &lt;attribute name="ident" use="required" type="{}stString5" />
 *       &lt;attribute name="airportTestRadius" type="{}stDistance" />
 *       &lt;attribute name="trafficScalar" type="{}stTrafficScalar" />
 *       &lt;attribute name="isOnTIN" type="{}stBool" />
 *       &lt;attribute name="onlyAddIfReplace" type="{}stBool" />
 *       &lt;attribute name="applyFlatten" type="{}stBool" />
 *       &lt;attribute name="starAirport" type="{}stBool" />
 *       &lt;attribute name="closed" type="{}stBool" />
 *       &lt;attribute name="groundMergingTransfertBright" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="groundMergingTransfertDark" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctAirport", propOrder = {
    "grpAirportChildren"
})
public class CtAirport {

    @XmlElementRefs({
        @XmlElementRef(name = "Tower", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Services", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeleteAirport", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxiwayPoint", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RunwayAlias", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ils", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxiName", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LightSupport", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Approach", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BlastFence", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LightPreset", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ApronEdgeLights", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxiwayParking", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Departure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaintedElements", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DetailPolys", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AirportGroup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxiwayPath", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProjectedMesh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Helipad", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Aprons", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ndb", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TaxiwaySign", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BoundaryFence", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Jetway", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Runway", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Arrival", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Start", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Waypoint", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> grpAirportChildren;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "country")
    protected String country;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "city")
    protected String city;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "lat", required = true)
    protected String lat;
    @XmlAttribute(name = "lon", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double lon;
    @XmlAttribute(name = "alt", required = true)
    protected String alt;
    @XmlAttribute(name = "altType")
    protected StAltitudeTypeEG altType;
    @XmlAttribute(name = "magvar")
    protected Double magvar;
    @XmlAttribute(name = "ident", required = true)
    protected String ident;
    @XmlAttribute(name = "airportTestRadius")
    protected String airportTestRadius;
    @XmlAttribute(name = "trafficScalar")
    protected Double trafficScalar;
    @XmlAttribute(name = "isOnTIN")
    protected StBool isOnTIN;
    @XmlAttribute(name = "onlyAddIfReplace")
    protected StBool onlyAddIfReplace;
    @XmlAttribute(name = "applyFlatten")
    protected StBool applyFlatten;
    @XmlAttribute(name = "starAirport")
    protected StBool starAirport;
    @XmlAttribute(name = "closed")
    protected StBool closed;
    @XmlAttribute(name = "groundMergingTransfertBright")
    protected Double groundMergingTransfertBright;
    @XmlAttribute(name = "groundMergingTransfertDark")
    protected Double groundMergingTransfertDark;

    /**
     * Gets the value of the grpAirportChildren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grpAirportChildren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpAirportChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CtTower }{@code >}
     * {@link JAXBElement }{@code <}{@link CtServices }{@code >}
     * {@link JAXBElement }{@code <}{@link CtDeleteAirport }{@code >}
     * {@link JAXBElement }{@code <}{@link CtTaxiwayPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link CtCom }{@code >}
     * {@link JAXBElement }{@code <}{@link CtRunwayAlias }{@code >}
     * {@link JAXBElement }{@code <}{@link CtIls }{@code >}
     * {@link JAXBElement }{@code <}{@link CtTaxiName }{@code >}
     * {@link JAXBElement }{@code <}{@link CtLightSupport }{@code >}
     * {@link JAXBElement }{@code <}{@link CtApproach }{@code >}
     * {@link JAXBElement }{@code <}{@link CtVectorPlacement }{@code >}
     * {@link JAXBElement }{@code <}{@link CtLightPreset }{@code >}
     * {@link JAXBElement }{@code <}{@link CtApronEdgeLights }{@code >}
     * {@link JAXBElement }{@code <}{@link CtTaxiwayParking }{@code >}
     * {@link JAXBElement }{@code <}{@link CtDeparture }{@code >}
     * {@link JAXBElement }{@code <}{@link CtPaintedElements }{@code >}
     * {@link JAXBElement }{@code <}{@link CtDetailPolys }{@code >}
     * {@link JAXBElement }{@code <}{@link CtAirportGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link CtTaxiwayPath }{@code >}
     * {@link JAXBElement }{@code <}{@link CtProjectedMesh }{@code >}
     * {@link JAXBElement }{@code <}{@link CtHelipad }{@code >}
     * {@link JAXBElement }{@code <}{@link CtAprons }{@code >}
     * {@link JAXBElement }{@code <}{@link CtNdb }{@code >}
     * {@link JAXBElement }{@code <}{@link CtTaxiwaySign }{@code >}
     * {@link JAXBElement }{@code <}{@link CtVectorPlacement }{@code >}
     * {@link JAXBElement }{@code <}{@link CtJetway }{@code >}
     * {@link JAXBElement }{@code <}{@link CtRunway }{@code >}
     * {@link JAXBElement }{@code <}{@link CtArrival }{@code >}
     * {@link JAXBElement }{@code <}{@link CtStart }{@code >}
     * {@link JAXBElement }{@code <}{@link CtWaypoint }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getGrpAirportChildren() {
        if (grpAirportChildren == null) {
            grpAirportChildren = new ArrayList<JAXBElement<?>>();
        }
        return this.grpAirportChildren;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
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
    public void setLat(String value) {
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
     * Gets the value of the airportTestRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportTestRadius() {
        return airportTestRadius;
    }

    /**
     * Sets the value of the airportTestRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportTestRadius(String value) {
        this.airportTestRadius = value;
    }

    /**
     * Gets the value of the trafficScalar property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrafficScalar() {
        return trafficScalar;
    }

    /**
     * Sets the value of the trafficScalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrafficScalar(Double value) {
        this.trafficScalar = value;
    }

    /**
     * Gets the value of the isOnTIN property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getIsOnTIN() {
        return isOnTIN;
    }

    /**
     * Sets the value of the isOnTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setIsOnTIN(StBool value) {
        this.isOnTIN = value;
    }

    /**
     * Gets the value of the onlyAddIfReplace property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getOnlyAddIfReplace() {
        return onlyAddIfReplace;
    }

    /**
     * Sets the value of the onlyAddIfReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setOnlyAddIfReplace(StBool value) {
        this.onlyAddIfReplace = value;
    }

    /**
     * Gets the value of the applyFlatten property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getApplyFlatten() {
        return applyFlatten;
    }

    /**
     * Sets the value of the applyFlatten property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setApplyFlatten(StBool value) {
        this.applyFlatten = value;
    }

    /**
     * Gets the value of the starAirport property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getStarAirport() {
        return starAirport;
    }

    /**
     * Sets the value of the starAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setStarAirport(StBool value) {
        this.starAirport = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setClosed(StBool value) {
        this.closed = value;
    }

    /**
     * Gets the value of the groundMergingTransfertBright property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGroundMergingTransfertBright() {
        return groundMergingTransfertBright;
    }

    /**
     * Sets the value of the groundMergingTransfertBright property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGroundMergingTransfertBright(Double value) {
        this.groundMergingTransfertBright = value;
    }

    /**
     * Gets the value of the groundMergingTransfertDark property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGroundMergingTransfertDark() {
        return groundMergingTransfertDark;
    }

    /**
     * Sets the value of the groundMergingTransfertDark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGroundMergingTransfertDark(Double value) {
        this.groundMergingTransfertDark = value;
    }

}