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
 * <p>Java class for ctColoration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctColoration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="red" use="required" type="{}stColorValue" />
 *       &lt;attribute name="green" use="required" type="{}stColorValue" />
 *       &lt;attribute name="blue" use="required" type="{}stColorValue" />
 *       &lt;attribute name="alpha" type="{}stColorValue" />
 *       &lt;attribute name="override" type="{}stBool" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctColoration")
public class CtColoration {

    @XmlAttribute(name = "red", required = true)
    protected int red;
    @XmlAttribute(name = "green", required = true)
    protected int green;
    @XmlAttribute(name = "blue", required = true)
    protected int blue;
    @XmlAttribute(name = "alpha")
    protected Integer alpha;
    @XmlAttribute(name = "override")
    protected StBool override;

    /**
     * Gets the value of the red property.
     * 
     */
    public int getRed() {
        return red;
    }

    /**
     * Sets the value of the red property.
     * 
     */
    public void setRed(int value) {
        this.red = value;
    }

    /**
     * Gets the value of the green property.
     * 
     */
    public int getGreen() {
        return green;
    }

    /**
     * Sets the value of the green property.
     * 
     */
    public void setGreen(int value) {
        this.green = value;
    }

    /**
     * Gets the value of the blue property.
     * 
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Sets the value of the blue property.
     * 
     */
    public void setBlue(int value) {
        this.blue = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlpha(Integer value) {
        this.alpha = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setOverride(StBool value) {
        this.override = value;
    }

}