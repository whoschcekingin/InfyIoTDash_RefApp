
package com.ge.dsp.pm.ext.entity.selectionfilter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.selectionfilter package. 
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

    private final static QName _SelectionFilter_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/selectionfilter", "selectionFilter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.selectionfilter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectionFilter }
     * 
     */
    public SelectionFilter createSelectionFilter() {
        return new SelectionFilter();
    }

    /**
     * Create an instance of {@link FieldSelectionFilter }
     * 
     */
    public FieldSelectionFilter createFieldSelectionFilter() {
        return new FieldSelectionFilter();
    }

    /**
     * Create an instance of {@link FieldTypeSelectionFilter }
     * 
     */
    public FieldTypeSelectionFilter createFieldTypeSelectionFilter() {
        return new FieldTypeSelectionFilter();
    }

    /**
     * Create an instance of {@link NestedSelectionFilter }
     * 
     */
    public NestedSelectionFilter createNestedSelectionFilter() {
        return new NestedSelectionFilter();
    }

    /**
     * Create an instance of {@link FieldIdentifierNestedValue }
     * 
     */
    public FieldIdentifierNestedValue createFieldIdentifierNestedValue() {
        return new FieldIdentifierNestedValue();
    }

    /**
     * Create an instance of {@link OsaSelectionFilter }
     * 
     */
    public OsaSelectionFilter createOsaSelectionFilter() {
        return new OsaSelectionFilter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/selectionfilter", name = "selectionFilter")
    public JAXBElement<SelectionFilter> createSelectionFilter(SelectionFilter value) {
        return new JAXBElement<SelectionFilter>(_SelectionFilter_QNAME, SelectionFilter.class, null, value);
    }

}
