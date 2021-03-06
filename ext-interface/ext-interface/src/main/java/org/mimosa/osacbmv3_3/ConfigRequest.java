
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
 * <p>Java class for ConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mList" type="{http://www.mimosa.org/OSACBMV3.3.1}MonitorIdGroup" minOccurs="0"/>
 *         &lt;element name="rtnAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rtnConfigRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rtnModDesc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="specialReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigRequest", propOrder = {
    "mList",
    "rtnAll",
    "rtnConfigRequest",
    "rtnModDesc",
    "specialReq"
})
public class ConfigRequest
    implements Serializable, Equals, HashCode, ToString
{

    protected MonitorIdGroup mList;
    protected boolean rtnAll;
    protected Boolean rtnConfigRequest;
    protected Boolean rtnModDesc;
    protected String specialReq;

    /**
     * Gets the value of the mList property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorIdGroup }
     *     
     */
    public MonitorIdGroup getMList() {
        return mList;
    }

    /**
     * Sets the value of the mList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorIdGroup }
     *     
     */
    public void setMList(MonitorIdGroup value) {
        this.mList = value;
    }

    /**
     * Gets the value of the rtnAll property.
     * 
     */
    public boolean isRtnAll() {
        return rtnAll;
    }

    /**
     * Sets the value of the rtnAll property.
     * 
     */
    public void setRtnAll(boolean value) {
        this.rtnAll = value;
    }

    /**
     * Gets the value of the rtnConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtnConfigRequest() {
        return rtnConfigRequest;
    }

    /**
     * Sets the value of the rtnConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtnConfigRequest(Boolean value) {
        this.rtnConfigRequest = value;
    }

    /**
     * Gets the value of the rtnModDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtnModDesc() {
        return rtnModDesc;
    }

    /**
     * Sets the value of the rtnModDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtnModDesc(Boolean value) {
        this.rtnModDesc = value;
    }

    /**
     * Gets the value of the specialReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialReq() {
        return specialReq;
    }

    /**
     * Sets the value of the specialReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialReq(String value) {
        this.specialReq = value;
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
            MonitorIdGroup theMList;
            theMList = this.getMList();
            strategy.appendField(locator, this, "mList", buffer, theMList);
        }
        {
            boolean theRtnAll;
            theRtnAll = (true?this.isRtnAll():false);
            strategy.appendField(locator, this, "rtnAll", buffer, theRtnAll);
        }
        {
            Boolean theRtnConfigRequest;
            theRtnConfigRequest = this.isRtnConfigRequest();
            strategy.appendField(locator, this, "rtnConfigRequest", buffer, theRtnConfigRequest);
        }
        {
            Boolean theRtnModDesc;
            theRtnModDesc = this.isRtnModDesc();
            strategy.appendField(locator, this, "rtnModDesc", buffer, theRtnModDesc);
        }
        {
            String theSpecialReq;
            theSpecialReq = this.getSpecialReq();
            strategy.appendField(locator, this, "specialReq", buffer, theSpecialReq);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConfigRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ConfigRequest that = ((ConfigRequest) object);
        {
            MonitorIdGroup lhsMList;
            lhsMList = this.getMList();
            MonitorIdGroup rhsMList;
            rhsMList = that.getMList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mList", lhsMList), LocatorUtils.property(thatLocator, "mList", rhsMList), lhsMList, rhsMList)) {
                return false;
            }
        }
        {
            boolean lhsRtnAll;
            lhsRtnAll = (true?this.isRtnAll():false);
            boolean rhsRtnAll;
            rhsRtnAll = (true?that.isRtnAll():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rtnAll", lhsRtnAll), LocatorUtils.property(thatLocator, "rtnAll", rhsRtnAll), lhsRtnAll, rhsRtnAll)) {
                return false;
            }
        }
        {
            Boolean lhsRtnConfigRequest;
            lhsRtnConfigRequest = this.isRtnConfigRequest();
            Boolean rhsRtnConfigRequest;
            rhsRtnConfigRequest = that.isRtnConfigRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rtnConfigRequest", lhsRtnConfigRequest), LocatorUtils.property(thatLocator, "rtnConfigRequest", rhsRtnConfigRequest), lhsRtnConfigRequest, rhsRtnConfigRequest)) {
                return false;
            }
        }
        {
            Boolean lhsRtnModDesc;
            lhsRtnModDesc = this.isRtnModDesc();
            Boolean rhsRtnModDesc;
            rhsRtnModDesc = that.isRtnModDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rtnModDesc", lhsRtnModDesc), LocatorUtils.property(thatLocator, "rtnModDesc", rhsRtnModDesc), lhsRtnModDesc, rhsRtnModDesc)) {
                return false;
            }
        }
        {
            String lhsSpecialReq;
            lhsSpecialReq = this.getSpecialReq();
            String rhsSpecialReq;
            rhsSpecialReq = that.getSpecialReq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialReq", lhsSpecialReq), LocatorUtils.property(thatLocator, "specialReq", rhsSpecialReq), lhsSpecialReq, rhsSpecialReq)) {
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
            MonitorIdGroup theMList;
            theMList = this.getMList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mList", theMList), currentHashCode, theMList);
        }
        {
            boolean theRtnAll;
            theRtnAll = (true?this.isRtnAll():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rtnAll", theRtnAll), currentHashCode, theRtnAll);
        }
        {
            Boolean theRtnConfigRequest;
            theRtnConfigRequest = this.isRtnConfigRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rtnConfigRequest", theRtnConfigRequest), currentHashCode, theRtnConfigRequest);
        }
        {
            Boolean theRtnModDesc;
            theRtnModDesc = this.isRtnModDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rtnModDesc", theRtnModDesc), currentHashCode, theRtnModDesc);
        }
        {
            String theSpecialReq;
            theSpecialReq = this.getSpecialReq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialReq", theSpecialReq), currentHashCode, theSpecialReq);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
