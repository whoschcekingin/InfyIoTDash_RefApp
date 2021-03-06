
package com.ge.dsp.pm.ext.entity.modelfield;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.modelfield package. 
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

    private final static QName _ModelFieldList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/modelfield", "modelFieldList");
    private final static QName _ModelField_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/modelfield", "modelField");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.modelfield
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModelField }
     * 
     */
    public ModelField createModelField() {
        return new ModelField();
    }

    /**
     * Create an instance of {@link ModelFieldList }
     * 
     */
    public ModelFieldList createModelFieldList() {
        return new ModelFieldList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelFieldList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/modelfield", name = "modelFieldList")
    public JAXBElement<ModelFieldList> createModelFieldList(ModelFieldList value) {
        return new JAXBElement<ModelFieldList>(_ModelFieldList_QNAME, ModelFieldList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/modelfield", name = "modelField")
    public JAXBElement<ModelField> createModelField(ModelField value) {
        return new JAXBElement<ModelField>(_ModelField_QNAME, ModelField.class, null, value);
    }

}
