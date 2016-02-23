
package com.ge.dsp.aaas.entity.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.aaas.entity.message package. 
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

    private final static QName _Message_QNAME = new QName("http://dsp.ge.com/aaas/entity/message", "message");
    private final static QName _MessageList_QNAME = new QName("http://dsp.ge.com/aaas/entity/message", "messageList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.aaas.entity.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageList }
     * 
     */
    public MessageList createMessageList() {
        return new MessageList();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/aaas/entity/message", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/aaas/entity/message", name = "messageList")
    public JAXBElement<MessageList> createMessageList(MessageList value) {
        return new JAXBElement<MessageList>(_MessageList_QNAME, MessageList.class, null, value);
    }

}