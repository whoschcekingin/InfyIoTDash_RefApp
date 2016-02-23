//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.osa.selectionfilter;

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
import org.mimosa.osacbmv3_3.SelectionFilter;


/**
 * Defines the structure for name/value selection filter. This filter is
 * 			used to send list of name/value filter rows to ADH
 * 			Please note:
 * 			runtimeOrchestrationContextId is Insight internal use only
 * 
 * <p>Java class for NameValueSelectionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameValueSelectionFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}SelectionFilter">
 *       &lt;sequence>
 *         &lt;element name="nameValueSelectionFilterRow" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}NameValueSelectionFilterRow" maxOccurs="unbounded"/>
 *         &lt;element name="runtimeOrchestrationContextId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameValueSelectionFilter", propOrder = {
    "nameValueSelectionFilterRow",
    "runtimeOrchestrationContextId"
})
public class NameValueSelectionFilter
    extends SelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<NameValueSelectionFilterRow> nameValueSelectionFilterRow;
    protected String runtimeOrchestrationContextId;

    /**
     * Gets the value of the nameValueSelectionFilterRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueSelectionFilterRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueSelectionFilterRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueSelectionFilterRow }
     * 
     * 
     */
    public List<NameValueSelectionFilterRow> getNameValueSelectionFilterRow() {
        if (nameValueSelectionFilterRow == null) {
            nameValueSelectionFilterRow = new ArrayList<NameValueSelectionFilterRow>();
        }
        return this.nameValueSelectionFilterRow;
    }

    /**
     * Gets the value of the runtimeOrchestrationContextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntimeOrchestrationContextId() {
        return runtimeOrchestrationContextId;
    }

    /**
     * Sets the value of the runtimeOrchestrationContextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntimeOrchestrationContextId(String value) {
        this.runtimeOrchestrationContextId = value;
    }

    /**
     * Sets the value of the nameValueSelectionFilterRow property.
     * 
     * @param nameValueSelectionFilterRow
     *     allowed object is
     *     {@link NameValueSelectionFilterRow }
     *     
     */
    public void setNameValueSelectionFilterRow(List<NameValueSelectionFilterRow> nameValueSelectionFilterRow) {
        this.nameValueSelectionFilterRow = nameValueSelectionFilterRow;
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
            List<NameValueSelectionFilterRow> theNameValueSelectionFilterRow;
            theNameValueSelectionFilterRow = (((this.nameValueSelectionFilterRow!= null)&&(!this.nameValueSelectionFilterRow.isEmpty()))?this.getNameValueSelectionFilterRow():null);
            strategy.appendField(locator, this, "nameValueSelectionFilterRow", buffer, theNameValueSelectionFilterRow);
        }
        {
            String theRuntimeOrchestrationContextId;
            theRuntimeOrchestrationContextId = this.getRuntimeOrchestrationContextId();
            strategy.appendField(locator, this, "runtimeOrchestrationContextId", buffer, theRuntimeOrchestrationContextId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NameValueSelectionFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NameValueSelectionFilter that = ((NameValueSelectionFilter) object);
        {
            List<NameValueSelectionFilterRow> lhsNameValueSelectionFilterRow;
            lhsNameValueSelectionFilterRow = (((this.nameValueSelectionFilterRow!= null)&&(!this.nameValueSelectionFilterRow.isEmpty()))?this.getNameValueSelectionFilterRow():null);
            List<NameValueSelectionFilterRow> rhsNameValueSelectionFilterRow;
            rhsNameValueSelectionFilterRow = (((that.nameValueSelectionFilterRow!= null)&&(!that.nameValueSelectionFilterRow.isEmpty()))?that.getNameValueSelectionFilterRow():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameValueSelectionFilterRow", lhsNameValueSelectionFilterRow), LocatorUtils.property(thatLocator, "nameValueSelectionFilterRow", rhsNameValueSelectionFilterRow), lhsNameValueSelectionFilterRow, rhsNameValueSelectionFilterRow)) {
                return false;
            }
        }
        {
            String lhsRuntimeOrchestrationContextId;
            lhsRuntimeOrchestrationContextId = this.getRuntimeOrchestrationContextId();
            String rhsRuntimeOrchestrationContextId;
            rhsRuntimeOrchestrationContextId = that.getRuntimeOrchestrationContextId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runtimeOrchestrationContextId", lhsRuntimeOrchestrationContextId), LocatorUtils.property(thatLocator, "runtimeOrchestrationContextId", rhsRuntimeOrchestrationContextId), lhsRuntimeOrchestrationContextId, rhsRuntimeOrchestrationContextId)) {
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
            List<NameValueSelectionFilterRow> theNameValueSelectionFilterRow;
            theNameValueSelectionFilterRow = (((this.nameValueSelectionFilterRow!= null)&&(!this.nameValueSelectionFilterRow.isEmpty()))?this.getNameValueSelectionFilterRow():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameValueSelectionFilterRow", theNameValueSelectionFilterRow), currentHashCode, theNameValueSelectionFilterRow);
        }
        {
            String theRuntimeOrchestrationContextId;
            theRuntimeOrchestrationContextId = this.getRuntimeOrchestrationContextId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runtimeOrchestrationContextId", theRuntimeOrchestrationContextId), currentHashCode, theRuntimeOrchestrationContextId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}