
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
 * <p>Java class for RUL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RUL">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}ItemPrognosis">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="postConfid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rul" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RUL", propOrder = {
    "error",
    "postConfid",
    "rul"
})
public class RUL
    extends ItemPrognosis
    implements Serializable, Equals, HashCode, ToString
{

    protected Double error;
    protected Double postConfid;
    protected double rul;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setError(Double value) {
        this.error = value;
    }

    /**
     * Gets the value of the postConfid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostConfid() {
        return postConfid;
    }

    /**
     * Sets the value of the postConfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostConfid(Double value) {
        this.postConfid = value;
    }

    /**
     * Gets the value of the rul property.
     * 
     */
    public double getRul() {
        return rul;
    }

    /**
     * Sets the value of the rul property.
     * 
     */
    public void setRul(double value) {
        this.rul = value;
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
            Double theError;
            theError = this.getError();
            strategy.appendField(locator, this, "error", buffer, theError);
        }
        {
            Double thePostConfid;
            thePostConfid = this.getPostConfid();
            strategy.appendField(locator, this, "postConfid", buffer, thePostConfid);
        }
        {
            double theRul;
            theRul = (true?this.getRul(): 0.0D);
            strategy.appendField(locator, this, "rul", buffer, theRul);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RUL)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RUL that = ((RUL) object);
        {
            Double lhsError;
            lhsError = this.getError();
            Double rhsError;
            rhsError = that.getError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
                return false;
            }
        }
        {
            Double lhsPostConfid;
            lhsPostConfid = this.getPostConfid();
            Double rhsPostConfid;
            rhsPostConfid = that.getPostConfid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postConfid", lhsPostConfid), LocatorUtils.property(thatLocator, "postConfid", rhsPostConfid), lhsPostConfid, rhsPostConfid)) {
                return false;
            }
        }
        {
            double lhsRul;
            lhsRul = (true?this.getRul(): 0.0D);
            double rhsRul;
            rhsRul = (true?that.getRul(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rul", lhsRul), LocatorUtils.property(thatLocator, "rul", rhsRul), lhsRul, rhsRul)) {
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
            Double theError;
            theError = this.getError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError);
        }
        {
            Double thePostConfid;
            thePostConfid = this.getPostConfid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postConfid", thePostConfid), currentHashCode, thePostConfid);
        }
        {
            double theRul;
            theRul = (true?this.getRul(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rul", theRul), currentHashCode, theRul);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
