
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for DMDataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMDataEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent">
 *       &lt;sequence>
 *         &lt;element name="dataStatus" type="{http://www.mimosa.org/OSACBMV3.3.1}DataStatus" minOccurs="0"/>
 *         &lt;element name="numAlerts" type="{http://www.mimosa.org/OSACBMV3.3.1}NumAlert" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMDataEvent", propOrder = {
    "dataStatus",
    "numAlerts"
})
@XmlSeeAlso({
    DMInt.class,
    RealFrqSpect.class,
    Ampl.class,
    CmplxWaveform.class,
    UserDef.class,
    CPB.class,
    DMBool.class,
    DMBLOBData.class,
    DMVector.class,
    DMDataSeq.class,
    RealWaveform.class,
    DMReal.class,
    CmplxFrqSpect.class
})
public class DMDataEvent
    extends DataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected DataStatus dataStatus;
    @XmlElement(nillable = true)
    protected List<NumAlert> numAlerts;

    /**
     * Gets the value of the dataStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DataStatus }
     *     
     */
    public DataStatus getDataStatus() {
        return dataStatus;
    }

    /**
     * Sets the value of the dataStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataStatus }
     *     
     */
    public void setDataStatus(DataStatus value) {
        this.dataStatus = value;
    }

    /**
     * Gets the value of the numAlerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numAlerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumAlert }
     * 
     * 
     */
    public List<NumAlert> getNumAlerts() {
        if (numAlerts == null) {
            numAlerts = new ArrayList<NumAlert>();
        }
        return this.numAlerts;
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
            DataStatus theDataStatus;
            theDataStatus = this.getDataStatus();
            strategy.appendField(locator, this, "dataStatus", buffer, theDataStatus);
        }
        {
            List<NumAlert> theNumAlerts;
            theNumAlerts = (((this.numAlerts!= null)&&(!this.numAlerts.isEmpty()))?this.getNumAlerts():null);
            strategy.appendField(locator, this, "numAlerts", buffer, theNumAlerts);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DMDataEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DMDataEvent that = ((DMDataEvent) object);
        {
            DataStatus lhsDataStatus;
            lhsDataStatus = this.getDataStatus();
            DataStatus rhsDataStatus;
            rhsDataStatus = that.getDataStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataStatus", lhsDataStatus), LocatorUtils.property(thatLocator, "dataStatus", rhsDataStatus), lhsDataStatus, rhsDataStatus)) {
                return false;
            }
        }
        {
            List<NumAlert> lhsNumAlerts;
            lhsNumAlerts = (((this.numAlerts!= null)&&(!this.numAlerts.isEmpty()))?this.getNumAlerts():null);
            List<NumAlert> rhsNumAlerts;
            rhsNumAlerts = (((that.numAlerts!= null)&&(!that.numAlerts.isEmpty()))?that.getNumAlerts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numAlerts", lhsNumAlerts), LocatorUtils.property(thatLocator, "numAlerts", rhsNumAlerts), lhsNumAlerts, rhsNumAlerts)) {
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
            DataStatus theDataStatus;
            theDataStatus = this.getDataStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataStatus", theDataStatus), currentHashCode, theDataStatus);
        }
        {
            List<NumAlert> theNumAlerts;
            theNumAlerts = (((this.numAlerts!= null)&&(!this.numAlerts.isEmpty()))?this.getNumAlerts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numAlerts", theNumAlerts), currentHashCode, theNumAlerts);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
