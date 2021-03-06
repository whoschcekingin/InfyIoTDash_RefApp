
package com.ge.dsp.pm.ext.entity.strategy;

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
 * <p>Java class for StrategyTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/strategy}strategyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyTypeList", propOrder = {
    "strategyType"
})
public class StrategyTypeList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<StrategyType> strategyType;

    /**
     * Gets the value of the strategyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyType }
     * 
     * 
     */
    public List<StrategyType> getStrategyType() {
        if (strategyType == null) {
            strategyType = new ArrayList<StrategyType>();
        }
        return this.strategyType;
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
            List<StrategyType> theStrategyType;
            theStrategyType = (((this.strategyType!= null)&&(!this.strategyType.isEmpty()))?this.getStrategyType():null);
            strategy.appendField(locator, this, "strategyType", buffer, theStrategyType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrategyTypeList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrategyTypeList that = ((StrategyTypeList) object);
        {
            List<StrategyType> lhsStrategyType;
            lhsStrategyType = (((this.strategyType!= null)&&(!this.strategyType.isEmpty()))?this.getStrategyType():null);
            List<StrategyType> rhsStrategyType;
            rhsStrategyType = (((that.strategyType!= null)&&(!that.strategyType.isEmpty()))?that.getStrategyType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyType", lhsStrategyType), LocatorUtils.property(thatLocator, "strategyType", rhsStrategyType), lhsStrategyType, rhsStrategyType)) {
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
            List<StrategyType> theStrategyType;
            theStrategyType = (((this.strategyType!= null)&&(!this.strategyType.isEmpty()))?this.getStrategyType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyType", theStrategyType), currentHashCode, theStrategyType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
