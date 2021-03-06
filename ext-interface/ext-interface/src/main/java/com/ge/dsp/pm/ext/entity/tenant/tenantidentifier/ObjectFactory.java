
package com.ge.dsp.pm.ext.entity.tenant.tenantidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.tenant.tenantidentifier package. 
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

    private final static QName _TenantIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/tenant/tenantidentifier", "tenantIdentifier");
    private final static QName _TenantIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/tenant/tenantidentifier", "tenantIdentifierList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.tenant.tenantidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TenantIdentifierList }
     * 
     */
    public TenantIdentifierList createTenantIdentifierList() {
        return new TenantIdentifierList();
    }

    /**
     * Create an instance of {@link TenantIdentifier }
     * 
     */
    public TenantIdentifier createTenantIdentifier() {
        return new TenantIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenantIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/tenant/tenantidentifier", name = "tenantIdentifier")
    public JAXBElement<TenantIdentifier> createTenantIdentifier(TenantIdentifier value) {
        return new JAXBElement<TenantIdentifier>(_TenantIdentifier_QNAME, TenantIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenantIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/tenant/tenantidentifier", name = "tenantIdentifierList")
    public JAXBElement<TenantIdentifierList> createTenantIdentifierList(TenantIdentifierList value) {
        return new JAXBElement<TenantIdentifierList>(_TenantIdentifierList_QNAME, TenantIdentifierList.class, null, value);
    }

}
