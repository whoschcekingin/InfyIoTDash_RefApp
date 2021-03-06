
package com.ge.dsp.pm.ext.entity.selectionfilter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.field.FieldType;
import com.ge.dsp.pm.ext.entity.field.SearchType;
import com.ge.dsp.pm.ext.entity.fieldvalue.FieldValue;
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
 * <p>Java class for FieldTypeSelectionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldTypeSelectionFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dsp.ge.com/pm/ext/entity/selectionfilter}SelectionFilter">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}fieldType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}searchType"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fieldvalue}fieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldTypeSelectionFilter", propOrder = {
    "fieldType",
    "searchType",
    "fieldValue"
})
public class FieldTypeSelectionFilter
    extends SelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field")
    protected List<FieldType> fieldType;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field", required = true)
    protected SearchType searchType;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/fieldvalue")
    protected List<FieldValue> fieldValue;

    /**
     * Gets the value of the fieldType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldType }
     * 
     * 
     */
    public List<FieldType> getFieldType() {
        if (fieldType == null) {
            fieldType = new ArrayList<FieldType>();
        }
        return this.fieldType;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearchType(SearchType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValue }
     * 
     * 
     */
    public List<FieldValue> getFieldValue() {
        if (fieldValue == null) {
            fieldValue = new ArrayList<FieldValue>();
        }
        return this.fieldValue;
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
        super.appendFields(locator, buffer, strategy);
        {
            List<FieldType> theFieldType;
            theFieldType = (((this.fieldType!= null)&&(!this.fieldType.isEmpty()))?this.getFieldType():null);
            strategy.appendField(locator, this, "fieldType", buffer, theFieldType);
        }
        {
            SearchType theSearchType;
            theSearchType = this.getSearchType();
            strategy.appendField(locator, this, "searchType", buffer, theSearchType);
        }
        {
            List<FieldValue> theFieldValue;
            theFieldValue = (((this.fieldValue!= null)&&(!this.fieldValue.isEmpty()))?this.getFieldValue():null);
            strategy.appendField(locator, this, "fieldValue", buffer, theFieldValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldTypeSelectionFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FieldTypeSelectionFilter that = ((FieldTypeSelectionFilter) object);
        {
            List<FieldType> lhsFieldType;
            lhsFieldType = (((this.fieldType!= null)&&(!this.fieldType.isEmpty()))?this.getFieldType():null);
            List<FieldType> rhsFieldType;
            rhsFieldType = (((that.fieldType!= null)&&(!that.fieldType.isEmpty()))?that.getFieldType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldType", lhsFieldType), LocatorUtils.property(thatLocator, "fieldType", rhsFieldType), lhsFieldType, rhsFieldType)) {
                return false;
            }
        }
        {
            SearchType lhsSearchType;
            lhsSearchType = this.getSearchType();
            SearchType rhsSearchType;
            rhsSearchType = that.getSearchType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchType", lhsSearchType), LocatorUtils.property(thatLocator, "searchType", rhsSearchType), lhsSearchType, rhsSearchType)) {
                return false;
            }
        }
        {
            List<FieldValue> lhsFieldValue;
            lhsFieldValue = (((this.fieldValue!= null)&&(!this.fieldValue.isEmpty()))?this.getFieldValue():null);
            List<FieldValue> rhsFieldValue;
            rhsFieldValue = (((that.fieldValue!= null)&&(!that.fieldValue.isEmpty()))?that.getFieldValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldValue", lhsFieldValue), LocatorUtils.property(thatLocator, "fieldValue", rhsFieldValue), lhsFieldValue, rhsFieldValue)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<FieldType> theFieldType;
            theFieldType = (((this.fieldType!= null)&&(!this.fieldType.isEmpty()))?this.getFieldType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldType", theFieldType), currentHashCode, theFieldType);
        }
        {
            SearchType theSearchType;
            theSearchType = this.getSearchType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchType", theSearchType), currentHashCode, theSearchType);
        }
        {
            List<FieldValue> theFieldValue;
            theFieldValue = (((this.fieldValue!= null)&&(!this.fieldValue.isEmpty()))?this.getFieldValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldValue", theFieldValue), currentHashCode, theFieldValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
