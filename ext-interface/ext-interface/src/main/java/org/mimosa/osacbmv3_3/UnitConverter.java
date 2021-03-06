
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
 * <p>Java class for UnitConverter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitConverter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitConverter", propOrder = {
    "multiplier",
    "offset"
})
public class UnitConverter
    implements Serializable, Equals, HashCode, ToString
{

    protected double multiplier;
    protected double offset;

    /**
     * Gets the value of the multiplier property.
     * 
     */
    public double getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     */
    public void setMultiplier(double value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public double getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(double value) {
        this.offset = value;
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
            double theMultiplier;
            theMultiplier = (true?this.getMultiplier(): 0.0D);
            strategy.appendField(locator, this, "multiplier", buffer, theMultiplier);
        }
        {
            double theOffset;
            theOffset = (true?this.getOffset(): 0.0D);
            strategy.appendField(locator, this, "offset", buffer, theOffset);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UnitConverter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UnitConverter that = ((UnitConverter) object);
        {
            double lhsMultiplier;
            lhsMultiplier = (true?this.getMultiplier(): 0.0D);
            double rhsMultiplier;
            rhsMultiplier = (true?that.getMultiplier(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiplier", lhsMultiplier), LocatorUtils.property(thatLocator, "multiplier", rhsMultiplier), lhsMultiplier, rhsMultiplier)) {
                return false;
            }
        }
        {
            double lhsOffset;
            lhsOffset = (true?this.getOffset(): 0.0D);
            double rhsOffset;
            rhsOffset = (true?that.getOffset(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offset", lhsOffset), LocatorUtils.property(thatLocator, "offset", rhsOffset), lhsOffset, rhsOffset)) {
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
            double theMultiplier;
            theMultiplier = (true?this.getMultiplier(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiplier", theMultiplier), currentHashCode, theMultiplier);
        }
        {
            double theOffset;
            theOffset = (true?this.getOffset(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offset", theOffset), currentHashCode, theOffset);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
