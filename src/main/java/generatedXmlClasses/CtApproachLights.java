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


/**
 * <p>Java class for ctApproachLights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctApproachLights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="end" use="required" type="{}stEnd" />
 *       &lt;attribute name="system" type="{}stApproachLights" />
 *       &lt;attribute name="reil" type="{}stBool" />
 *       &lt;attribute name="strobes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="endLights" type="{}stBool" />
 *       &lt;attribute name="touchdown" type="{}stBool" />
 *       &lt;attribute name="snapToGround" type="{}stBool" />
 *       &lt;attribute name="spacing" type="{}stDistance" />
 *       &lt;attribute name="offset" type="{}stDistance" />
 *       &lt;attribute name="slope" type="{}stAngle" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctApproachLights")
public class CtApproachLights {

    @XmlAttribute(name = "end", required = true)
    protected StEnd end;
    @XmlAttribute(name = "system")
    protected StApproachLights system;
    @XmlAttribute(name = "reil")
    protected StBool reil;
    @XmlAttribute(name = "strobes")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger strobes;
    @XmlAttribute(name = "endLights")
    protected StBool endLights;
    @XmlAttribute(name = "touchdown")
    protected StBool touchdown;
    @XmlAttribute(name = "snapToGround")
    protected StBool snapToGround;
    @XmlAttribute(name = "spacing")
    protected String spacing;
    @XmlAttribute(name = "offset")
    protected String offset;
    @XmlAttribute(name = "slope")
    protected Double slope;

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
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link StApproachLights }
     *     
     */
    public StApproachLights getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link StApproachLights }
     *     
     */
    public void setSystem(StApproachLights value) {
        this.system = value;
    }

    /**
     * Gets the value of the reil property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getReil() {
        return reil;
    }

    /**
     * Sets the value of the reil property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setReil(StBool value) {
        this.reil = value;
    }

    /**
     * Gets the value of the strobes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrobes() {
        return strobes;
    }

    /**
     * Sets the value of the strobes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrobes(BigInteger value) {
        this.strobes = value;
    }

    /**
     * Gets the value of the endLights property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getEndLights() {
        return endLights;
    }

    /**
     * Sets the value of the endLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setEndLights(StBool value) {
        this.endLights = value;
    }

    /**
     * Gets the value of the touchdown property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getTouchdown() {
        return touchdown;
    }

    /**
     * Sets the value of the touchdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setTouchdown(StBool value) {
        this.touchdown = value;
    }

    /**
     * Gets the value of the snapToGround property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getSnapToGround() {
        return snapToGround;
    }

    /**
     * Sets the value of the snapToGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setSnapToGround(StBool value) {
        this.snapToGround = value;
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpacing() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpacing(String value) {
        this.spacing = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlope(Double value) {
        this.slope = value;
    }

}
