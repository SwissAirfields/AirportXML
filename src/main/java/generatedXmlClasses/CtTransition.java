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


/**
 * <p>Java class for ctTransition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctTransition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DmeArc" type="{}ctDmeArc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransitionLegs" type="{}ctApproachLegs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transitionType" type="{}stTransitionType" />
 *       &lt;attribute name="fixType" type="{}stFixType" />
 *       &lt;attribute name="fixRegion" type="{}stString2" />
 *       &lt;attribute name="fixIdent" type="{}stString5" />
 *       &lt;attribute name="altitude" type="{}stAltitude" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctTransition", propOrder = {
    "dmeArc",
    "transitionLegs"
})
public class CtTransition {

    @XmlElement(name = "DmeArc")
    protected List<CtDmeArc> dmeArc;
    @XmlElement(name = "TransitionLegs")
    protected List<CtApproachLegs> transitionLegs;
    @XmlAttribute(name = "transitionType")
    protected StTransitionType transitionType;
    @XmlAttribute(name = "fixType")
    protected StFixType fixType;
    @XmlAttribute(name = "fixRegion")
    protected String fixRegion;
    @XmlAttribute(name = "fixIdent")
    protected String fixIdent;
    @XmlAttribute(name = "altitude")
    protected String altitude;

    /**
     * Gets the value of the dmeArc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmeArc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmeArc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtDmeArc }
     * 
     * 
     */
    public List<CtDmeArc> getDmeArc() {
        if (dmeArc == null) {
            dmeArc = new ArrayList<CtDmeArc>();
        }
        return this.dmeArc;
    }

    /**
     * Gets the value of the transitionLegs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionLegs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionLegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtApproachLegs }
     * 
     * 
     */
    public List<CtApproachLegs> getTransitionLegs() {
        if (transitionLegs == null) {
            transitionLegs = new ArrayList<CtApproachLegs>();
        }
        return this.transitionLegs;
    }

    /**
     * Gets the value of the transitionType property.
     * 
     * @return
     *     possible object is
     *     {@link StTransitionType }
     *     
     */
    public StTransitionType getTransitionType() {
        return transitionType;
    }

    /**
     * Sets the value of the transitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTransitionType }
     *     
     */
    public void setTransitionType(StTransitionType value) {
        this.transitionType = value;
    }

    /**
     * Gets the value of the fixType property.
     * 
     * @return
     *     possible object is
     *     {@link StFixType }
     *     
     */
    public StFixType getFixType() {
        return fixType;
    }

    /**
     * Sets the value of the fixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StFixType }
     *     
     */
    public void setFixType(StFixType value) {
        this.fixType = value;
    }

    /**
     * Gets the value of the fixRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixRegion() {
        return fixRegion;
    }

    /**
     * Sets the value of the fixRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixRegion(String value) {
        this.fixRegion = value;
    }

    /**
     * Gets the value of the fixIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixIdent() {
        return fixIdent;
    }

    /**
     * Sets the value of the fixIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixIdent(String value) {
        this.fixIdent = value;
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

}
