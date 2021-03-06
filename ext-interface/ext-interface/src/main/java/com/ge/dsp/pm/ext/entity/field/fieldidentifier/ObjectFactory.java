
package com.ge.dsp.pm.ext.entity.field.fieldidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.field.fieldidentifier package. 
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

    private final static QName _FieldIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field/fieldidentifier", "fieldIdentifier");
    private final static QName _FieldIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field/fieldidentifier", "fieldIdentifierList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.field.fieldidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldIdentifier }
     * 
     */
    public FieldIdentifier createFieldIdentifier() {
        return new FieldIdentifier();
    }

    /**
     * Create an instance of {@link FieldIdentifierList }
     * 
     */
    public FieldIdentifierList createFieldIdentifierList() {
        return new FieldIdentifierList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field/fieldidentifier", name = "fieldIdentifier")
    public JAXBElement<FieldIdentifier> createFieldIdentifier(FieldIdentifier value) {
        return new JAXBElement<FieldIdentifier>(_FieldIdentifier_QNAME, FieldIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field/fieldidentifier", name = "fieldIdentifierList")
    public JAXBElement<FieldIdentifierList> createFieldIdentifierList(FieldIdentifierList value) {
        return new JAXBElement<FieldIdentifierList>(_FieldIdentifierList_QNAME, FieldIdentifierList.class, null, value);
    }

}
