
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.osa.errordataevent.ErrorDataEvent;
import org.codehaus.jackson.annotate.JsonTypeInfo;
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
 * <p>Java class for DataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="confid" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="sequenceNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataEvent", propOrder = {
    "alertStatus",
    "confid",
    "id",
    "sequenceNum",
    "site",
    "time"
})
@XmlSeeAlso({
    AGDataEvent.class,
    HADataEvent.class,
    PADataEvent.class,
    SDDataEvent.class,
    DADataEvent.class,
    DMDataEvent.class,
    ErrorDataEvent.class
})
@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, use = JsonTypeInfo.Id.NAME, property = "@type")
public class DataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected Boolean alertStatus;
    protected Float confid;
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNum;
    protected Site site;
    protected OsacbmTime time;

    /**
     * Gets the value of the alertStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertStatus() {
        return alertStatus;
    }

    /**
     * Sets the value of the alertStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertStatus(Boolean value) {
        this.alertStatus = value;
    }

    /**
     * Gets the value of the confid property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConfid() {
        return confid;
    }

    /**
     * Sets the value of the confid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConfid(Float value) {
        this.confid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the sequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Sets the value of the sequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNum(Long value) {
        this.sequenceNum = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setTime(OsacbmTime value) {
        this.time = value;
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
            Boolean theAlertStatus;
            theAlertStatus = this.isAlertStatus();
            strategy.appendField(locator, this, "alertStatus", buffer, theAlertStatus);
        }
        {
            Float theConfid;
            theConfid = this.getConfid();
            strategy.appendField(locator, this, "confid", buffer, theConfid);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Long theSequenceNum;
            theSequenceNum = this.getSequenceNum();
            strategy.appendField(locator, this, "sequenceNum", buffer, theSequenceNum);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            OsacbmTime theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DataEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataEvent that = ((DataEvent) object);
        {
            Boolean lhsAlertStatus;
            lhsAlertStatus = this.isAlertStatus();
            Boolean rhsAlertStatus;
            rhsAlertStatus = that.isAlertStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertStatus", lhsAlertStatus), LocatorUtils.property(thatLocator, "alertStatus", rhsAlertStatus), lhsAlertStatus, rhsAlertStatus)) {
                return false;
            }
        }
        {
            Float lhsConfid;
            lhsConfid = this.getConfid();
            Float rhsConfid;
            rhsConfid = that.getConfid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confid", lhsConfid), LocatorUtils.property(thatLocator, "confid", rhsConfid), lhsConfid, rhsConfid)) {
                return false;
            }
        }
        {
            long lhsId;
            lhsId = (true?this.getId(): 0L);
            long rhsId;
            rhsId = (true?that.getId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            Long lhsSequenceNum;
            lhsSequenceNum = this.getSequenceNum();
            Long rhsSequenceNum;
            rhsSequenceNum = that.getSequenceNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNum", lhsSequenceNum), LocatorUtils.property(thatLocator, "sequenceNum", rhsSequenceNum), lhsSequenceNum, rhsSequenceNum)) {
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
            OsacbmTime lhsTime;
            lhsTime = this.getTime();
            OsacbmTime rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
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
            Boolean theAlertStatus;
            theAlertStatus = this.isAlertStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertStatus", theAlertStatus), currentHashCode, theAlertStatus);
        }
        {
            Float theConfid;
            theConfid = this.getConfid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confid", theConfid), currentHashCode, theConfid);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            Long theSequenceNum;
            theSequenceNum = this.getSequenceNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNum", theSequenceNum), currentHashCode, theSequenceNum);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            OsacbmTime theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
