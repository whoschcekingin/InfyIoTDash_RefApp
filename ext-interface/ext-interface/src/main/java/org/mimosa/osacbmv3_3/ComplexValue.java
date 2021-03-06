
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
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
 * <p>Java class for ComplexValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Value">
 *       &lt;sequence>
 *         &lt;element name="imagValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="realValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexValue", propOrder = {
    "imagValue",
    "realValue"
})
public class ComplexValue
    extends Value
    implements Serializable, Equals, HashCode, ToString
{

    protected double imagValue;
    protected double realValue;

    /**
     * Gets the value of the imagValue property.
     * 
     */
    public double getImagValue() {
        return imagValue;
    }

    /**
     * Sets the value of the imagValue property.
     * 
     */
    public void setImagValue(double value) {
        this.imagValue = value;
    }

    /**
     * Gets the value of the realValue property.
     * 
     */
    public double getRealValue() {
        return realValue;
    }

    /**
     * Sets the value of the realValue property.
     * 
     */
    public void setRealValue(double value) {
        this.realValue = value;
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
            double theImagValue;
            theImagValue = (true?this.getImagValue(): 0.0D);
            strategy.appendField(locator, this, "imagValue", buffer, theImagValue);
        }
        {
            double theRealValue;
            theRealValue = (true?this.getRealValue(): 0.0D);
            strategy.appendField(locator, this, "realValue", buffer, theRealValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ComplexValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ComplexValue that = ((ComplexValue) object);
        {
            double lhsImagValue;
            lhsImagValue = (true?this.getImagValue(): 0.0D);
            double rhsImagValue;
            rhsImagValue = (true?that.getImagValue(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imagValue", lhsImagValue), LocatorUtils.property(thatLocator, "imagValue", rhsImagValue), lhsImagValue, rhsImagValue)) {
                return false;
            }
        }
        {
            double lhsRealValue;
            lhsRealValue = (true?this.getRealValue(): 0.0D);
            double rhsRealValue;
            rhsRealValue = (true?that.getRealValue(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realValue", lhsRealValue), LocatorUtils.property(thatLocator, "realValue", rhsRealValue), lhsRealValue, rhsRealValue)) {
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
            double theImagValue;
            theImagValue = (true?this.getImagValue(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imagValue", theImagValue), currentHashCode, theImagValue);
        }
        {
            double theRealValue;
            theRealValue = (true?this.getRealValue(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realValue", theRealValue), currentHashCode, theRealValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
