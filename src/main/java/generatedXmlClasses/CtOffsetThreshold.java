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
 * <p>Java class for ctOffsetThreshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctOffsetThreshold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="end" use="required" type="{}stEnd" />
 *       &lt;attribute name="length" use="required" type="{}stDistance" />
 *       &lt;attribute name="width" type="{}stDistance" />
 *       &lt;attribute name="surface" type="{}stSurface" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctOffsetThreshold")
public class CtOffsetThreshold {

    @XmlAttribute(name = "end", required = true)
    protected StEnd end;
    @XmlAttribute(name = "length", required = true)
    protected String length;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "surface")
    protected String surface;

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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
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

}
