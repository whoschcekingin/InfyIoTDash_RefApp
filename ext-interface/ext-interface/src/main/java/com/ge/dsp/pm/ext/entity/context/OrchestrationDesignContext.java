
package com.ge.dsp.pm.ext.entity.context;

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
 * This object contains the orchestration execution
 * 				context information that is needed by the analytic core runtime
 * 				components.
 * 			
 * 
 * <p>Java class for OrchestrationDesignContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrchestrationDesignContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testModuleIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testJobInstanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrchestrationDesignContext", propOrder = {
    "testModuleIdentifier",
    "testJobInstanceIdentifier"
})
public class OrchestrationDesignContext
    implements Serializable, Equals, HashCode, ToString
{

    protected String testModuleIdentifier;
    protected String testJobInstanceIdentifier;

    /**
     * Gets the value of the testModuleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestModuleIdentifier() {
        return testModuleIdentifier;
    }

    /**
     * Sets the value of the testModuleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestModuleIdentifier(String value) {
        this.testModuleIdentifier = value;
    }

    /**
     * Gets the value of the testJobInstanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestJobInstanceIdentifier() {
        return testJobInstanceIdentifier;
    }

    /**
     * Sets the value of the testJobInstanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestJobInstanceIdentifier(String value) {
        this.testJobInstanceIdentifier = value;
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
            String theTestModuleIdentifier;
            theTestModuleIdentifier = this.getTestModuleIdentifier();
            strategy.appendField(locator, this, "testModuleIdentifier", buffer, theTestModuleIdentifier);
        }
        {
            String theTestJobInstanceIdentifier;
            theTestJobInstanceIdentifier = this.getTestJobInstanceIdentifier();
            strategy.appendField(locator, this, "testJobInstanceIdentifier", buffer, theTestJobInstanceIdentifier);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrchestrationDesignContext)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrchestrationDesignContext that = ((OrchestrationDesignContext) object);
        {
            String lhsTestModuleIdentifier;
            lhsTestModuleIdentifier = this.getTestModuleIdentifier();
            String rhsTestModuleIdentifier;
            rhsTestModuleIdentifier = that.getTestModuleIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testModuleIdentifier", lhsTestModuleIdentifier), LocatorUtils.property(thatLocator, "testModuleIdentifier", rhsTestModuleIdentifier), lhsTestModuleIdentifier, rhsTestModuleIdentifier)) {
                return false;
            }
        }
        {
            String lhsTestJobInstanceIdentifier;
            lhsTestJobInstanceIdentifier = this.getTestJobInstanceIdentifier();
            String rhsTestJobInstanceIdentifier;
            rhsTestJobInstanceIdentifier = that.getTestJobInstanceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testJobInstanceIdentifier", lhsTestJobInstanceIdentifier), LocatorUtils.property(thatLocator, "testJobInstanceIdentifier", rhsTestJobInstanceIdentifier), lhsTestJobInstanceIdentifier, rhsTestJobInstanceIdentifier)) {
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
            String theTestModuleIdentifier;
            theTestModuleIdentifier = this.getTestModuleIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testModuleIdentifier", theTestModuleIdentifier), currentHashCode, theTestModuleIdentifier);
        }
        {
            String theTestJobInstanceIdentifier;
            theTestJobInstanceIdentifier = this.getTestJobInstanceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testJobInstanceIdentifier", theTestJobInstanceIdentifier), currentHashCode, theTestJobInstanceIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
