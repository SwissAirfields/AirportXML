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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctEnrouteTransitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctEnrouteTransitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnrouteTransitionLegs" type="{}ctApproachLegs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctEnrouteTransitions", propOrder = {
    "enrouteTransitionLegs"
})
public class CtEnrouteTransitions {

    @XmlElement(name = "EnrouteTransitionLegs")
    protected List<CtApproachLegs> enrouteTransitionLegs;

    /**
     * Gets the value of the enrouteTransitionLegs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrouteTransitionLegs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrouteTransitionLegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtApproachLegs }
     * 
     * 
     */
    public List<CtApproachLegs> getEnrouteTransitionLegs() {
        if (enrouteTransitionLegs == null) {
            enrouteTransitionLegs = new ArrayList<CtApproachLegs>();
        }
        return this.enrouteTransitionLegs;
    }

}
