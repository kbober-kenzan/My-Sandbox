
package com.sandbox.service.two.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sandbox.service.two.soap.client package. 
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

    private final static QName _SandboxServiceTwoEchoResponse_QNAME = new QName("http://www.sandbox.com/SandboxServiceTwo/", "sandboxServiceTwoEchoResponse");
    private final static QName _SandboxServiceTwoEcho_QNAME = new QName("http://www.sandbox.com/SandboxServiceTwo/", "sandboxServiceTwoEcho");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sandbox.service.two.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SandboxServiceTwoEchoResponse }
     * 
     */
    public SandboxServiceTwoEchoResponse createSandboxServiceTwoEchoResponse() {
        return new SandboxServiceTwoEchoResponse();
    }

    /**
     * Create an instance of {@link SandboxServiceTwoEcho }
     * 
     */
    public SandboxServiceTwoEcho createSandboxServiceTwoEcho() {
        return new SandboxServiceTwoEcho();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SandboxServiceTwoEchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceTwo/", name = "sandboxServiceTwoEchoResponse")
    public JAXBElement<SandboxServiceTwoEchoResponse> createSandboxServiceTwoEchoResponse(SandboxServiceTwoEchoResponse value) {
        return new JAXBElement<SandboxServiceTwoEchoResponse>(_SandboxServiceTwoEchoResponse_QNAME, SandboxServiceTwoEchoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SandboxServiceTwoEcho }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceTwo/", name = "sandboxServiceTwoEcho")
    public JAXBElement<SandboxServiceTwoEcho> createSandboxServiceTwoEcho(SandboxServiceTwoEcho value) {
        return new JAXBElement<SandboxServiceTwoEcho>(_SandboxServiceTwoEcho_QNAME, SandboxServiceTwoEcho.class, null, value);
    }

}
