
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for CmplxArrayValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmplxArrayValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Value">
 *       &lt;sequence>
 *         &lt;element name="imagValues" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="realValues" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmplxArrayValue", propOrder = {
    "imagValues",
    "realValues"
})
public class CmplxArrayValue
    extends Value
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(type = Double.class)
    protected List<Double> imagValues;
    @XmlElement(type = Double.class)
    protected List<Double> realValues;

    /**
     * Gets the value of the imagValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getImagValues() {
        if (imagValues == null) {
            imagValues = new ArrayList<Double>();
        }
        return this.imagValues;
    }

    /**
     * Gets the value of the realValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRealValues() {
        if (realValues == null) {
            realValues = new ArrayList<Double>();
        }
        return this.realValues;
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
            List<Double> theImagValues;
            theImagValues = (((this.imagValues!= null)&&(!this.imagValues.isEmpty()))?this.getImagValues():null);
            strategy.appendField(locator, this, "imagValues", buffer, theImagValues);
        }
        {
            List<Double> theRealValues;
            theRealValues = (((this.realValues!= null)&&(!this.realValues.isEmpty()))?this.getRealValues():null);
            strategy.appendField(locator, this, "realValues", buffer, theRealValues);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CmplxArrayValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CmplxArrayValue that = ((CmplxArrayValue) object);
        {
            List<Double> lhsImagValues;
            lhsImagValues = (((this.imagValues!= null)&&(!this.imagValues.isEmpty()))?this.getImagValues():null);
            List<Double> rhsImagValues;
            rhsImagValues = (((that.imagValues!= null)&&(!that.imagValues.isEmpty()))?that.getImagValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imagValues", lhsImagValues), LocatorUtils.property(thatLocator, "imagValues", rhsImagValues), lhsImagValues, rhsImagValues)) {
                return false;
            }
        }
        {
            List<Double> lhsRealValues;
            lhsRealValues = (((this.realValues!= null)&&(!this.realValues.isEmpty()))?this.getRealValues():null);
            List<Double> rhsRealValues;
            rhsRealValues = (((that.realValues!= null)&&(!that.realValues.isEmpty()))?that.getRealValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realValues", lhsRealValues), LocatorUtils.property(thatLocator, "realValues", rhsRealValues), lhsRealValues, rhsRealValues)) {
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
            List<Double> theImagValues;
            theImagValues = (((this.imagValues!= null)&&(!this.imagValues.isEmpty()))?this.getImagValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imagValues", theImagValues), currentHashCode, theImagValues);
        }
        {
            List<Double> theRealValues;
            theRealValues = (((this.realValues!= null)&&(!this.realValues.isEmpty()))?this.getRealValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realValues", theRealValues), currentHashCode, theRealValues);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
