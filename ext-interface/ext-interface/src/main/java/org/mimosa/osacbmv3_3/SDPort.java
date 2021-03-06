
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
 * <p>Java class for SDPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDPort">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Port">
 *       &lt;sequence>
 *         &lt;element name="alertRegs" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measLoc" type="{http://www.mimosa.org/OSACBMV3.3.1}MeasLoc" minOccurs="0"/>
 *         &lt;element name="measureEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="stateEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="itemEventConfig" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemEventConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDPort", propOrder = {
    "alertRegs",
    "measLoc",
    "measureEU",
    "stateEU",
    "itemEventConfig"
})
public class SDPort
    extends Port
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<AlertRegion> alertRegs;
    protected MeasLoc measLoc;
    protected EngUnit measureEU;
    protected EngUnit stateEU;
    @XmlElement(nillable = true)
    protected List<ItemEventConfig> itemEventConfig;

    /**
     * Gets the value of the alertRegs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertRegs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertRegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertRegion }
     * 
     * 
     */
    public List<AlertRegion> getAlertRegs() {
        if (alertRegs == null) {
            alertRegs = new ArrayList<AlertRegion>();
        }
        return this.alertRegs;
    }

    /**
     * Gets the value of the measLoc property.
     * 
     * @return
     *     possible object is
     *     {@link MeasLoc }
     *     
     */
    public MeasLoc getMeasLoc() {
        return measLoc;
    }

    /**
     * Sets the value of the measLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasLoc }
     *     
     */
    public void setMeasLoc(MeasLoc value) {
        this.measLoc = value;
    }

    /**
     * Gets the value of the measureEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getMeasureEU() {
        return measureEU;
    }

    /**
     * Sets the value of the measureEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setMeasureEU(EngUnit value) {
        this.measureEU = value;
    }

    /**
     * Gets the value of the stateEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getStateEU() {
        return stateEU;
    }

    /**
     * Sets the value of the stateEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setStateEU(EngUnit value) {
        this.stateEU = value;
    }

    /**
     * Gets the value of the itemEventConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEventConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEventConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEventConfig }
     * 
     * 
     */
    public List<ItemEventConfig> getItemEventConfig() {
        if (itemEventConfig == null) {
            itemEventConfig = new ArrayList<ItemEventConfig>();
        }
        return this.itemEventConfig;
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
            List<AlertRegion> theAlertRegs;
            theAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            strategy.appendField(locator, this, "alertRegs", buffer, theAlertRegs);
        }
        {
            MeasLoc theMeasLoc;
            theMeasLoc = this.getMeasLoc();
            strategy.appendField(locator, this, "measLoc", buffer, theMeasLoc);
        }
        {
            EngUnit theMeasureEU;
            theMeasureEU = this.getMeasureEU();
            strategy.appendField(locator, this, "measureEU", buffer, theMeasureEU);
        }
        {
            EngUnit theStateEU;
            theStateEU = this.getStateEU();
            strategy.appendField(locator, this, "stateEU", buffer, theStateEU);
        }
        {
            List<ItemEventConfig> theItemEventConfig;
            theItemEventConfig = (((this.itemEventConfig!= null)&&(!this.itemEventConfig.isEmpty()))?this.getItemEventConfig():null);
            strategy.appendField(locator, this, "itemEventConfig", buffer, theItemEventConfig);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SDPort)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SDPort that = ((SDPort) object);
        {
            List<AlertRegion> lhsAlertRegs;
            lhsAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            List<AlertRegion> rhsAlertRegs;
            rhsAlertRegs = (((that.alertRegs!= null)&&(!that.alertRegs.isEmpty()))?that.getAlertRegs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertRegs", lhsAlertRegs), LocatorUtils.property(thatLocator, "alertRegs", rhsAlertRegs), lhsAlertRegs, rhsAlertRegs)) {
                return false;
            }
        }
        {
            MeasLoc lhsMeasLoc;
            lhsMeasLoc = this.getMeasLoc();
            MeasLoc rhsMeasLoc;
            rhsMeasLoc = that.getMeasLoc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measLoc", lhsMeasLoc), LocatorUtils.property(thatLocator, "measLoc", rhsMeasLoc), lhsMeasLoc, rhsMeasLoc)) {
                return false;
            }
        }
        {
            EngUnit lhsMeasureEU;
            lhsMeasureEU = this.getMeasureEU();
            EngUnit rhsMeasureEU;
            rhsMeasureEU = that.getMeasureEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measureEU", lhsMeasureEU), LocatorUtils.property(thatLocator, "measureEU", rhsMeasureEU), lhsMeasureEU, rhsMeasureEU)) {
                return false;
            }
        }
        {
            EngUnit lhsStateEU;
            lhsStateEU = this.getStateEU();
            EngUnit rhsStateEU;
            rhsStateEU = that.getStateEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateEU", lhsStateEU), LocatorUtils.property(thatLocator, "stateEU", rhsStateEU), lhsStateEU, rhsStateEU)) {
                return false;
            }
        }
        {
            List<ItemEventConfig> lhsItemEventConfig;
            lhsItemEventConfig = (((this.itemEventConfig!= null)&&(!this.itemEventConfig.isEmpty()))?this.getItemEventConfig():null);
            List<ItemEventConfig> rhsItemEventConfig;
            rhsItemEventConfig = (((that.itemEventConfig!= null)&&(!that.itemEventConfig.isEmpty()))?that.getItemEventConfig():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemEventConfig", lhsItemEventConfig), LocatorUtils.property(thatLocator, "itemEventConfig", rhsItemEventConfig), lhsItemEventConfig, rhsItemEventConfig)) {
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
            List<AlertRegion> theAlertRegs;
            theAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertRegs", theAlertRegs), currentHashCode, theAlertRegs);
        }
        {
            MeasLoc theMeasLoc;
            theMeasLoc = this.getMeasLoc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measLoc", theMeasLoc), currentHashCode, theMeasLoc);
        }
        {
            EngUnit theMeasureEU;
            theMeasureEU = this.getMeasureEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measureEU", theMeasureEU), currentHashCode, theMeasureEU);
        }
        {
            EngUnit theStateEU;
            theStateEU = this.getStateEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateEU", theStateEU), currentHashCode, theStateEU);
        }
        {
            List<ItemEventConfig> theItemEventConfig;
            theItemEventConfig = (((this.itemEventConfig!= null)&&(!this.itemEventConfig.isEmpty()))?this.getItemEventConfig():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemEventConfig", theItemEventConfig), currentHashCode, theItemEventConfig);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
