
package com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for FieldDataCriteriaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDataCriteriaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/fielddatahandler/entity/fielddatacriteria}fieldDataCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDataCriteriaList", propOrder = {
    "fieldDataCriteria"
})
public class FieldDataCriteriaList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<FieldDataCriteria> fieldDataCriteria;

    /**
     * Gets the value of the fieldDataCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldDataCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldDataCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDataCriteria }
     * 
     * 
     */
    public List<FieldDataCriteria> getFieldDataCriteria() {
        if (fieldDataCriteria == null) {
            fieldDataCriteria = new ArrayList<FieldDataCriteria>();
        }
        return this.fieldDataCriteria;
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
            List<FieldDataCriteria> theFieldDataCriteria;
            theFieldDataCriteria = (((this.fieldDataCriteria!= null)&&(!this.fieldDataCriteria.isEmpty()))?this.getFieldDataCriteria():null);
            strategy.appendField(locator, this, "fieldDataCriteria", buffer, theFieldDataCriteria);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldDataCriteriaList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldDataCriteriaList that = ((FieldDataCriteriaList) object);
        {
            List<FieldDataCriteria> lhsFieldDataCriteria;
            lhsFieldDataCriteria = (((this.fieldDataCriteria!= null)&&(!this.fieldDataCriteria.isEmpty()))?this.getFieldDataCriteria():null);
            List<FieldDataCriteria> rhsFieldDataCriteria;
            rhsFieldDataCriteria = (((that.fieldDataCriteria!= null)&&(!that.fieldDataCriteria.isEmpty()))?that.getFieldDataCriteria():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldDataCriteria", lhsFieldDataCriteria), LocatorUtils.property(thatLocator, "fieldDataCriteria", rhsFieldDataCriteria), lhsFieldDataCriteria, rhsFieldDataCriteria)) {
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
            List<FieldDataCriteria> theFieldDataCriteria;
            theFieldDataCriteria = (((this.fieldDataCriteria!= null)&&(!this.fieldDataCriteria.isEmpty()))?this.getFieldDataCriteria():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldDataCriteria", theFieldDataCriteria), currentHashCode, theFieldDataCriteria);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
