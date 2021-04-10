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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}grpCriteriaChildren" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="landings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="differentAirports" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="airportIcao" type="{}stString5" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctCriteria", propOrder = {
    "grpCriteriaChildren"
})
public class CtCriteria {

    @XmlElements({
        @XmlElement(name = "RewardHours", type = CtRewardHours.class),
        @XmlElement(name = "RewardAirport", type = CtRewardAirport.class),
        @XmlElement(name = "DependantRewardId", type = CtDependantRewardId.class)
    })
    protected List<Object> grpCriteriaChildren;
    @XmlAttribute(name = "landings")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger landings;
    @XmlAttribute(name = "differentAirports")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger differentAirports;
    @XmlAttribute(name = "airportIcao")
    protected String airportIcao;

    /**
     * Gets the value of the grpCriteriaChildren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grpCriteriaChildren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpCriteriaChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtRewardHours }
     * {@link CtRewardAirport }
     * {@link CtDependantRewardId }
     * 
     * 
     */
    public List<Object> getGrpCriteriaChildren() {
        if (grpCriteriaChildren == null) {
            grpCriteriaChildren = new ArrayList<Object>();
        }
        return this.grpCriteriaChildren;
    }

    /**
     * Gets the value of the landings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLandings() {
        return landings;
    }

    /**
     * Sets the value of the landings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLandings(BigInteger value) {
        this.landings = value;
    }

    /**
     * Gets the value of the differentAirports property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDifferentAirports() {
        return differentAirports;
    }

    /**
     * Sets the value of the differentAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDifferentAirports(BigInteger value) {
        this.differentAirports = value;
    }

    /**
     * Gets the value of the airportIcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportIcao() {
        return airportIcao;
    }

    /**
     * Sets the value of the airportIcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportIcao(String value) {
        this.airportIcao = value;
    }

}
