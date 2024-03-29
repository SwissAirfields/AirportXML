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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctArrival complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctArrival">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnrouteTransitions" type="{}ctEnrouteTransitions"/>
 *         &lt;element name="CommonRouteLegs" type="{}ctApproachLegs"/>
 *         &lt;element name="RunwayTransitions" type="{}ctRunwayTransitions"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{}stString6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctArrival", propOrder = {
    "enrouteTransitions",
    "commonRouteLegs",
    "runwayTransitions"
})
public class CtArrival {

    @XmlElement(name = "EnrouteTransitions", required = true)
    protected CtEnrouteTransitions enrouteTransitions;
    @XmlElement(name = "CommonRouteLegs", required = true)
    protected CtApproachLegs commonRouteLegs;
    @XmlElement(name = "RunwayTransitions", required = true)
    protected CtRunwayTransitions runwayTransitions;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the enrouteTransitions property.
     * 
     * @return
     *     possible object is
     *     {@link CtEnrouteTransitions }
     *     
     */
    public CtEnrouteTransitions getEnrouteTransitions() {
        return enrouteTransitions;
    }

    /**
     * Sets the value of the enrouteTransitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtEnrouteTransitions }
     *     
     */
    public void setEnrouteTransitions(CtEnrouteTransitions value) {
        this.enrouteTransitions = value;
    }

    /**
     * Gets the value of the commonRouteLegs property.
     * 
     * @return
     *     possible object is
     *     {@link CtApproachLegs }
     *     
     */
    public CtApproachLegs getCommonRouteLegs() {
        return commonRouteLegs;
    }

    /**
     * Sets the value of the commonRouteLegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtApproachLegs }
     *     
     */
    public void setCommonRouteLegs(CtApproachLegs value) {
        this.commonRouteLegs = value;
    }

    /**
     * Gets the value of the runwayTransitions property.
     * 
     * @return
     *     possible object is
     *     {@link CtRunwayTransitions }
     *     
     */
    public CtRunwayTransitions getRunwayTransitions() {
        return runwayTransitions;
    }

    /**
     * Sets the value of the runwayTransitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRunwayTransitions }
     *     
     */
    public void setRunwayTransitions(CtRunwayTransitions value) {
        this.runwayTransitions = value;
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

}
