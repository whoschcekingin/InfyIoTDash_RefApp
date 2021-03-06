
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
 * <p>Java class for SupportingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agents" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMAgent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="funcs" type="{http://www.mimosa.org/OSACBMV3.3.1}Function" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.mimosa.org/OSACBMV3.3.1}Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingData", propOrder = {
    "agents",
    "funcs",
    "items"
})
public class SupportingData
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<MIMAgent> agents;
    @XmlElement(nillable = true)
    protected List<Function> funcs;
    @XmlElement(nillable = true)
    protected List<Item> items;

    /**
     * Gets the value of the agents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIMAgent }
     * 
     * 
     */
    public List<MIMAgent> getAgents() {
        if (agents == null) {
            agents = new ArrayList<MIMAgent>();
        }
        return this.agents;
    }

    /**
     * Gets the value of the funcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuncs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Function }
     * 
     * 
     */
    public List<Function> getFuncs() {
        if (funcs == null) {
            funcs = new ArrayList<Function>();
        }
        return this.funcs;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
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
            List<MIMAgent> theAgents;
            theAgents = (((this.agents!= null)&&(!this.agents.isEmpty()))?this.getAgents():null);
            strategy.appendField(locator, this, "agents", buffer, theAgents);
        }
        {
            List<Function> theFuncs;
            theFuncs = (((this.funcs!= null)&&(!this.funcs.isEmpty()))?this.getFuncs():null);
            strategy.appendField(locator, this, "funcs", buffer, theFuncs);
        }
        {
            List<Item> theItems;
            theItems = (((this.items!= null)&&(!this.items.isEmpty()))?this.getItems():null);
            strategy.appendField(locator, this, "items", buffer, theItems);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SupportingData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupportingData that = ((SupportingData) object);
        {
            List<MIMAgent> lhsAgents;
            lhsAgents = (((this.agents!= null)&&(!this.agents.isEmpty()))?this.getAgents():null);
            List<MIMAgent> rhsAgents;
            rhsAgents = (((that.agents!= null)&&(!that.agents.isEmpty()))?that.getAgents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agents", lhsAgents), LocatorUtils.property(thatLocator, "agents", rhsAgents), lhsAgents, rhsAgents)) {
                return false;
            }
        }
        {
            List<Function> lhsFuncs;
            lhsFuncs = (((this.funcs!= null)&&(!this.funcs.isEmpty()))?this.getFuncs():null);
            List<Function> rhsFuncs;
            rhsFuncs = (((that.funcs!= null)&&(!that.funcs.isEmpty()))?that.getFuncs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "funcs", lhsFuncs), LocatorUtils.property(thatLocator, "funcs", rhsFuncs), lhsFuncs, rhsFuncs)) {
                return false;
            }
        }
        {
            List<Item> lhsItems;
            lhsItems = (((this.items!= null)&&(!this.items.isEmpty()))?this.getItems():null);
            List<Item> rhsItems;
            rhsItems = (((that.items!= null)&&(!that.items.isEmpty()))?that.getItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "items", lhsItems), LocatorUtils.property(thatLocator, "items", rhsItems), lhsItems, rhsItems)) {
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
            List<MIMAgent> theAgents;
            theAgents = (((this.agents!= null)&&(!this.agents.isEmpty()))?this.getAgents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agents", theAgents), currentHashCode, theAgents);
        }
        {
            List<Function> theFuncs;
            theFuncs = (((this.funcs!= null)&&(!this.funcs.isEmpty()))?this.getFuncs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "funcs", theFuncs), currentHashCode, theFuncs);
        }
        {
            List<Item> theItems;
            theItems = (((this.items!= null)&&(!this.items.isEmpty()))?this.getItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "items", theItems), currentHashCode, theItems);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
