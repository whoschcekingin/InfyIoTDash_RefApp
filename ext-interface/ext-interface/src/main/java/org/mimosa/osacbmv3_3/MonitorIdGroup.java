
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for MonitorIdGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorIdGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertFilter" type="{http://www.mimosa.org/OSACBMV3.3.1}ALERT_FILTER_SETTING" minOccurs="0"/>
 *         &lt;element name="dataEventSetId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="monitorId" type="{http://www.mimosa.org/OSACBMV3.3.1}MonitorId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeSelect" type="{http://www.mimosa.org/OSACBMV3.3.1}TimeSelect" minOccurs="0"/>
 *         &lt;element name="sequenceSelect" type="{http://www.mimosa.org/OSACBMV3.3.1}SequenceSelect" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorIdGroup", propOrder = {
    "alertFilter",
    "dataEventSetId",
    "site",
    "monitorId",
    "timeSelect",
    "sequenceSelect"
})
public class MonitorIdGroup
    implements Serializable, Equals, HashCode, ToString
{

    protected ALERTFILTERSETTING alertFilter;
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataEventSetId;
    @XmlElement(required = true)
    protected Site site;
    @XmlElement(nillable = true)
    protected List<MonitorId> monitorId;
    protected TimeSelect timeSelect;
    protected SequenceSelect sequenceSelect;

    /**
     * Gets the value of the alertFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ALERTFILTERSETTING }
     *     
     */
    public ALERTFILTERSETTING getAlertFilter() {
        return alertFilter;
    }

    /**
     * Sets the value of the alertFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALERTFILTERSETTING }
     *     
     */
    public void setAlertFilter(ALERTFILTERSETTING value) {
        this.alertFilter = value;
    }

    /**
     * Gets the value of the dataEventSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataEventSetId() {
        return dataEventSetId;
    }

    /**
     * Sets the value of the dataEventSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataEventSetId(Long value) {
        this.dataEventSetId = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

    /**
     * Gets the value of the monitorId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitorId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitorId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitorId }
     * 
     * 
     */
    public List<MonitorId> getMonitorId() {
        if (monitorId == null) {
            monitorId = new ArrayList<MonitorId>();
        }
        return this.monitorId;
    }

    /**
     * Gets the value of the timeSelect property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSelect }
     *     
     */
    public TimeSelect getTimeSelect() {
        return timeSelect;
    }

    /**
     * Sets the value of the timeSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSelect }
     *     
     */
    public void setTimeSelect(TimeSelect value) {
        this.timeSelect = value;
    }

    /**
     * Gets the value of the sequenceSelect property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceSelect }
     *     
     */
    public SequenceSelect getSequenceSelect() {
        return sequenceSelect;
    }

    /**
     * Sets the value of the sequenceSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceSelect }
     *     
     */
    public void setSequenceSelect(SequenceSelect value) {
        this.sequenceSelect = value;
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
            ALERTFILTERSETTING theAlertFilter;
            theAlertFilter = this.getAlertFilter();
            strategy.appendField(locator, this, "alertFilter", buffer, theAlertFilter);
        }
        {
            Long theDataEventSetId;
            theDataEventSetId = this.getDataEventSetId();
            strategy.appendField(locator, this, "dataEventSetId", buffer, theDataEventSetId);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            List<MonitorId> theMonitorId;
            theMonitorId = (((this.monitorId!= null)&&(!this.monitorId.isEmpty()))?this.getMonitorId():null);
            strategy.appendField(locator, this, "monitorId", buffer, theMonitorId);
        }
        {
            TimeSelect theTimeSelect;
            theTimeSelect = this.getTimeSelect();
            strategy.appendField(locator, this, "timeSelect", buffer, theTimeSelect);
        }
        {
            SequenceSelect theSequenceSelect;
            theSequenceSelect = this.getSequenceSelect();
            strategy.appendField(locator, this, "sequenceSelect", buffer, theSequenceSelect);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MonitorIdGroup)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MonitorIdGroup that = ((MonitorIdGroup) object);
        {
            ALERTFILTERSETTING lhsAlertFilter;
            lhsAlertFilter = this.getAlertFilter();
            ALERTFILTERSETTING rhsAlertFilter;
            rhsAlertFilter = that.getAlertFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertFilter", lhsAlertFilter), LocatorUtils.property(thatLocator, "alertFilter", rhsAlertFilter), lhsAlertFilter, rhsAlertFilter)) {
                return false;
            }
        }
        {
            Long lhsDataEventSetId;
            lhsDataEventSetId = this.getDataEventSetId();
            Long rhsDataEventSetId;
            rhsDataEventSetId = that.getDataEventSetId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataEventSetId", lhsDataEventSetId), LocatorUtils.property(thatLocator, "dataEventSetId", rhsDataEventSetId), lhsDataEventSetId, rhsDataEventSetId)) {
                return false;
            }
        }
        {
            Site lhsSite;
            lhsSite = this.getSite();
            Site rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
                return false;
            }
        }
        {
            List<MonitorId> lhsMonitorId;
            lhsMonitorId = (((this.monitorId!= null)&&(!this.monitorId.isEmpty()))?this.getMonitorId():null);
            List<MonitorId> rhsMonitorId;
            rhsMonitorId = (((that.monitorId!= null)&&(!that.monitorId.isEmpty()))?that.getMonitorId():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monitorId", lhsMonitorId), LocatorUtils.property(thatLocator, "monitorId", rhsMonitorId), lhsMonitorId, rhsMonitorId)) {
                return false;
            }
        }
        {
            TimeSelect lhsTimeSelect;
            lhsTimeSelect = this.getTimeSelect();
            TimeSelect rhsTimeSelect;
            rhsTimeSelect = that.getTimeSelect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeSelect", lhsTimeSelect), LocatorUtils.property(thatLocator, "timeSelect", rhsTimeSelect), lhsTimeSelect, rhsTimeSelect)) {
                return false;
            }
        }
        {
            SequenceSelect lhsSequenceSelect;
            lhsSequenceSelect = this.getSequenceSelect();
            SequenceSelect rhsSequenceSelect;
            rhsSequenceSelect = that.getSequenceSelect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceSelect", lhsSequenceSelect), LocatorUtils.property(thatLocator, "sequenceSelect", rhsSequenceSelect), lhsSequenceSelect, rhsSequenceSelect)) {
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
            ALERTFILTERSETTING theAlertFilter;
            theAlertFilter = this.getAlertFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertFilter", theAlertFilter), currentHashCode, theAlertFilter);
        }
        {
            Long theDataEventSetId;
            theDataEventSetId = this.getDataEventSetId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataEventSetId", theDataEventSetId), currentHashCode, theDataEventSetId);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            List<MonitorId> theMonitorId;
            theMonitorId = (((this.monitorId!= null)&&(!this.monitorId.isEmpty()))?this.getMonitorId():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monitorId", theMonitorId), currentHashCode, theMonitorId);
        }
        {
            TimeSelect theTimeSelect;
            theTimeSelect = this.getTimeSelect();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeSelect", theTimeSelect), currentHashCode, theTimeSelect);
        }
        {
            SequenceSelect theSequenceSelect;
            theSequenceSelect = this.getSequenceSelect();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceSelect", theSequenceSelect), currentHashCode, theSequenceSelect);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
