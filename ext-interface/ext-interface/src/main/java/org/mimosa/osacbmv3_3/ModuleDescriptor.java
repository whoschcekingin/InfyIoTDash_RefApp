
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
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
 * <p>Java class for ModuleDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modIdCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modIdSite" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="modName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleDescriptor", propOrder = {
    "description",
    "modIdCode",
    "modIdSite",
    "modName",
    "modTag",
    "version"
})
public class ModuleDescriptor
    implements Serializable, Equals, HashCode, ToString
{

    protected String description;
    protected int modIdCode;
    @XmlElement(required = true)
    protected Site modIdSite;
    protected String modName;
    @XmlElement(required = true)
    protected String modTag;
    protected String version;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the modIdCode property.
     * 
     */
    public int getModIdCode() {
        return modIdCode;
    }

    /**
     * Sets the value of the modIdCode property.
     * 
     */
    public void setModIdCode(int value) {
        this.modIdCode = value;
    }

    /**
     * Gets the value of the modIdSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getModIdSite() {
        return modIdSite;
    }

    /**
     * Sets the value of the modIdSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setModIdSite(Site value) {
        this.modIdSite = value;
    }

    /**
     * Gets the value of the modName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModName() {
        return modName;
    }

    /**
     * Sets the value of the modName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModName(String value) {
        this.modName = value;
    }

    /**
     * Gets the value of the modTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModTag() {
        return modTag;
    }

    /**
     * Sets the value of the modTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTag(String value) {
        this.modTag = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            int theModIdCode;
            theModIdCode = (true?this.getModIdCode(): 0);
            strategy.appendField(locator, this, "modIdCode", buffer, theModIdCode);
        }
        {
            Site theModIdSite;
            theModIdSite = this.getModIdSite();
            strategy.appendField(locator, this, "modIdSite", buffer, theModIdSite);
        }
        {
            String theModName;
            theModName = this.getModName();
            strategy.appendField(locator, this, "modName", buffer, theModName);
        }
        {
            String theModTag;
            theModTag = this.getModTag();
            strategy.appendField(locator, this, "modTag", buffer, theModTag);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ModuleDescriptor)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ModuleDescriptor that = ((ModuleDescriptor) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            int lhsModIdCode;
            lhsModIdCode = (true?this.getModIdCode(): 0);
            int rhsModIdCode;
            rhsModIdCode = (true?that.getModIdCode(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modIdCode", lhsModIdCode), LocatorUtils.property(thatLocator, "modIdCode", rhsModIdCode), lhsModIdCode, rhsModIdCode)) {
                return false;
            }
        }
        {
            Site lhsModIdSite;
            lhsModIdSite = this.getModIdSite();
            Site rhsModIdSite;
            rhsModIdSite = that.getModIdSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modIdSite", lhsModIdSite), LocatorUtils.property(thatLocator, "modIdSite", rhsModIdSite), lhsModIdSite, rhsModIdSite)) {
                return false;
            }
        }
        {
            String lhsModName;
            lhsModName = this.getModName();
            String rhsModName;
            rhsModName = that.getModName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modName", lhsModName), LocatorUtils.property(thatLocator, "modName", rhsModName), lhsModName, rhsModName)) {
                return false;
            }
        }
        {
            String lhsModTag;
            lhsModTag = this.getModTag();
            String rhsModTag;
            rhsModTag = that.getModTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modTag", lhsModTag), LocatorUtils.property(thatLocator, "modTag", rhsModTag), lhsModTag, rhsModTag)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            int theModIdCode;
            theModIdCode = (true?this.getModIdCode(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modIdCode", theModIdCode), currentHashCode, theModIdCode);
        }
        {
            Site theModIdSite;
            theModIdSite = this.getModIdSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modIdSite", theModIdSite), currentHashCode, theModIdSite);
        }
        {
            String theModName;
            theModName = this.getModName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modName", theModName), currentHashCode, theModName);
        }
        {
            String theModTag;
            theModTag = this.getModTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modTag", theModTag), currentHashCode, theModTag);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
