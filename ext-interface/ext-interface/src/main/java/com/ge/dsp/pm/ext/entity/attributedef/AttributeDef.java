
package com.ge.dsp.pm.ext.entity.attributedef;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * An attribute is like a column in a table or a column
 * 				in a spreadsheet or a reference in a file
 * 
 * <p>Java class for AttributeDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/attributedef}attributeType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isEnumerable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enumeration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cardinality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="display" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeDef", propOrder = {
    "id",
    "attributeType",
    "name",
    "isEnumerable",
    "enumeration",
    "unique",
    "cardinality",
    "required",
    "display"
})
public class AttributeDef
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "anySimpleType")
    protected Object id;
    @XmlElement(required = true)
    protected AttributeType attributeType;
    @XmlElement(required = true)
    protected String name;
    protected boolean isEnumerable;
    @XmlElement(required = true)
    protected String enumeration;
    protected boolean unique;
    @XmlElement(required = true)
    protected String cardinality;
    protected boolean required;
    protected boolean display;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setAttributeType(AttributeType value) {
        this.attributeType = value;
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
     * Gets the value of the isEnumerable property.
     * 
     */
    public boolean isIsEnumerable() {
        return isEnumerable;
    }

    /**
     * Sets the value of the isEnumerable property.
     * 
     */
    public void setIsEnumerable(boolean value) {
        this.isEnumerable = value;
    }

    /**
     * Gets the value of the enumeration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumeration() {
        return enumeration;
    }

    /**
     * Sets the value of the enumeration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumeration(String value) {
        this.enumeration = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the display property.
     * 
     */
    public boolean isDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     */
    public void setDisplay(boolean value) {
        this.display = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Object theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            AttributeType theAttributeType;
            theAttributeType = this.getAttributeType();
            strategy.appendField(locator, this, "attributeType", buffer, theAttributeType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            boolean theIsEnumerable;
            theIsEnumerable = (true?this.isIsEnumerable():false);
            strategy.appendField(locator, this, "isEnumerable", buffer, theIsEnumerable);
        }
        {
            String theEnumeration;
            theEnumeration = this.getEnumeration();
            strategy.appendField(locator, this, "enumeration", buffer, theEnumeration);
        }
        {
            boolean theUnique;
            theUnique = (true?this.isUnique():false);
            strategy.appendField(locator, this, "unique", buffer, theUnique);
        }
        {
            String theCardinality;
            theCardinality = this.getCardinality();
            strategy.appendField(locator, this, "cardinality", buffer, theCardinality);
        }
        {
            boolean theRequired;
            theRequired = (true?this.isRequired():false);
            strategy.appendField(locator, this, "required", buffer, theRequired);
        }
        {
            boolean theDisplay;
            theDisplay = (true?this.isDisplay():false);
            strategy.appendField(locator, this, "display", buffer, theDisplay);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AttributeDef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AttributeDef that = ((AttributeDef) object);
        {
            Object lhsId;
            lhsId = this.getId();
            Object rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            AttributeType lhsAttributeType;
            lhsAttributeType = this.getAttributeType();
            AttributeType rhsAttributeType;
            rhsAttributeType = that.getAttributeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeType", lhsAttributeType), LocatorUtils.property(thatLocator, "attributeType", rhsAttributeType), lhsAttributeType, rhsAttributeType)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            boolean lhsIsEnumerable;
            lhsIsEnumerable = (true?this.isIsEnumerable():false);
            boolean rhsIsEnumerable;
            rhsIsEnumerable = (true?that.isIsEnumerable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isEnumerable", lhsIsEnumerable), LocatorUtils.property(thatLocator, "isEnumerable", rhsIsEnumerable), lhsIsEnumerable, rhsIsEnumerable)) {
                return false;
            }
        }
        {
            String lhsEnumeration;
            lhsEnumeration = this.getEnumeration();
            String rhsEnumeration;
            rhsEnumeration = that.getEnumeration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enumeration", lhsEnumeration), LocatorUtils.property(thatLocator, "enumeration", rhsEnumeration), lhsEnumeration, rhsEnumeration)) {
                return false;
            }
        }
        {
            boolean lhsUnique;
            lhsUnique = (true?this.isUnique():false);
            boolean rhsUnique;
            rhsUnique = (true?that.isUnique():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unique", lhsUnique), LocatorUtils.property(thatLocator, "unique", rhsUnique), lhsUnique, rhsUnique)) {
                return false;
            }
        }
        {
            String lhsCardinality;
            lhsCardinality = this.getCardinality();
            String rhsCardinality;
            rhsCardinality = that.getCardinality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardinality", lhsCardinality), LocatorUtils.property(thatLocator, "cardinality", rhsCardinality), lhsCardinality, rhsCardinality)) {
                return false;
            }
        }
        {
            boolean lhsRequired;
            lhsRequired = (true?this.isRequired():false);
            boolean rhsRequired;
            rhsRequired = (true?that.isRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "required", lhsRequired), LocatorUtils.property(thatLocator, "required", rhsRequired), lhsRequired, rhsRequired)) {
                return false;
            }
        }
        {
            boolean lhsDisplay;
            lhsDisplay = (true?this.isDisplay():false);
            boolean rhsDisplay;
            rhsDisplay = (true?that.isDisplay():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Object theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            AttributeType theAttributeType;
            theAttributeType = this.getAttributeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeType", theAttributeType), currentHashCode, theAttributeType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            boolean theIsEnumerable;
            theIsEnumerable = (true?this.isIsEnumerable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isEnumerable", theIsEnumerable), currentHashCode, theIsEnumerable);
        }
        {
            String theEnumeration;
            theEnumeration = this.getEnumeration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enumeration", theEnumeration), currentHashCode, theEnumeration);
        }
        {
            boolean theUnique;
            theUnique = (true?this.isUnique():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unique", theUnique), currentHashCode, theUnique);
        }
        {
            String theCardinality;
            theCardinality = this.getCardinality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardinality", theCardinality), currentHashCode, theCardinality);
        }
        {
            boolean theRequired;
            theRequired = (true?this.isRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "required", theRequired), currentHashCode, theRequired);
        }
        {
            boolean theDisplay;
            theDisplay = (true?this.isDisplay():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "display", theDisplay), currentHashCode, theDisplay);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
