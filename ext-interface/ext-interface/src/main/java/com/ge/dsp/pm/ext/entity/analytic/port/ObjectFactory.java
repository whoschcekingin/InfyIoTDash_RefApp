
package com.ge.dsp.pm.ext.entity.analytic.port;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.analytic.port package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Port_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/analytic/port", "port");
    private final static QName _PortList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/analytic/port", "portList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.analytic.port
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortList }
     * 
     */
    public PortList createPortList() {
        return new PortList();
    }

    /**
     * Create an instance of {@link Port }
     * 
     */
    public Port createPort() {
        return new Port();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Port }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/analytic/port", name = "port")
    public JAXBElement<Port> createPort(Port value) {
        return new JAXBElement<Port>(_Port_QNAME, Port.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/analytic/port", name = "portList")
    public JAXBElement<PortList> createPortList(PortList value) {
        return new JAXBElement<PortList>(_PortList_QNAME, PortList.class, null, value);
    }

}
