
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
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
 * <p>Java class for DataRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataIdType" type="{http://www.mimosa.org/OSACBMV3.3.1}DataIdType"/>
 *         &lt;element name="dataType" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmDataType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="itemId" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="time" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRef", propOrder = {
    "dataIdType",
    "dataType",
    "id",
    "itemId",
    "site",
    "time"
})
public class DataRef
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected DataIdType dataIdType;
    protected OsacbmDataType dataType;
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    protected ItemId itemId;
    @XmlElement(required = true)
    protected Site site;
    @XmlElement(required = true)
    protected OsacbmTime time;

    /**
     * Gets the value of the dataIdType property.
     * 
     * @return
     *     possible object is
     *     {@link DataIdType }
     *     
     */
    public DataIdType getDataIdType() {
        return dataIdType;
    }

    /**
     * Sets the value of the dataIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataIdType }
     *     
     */
    public void setDataIdType(DataIdType value) {
        this.dataIdType = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmDataType }
     *     
     */
    public OsacbmDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmDataType }
     *     
     */
    public void setDataType(OsacbmDataType value) {
        this.dataType = value;
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
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
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
            DataIdType theDataIdType;
            theDataIdType = this.getDataIdType();
            strategy.appendField(locator, this, "dataIdType", buffer, theDataIdType);
        }
        {
            OsacbmDataType theDataType;
            theDataType = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theDataType);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
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
        if (!(object instanceof DataRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataRef that = ((DataRef) object);
        {
            DataIdType lhsDataIdType;
            lhsDataIdType = this.getDataIdType();
            DataIdType rhsDataIdType;
            rhsDataIdType = that.getDataIdType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataIdType", lhsDataIdType), LocatorUtils.property(thatLocator, "dataIdType", rhsDataIdType), lhsDataIdType, rhsDataIdType)) {
                return false;
            }
        }
        {
            OsacbmDataType lhsDataType;
            lhsDataType = this.getDataType();
            OsacbmDataType rhsDataType;
            rhsDataType = that.getDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataType", lhsDataType), LocatorUtils.property(thatLocator, "dataType", rhsDataType), lhsDataType, rhsDataType)) {
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
            ItemId lhsItemId;
            lhsItemId = this.getItemId();
            ItemId rhsItemId;
            rhsItemId = that.getItemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemId", lhsItemId), LocatorUtils.property(thatLocator, "itemId", rhsItemId), lhsItemId, rhsItemId)) {
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
            DataIdType theDataIdType;
            theDataIdType = this.getDataIdType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataIdType", theDataIdType), currentHashCode, theDataIdType);
        }
        {
            OsacbmDataType theDataType;
            theDataType = this.getDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataType", theDataType), currentHashCode, theDataType);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
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
