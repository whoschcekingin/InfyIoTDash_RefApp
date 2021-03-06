
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
 * <p>Java class for AlgorithmInputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmInputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="dataContentType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedDataType" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmDataType" minOccurs="0"/>
 *         &lt;element name="expectedEu" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit"/>
 *         &lt;element name="inputRef" type="{http://www.mimosa.org/OSACBMV3.3.1}MonitorId"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmInputData", propOrder = {
    "argId",
    "dataContentType",
    "desc",
    "expectedDataType",
    "expectedEu",
    "inputRef",
    "name",
    "userTag"
})
public class AlgorithmInputData
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected long argId;
    protected MIMKey3 dataContentType;
    protected String desc;
    protected OsacbmDataType expectedDataType;
    @XmlElement(required = true)
    protected EngUnit expectedEu;
    @XmlElement(required = true)
    protected MonitorId inputRef;
    protected String name;
    protected String userTag;

    /**
     * Gets the value of the argId property.
     * 
     */
    public long getArgId() {
        return argId;
    }

    /**
     * Sets the value of the argId property.
     * 
     */
    public void setArgId(long value) {
        this.argId = value;
    }

    /**
     * Gets the value of the dataContentType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getDataContentType() {
        return dataContentType;
    }

    /**
     * Sets the value of the dataContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setDataContentType(MIMKey3 value) {
        this.dataContentType = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the expectedDataType property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmDataType }
     *     
     */
    public OsacbmDataType getExpectedDataType() {
        return expectedDataType;
    }

    /**
     * Sets the value of the expectedDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmDataType }
     *     
     */
    public void setExpectedDataType(OsacbmDataType value) {
        this.expectedDataType = value;
    }

    /**
     * Gets the value of the expectedEu property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getExpectedEu() {
        return expectedEu;
    }

    /**
     * Sets the value of the expectedEu property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setExpectedEu(EngUnit value) {
        this.expectedEu = value;
    }

    /**
     * Gets the value of the inputRef property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorId }
     *     
     */
    public MonitorId getInputRef() {
        return inputRef;
    }

    /**
     * Sets the value of the inputRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorId }
     *     
     */
    public void setInputRef(MonitorId value) {
        this.inputRef = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTag() {
        return userTag;
    }

    /**
     * Sets the value of the userTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTag(String value) {
        this.userTag = value;
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
            long theArgId;
            theArgId = (true?this.getArgId(): 0L);
            strategy.appendField(locator, this, "argId", buffer, theArgId);
        }
        {
            MIMKey3 theDataContentType;
            theDataContentType = this.getDataContentType();
            strategy.appendField(locator, this, "dataContentType", buffer, theDataContentType);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            strategy.appendField(locator, this, "desc", buffer, theDesc);
        }
        {
            OsacbmDataType theExpectedDataType;
            theExpectedDataType = this.getExpectedDataType();
            strategy.appendField(locator, this, "expectedDataType", buffer, theExpectedDataType);
        }
        {
            EngUnit theExpectedEu;
            theExpectedEu = this.getExpectedEu();
            strategy.appendField(locator, this, "expectedEu", buffer, theExpectedEu);
        }
        {
            MonitorId theInputRef;
            theInputRef = this.getInputRef();
            strategy.appendField(locator, this, "inputRef", buffer, theInputRef);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlgorithmInputData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlgorithmInputData that = ((AlgorithmInputData) object);
        {
            long lhsArgId;
            lhsArgId = (true?this.getArgId(): 0L);
            long rhsArgId;
            rhsArgId = (true?that.getArgId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "argId", lhsArgId), LocatorUtils.property(thatLocator, "argId", rhsArgId), lhsArgId, rhsArgId)) {
                return false;
            }
        }
        {
            MIMKey3 lhsDataContentType;
            lhsDataContentType = this.getDataContentType();
            MIMKey3 rhsDataContentType;
            rhsDataContentType = that.getDataContentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataContentType", lhsDataContentType), LocatorUtils.property(thatLocator, "dataContentType", rhsDataContentType), lhsDataContentType, rhsDataContentType)) {
                return false;
            }
        }
        {
            String lhsDesc;
            lhsDesc = this.getDesc();
            String rhsDesc;
            rhsDesc = that.getDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
                return false;
            }
        }
        {
            OsacbmDataType lhsExpectedDataType;
            lhsExpectedDataType = this.getExpectedDataType();
            OsacbmDataType rhsExpectedDataType;
            rhsExpectedDataType = that.getExpectedDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedDataType", lhsExpectedDataType), LocatorUtils.property(thatLocator, "expectedDataType", rhsExpectedDataType), lhsExpectedDataType, rhsExpectedDataType)) {
                return false;
            }
        }
        {
            EngUnit lhsExpectedEu;
            lhsExpectedEu = this.getExpectedEu();
            EngUnit rhsExpectedEu;
            rhsExpectedEu = that.getExpectedEu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedEu", lhsExpectedEu), LocatorUtils.property(thatLocator, "expectedEu", rhsExpectedEu), lhsExpectedEu, rhsExpectedEu)) {
                return false;
            }
        }
        {
            MonitorId lhsInputRef;
            lhsInputRef = this.getInputRef();
            MonitorId rhsInputRef;
            rhsInputRef = that.getInputRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputRef", lhsInputRef), LocatorUtils.property(thatLocator, "inputRef", rhsInputRef), lhsInputRef, rhsInputRef)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsUserTag;
            lhsUserTag = this.getUserTag();
            String rhsUserTag;
            rhsUserTag = that.getUserTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userTag", lhsUserTag), LocatorUtils.property(thatLocator, "userTag", rhsUserTag), lhsUserTag, rhsUserTag)) {
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
            long theArgId;
            theArgId = (true?this.getArgId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "argId", theArgId), currentHashCode, theArgId);
        }
        {
            MIMKey3 theDataContentType;
            theDataContentType = this.getDataContentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataContentType", theDataContentType), currentHashCode, theDataContentType);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desc", theDesc), currentHashCode, theDesc);
        }
        {
            OsacbmDataType theExpectedDataType;
            theExpectedDataType = this.getExpectedDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedDataType", theExpectedDataType), currentHashCode, theExpectedDataType);
        }
        {
            EngUnit theExpectedEu;
            theExpectedEu = this.getExpectedEu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedEu", theExpectedEu), currentHashCode, theExpectedEu);
        }
        {
            MonitorId theInputRef;
            theInputRef = this.getInputRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputRef", theInputRef), currentHashCode, theInputRef);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTag", theUserTag), currentHashCode, theUserTag);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
