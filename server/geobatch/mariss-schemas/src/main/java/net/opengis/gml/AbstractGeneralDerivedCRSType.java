//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A coordinate reference system that is defined by its coordinate conversion from another coordinate reference system (not by a datum). This abstract complexType shall not be used, extended, or restricted, in an Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document. 
 * 
 * <p>Java class for AbstractGeneralDerivedCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralDerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}baseCRS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}definedByConversion"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", propOrder = {
    "baseCRS",
    "definedByConversion"
})
@XmlSeeAlso({
    DerivedCRSType.class,
    ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType
    extends AbstractReferenceSystemType
{

    @XmlElement(required = true)
    protected CoordinateReferenceSystemRefType baseCRS;
    @XmlElement(required = true)
    protected GeneralConversionRefType definedByConversion;

    /**
     * Gets the value of the baseCRS property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateReferenceSystemRefType }
     *     
     */
    public CoordinateReferenceSystemRefType getBaseCRS() {
        return baseCRS;
    }

    /**
     * Sets the value of the baseCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateReferenceSystemRefType }
     *     
     */
    public void setBaseCRS(CoordinateReferenceSystemRefType value) {
        this.baseCRS = value;
    }

    /**
     * Gets the value of the definedByConversion property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralConversionRefType }
     *     
     */
    public GeneralConversionRefType getDefinedByConversion() {
        return definedByConversion;
    }

    /**
     * Sets the value of the definedByConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralConversionRefType }
     *     
     */
    public void setDefinedByConversion(GeneralConversionRefType value) {
        this.definedByConversion = value;
    }

}
