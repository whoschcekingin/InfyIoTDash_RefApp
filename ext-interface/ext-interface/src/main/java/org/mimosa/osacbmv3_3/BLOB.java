
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
 * <p>Java class for BLOB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BLOB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentType" type="{http://www.mimosa.org/OSACBMV3.3.1}Mime"/>
 *         &lt;element name="dataBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BLOB", propOrder = {
    "contentType",
    "dataBinary",
    "data"
})
public class BLOB
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected Mime contentType;
    protected byte[] dataBinary;
    @XmlElement(type = Byte.class)
    protected List<Byte> data;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link Mime }
     *     
     */
    public Mime getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mime }
     *     
     */
    public void setContentType(Mime value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the dataBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDataBinary() {
        return dataBinary;
    }

    /**
     * Sets the value of the dataBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDataBinary(byte[] value) {
        this.dataBinary = ((byte[]) value);
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getData() {
        if (data == null) {
            data = new ArrayList<Byte>();
        }
        return this.data;
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
            Mime theContentType;
            theContentType = this.getContentType();
            strategy.appendField(locator, this, "contentType", buffer, theContentType);
        }
        {
            byte[] theDataBinary;
            theDataBinary = this.getDataBinary();
            strategy.appendField(locator, this, "dataBinary", buffer, theDataBinary);
        }
        {
            List<Byte> theData;
            theData = (((this.data!= null)&&(!this.data.isEmpty()))?this.getData():null);
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BLOB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BLOB that = ((BLOB) object);
        {
            Mime lhsContentType;
            lhsContentType = this.getContentType();
            Mime rhsContentType;
            rhsContentType = that.getContentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentType", lhsContentType), LocatorUtils.property(thatLocator, "contentType", rhsContentType), lhsContentType, rhsContentType)) {
                return false;
            }
        }
        {
            byte[] lhsDataBinary;
            lhsDataBinary = this.getDataBinary();
            byte[] rhsDataBinary;
            rhsDataBinary = that.getDataBinary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataBinary", lhsDataBinary), LocatorUtils.property(thatLocator, "dataBinary", rhsDataBinary), lhsDataBinary, rhsDataBinary)) {
                return false;
            }
        }
        {
            List<Byte> lhsData;
            lhsData = (((this.data!= null)&&(!this.data.isEmpty()))?this.getData():null);
            List<Byte> rhsData;
            rhsData = (((that.data!= null)&&(!that.data.isEmpty()))?that.getData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
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
            Mime theContentType;
            theContentType = this.getContentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentType", theContentType), currentHashCode, theContentType);
        }
        {
            byte[] theDataBinary;
            theDataBinary = this.getDataBinary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataBinary", theDataBinary), currentHashCode, theDataBinary);
        }
        {
            List<Byte> theData;
            theData = (((this.data!= null)&&(!this.data.isEmpty()))?this.getData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "data", theData), currentHashCode, theData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
