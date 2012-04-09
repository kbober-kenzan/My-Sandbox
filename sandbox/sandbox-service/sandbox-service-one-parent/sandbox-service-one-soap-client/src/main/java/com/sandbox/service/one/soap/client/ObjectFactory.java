
package com.sandbox.service.one.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sandbox.service.one.soap.client package. 
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

    private final static QName _SandboxServiceOneEcho_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "sandboxServiceOneEcho");
    private final static QName _SandboxServiceOneEchoResponse_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "sandboxServiceOneEchoResponse");
    private final static QName _TestSpringDI_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "testSpringDI");
    private final static QName _ExecutePentahoTransformationResponse_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "executePentahoTransformationResponse");
    private final static QName _ExecutePentahoJob_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "executePentahoJob");
    private final static QName _ExecutePentahoJobResponse_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "executePentahoJobResponse");
    private final static QName _TestSpringDIResponse_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "testSpringDIResponse");
    private final static QName _ExecutePentahoTransformation_QNAME = new QName("http://www.sandbox.com/SandboxServiceOne/", "executePentahoTransformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sandbox.service.one.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestSpringDI }
     * 
     */
    public TestSpringDI createTestSpringDI() {
        return new TestSpringDI();
    }

    /**
     * Create an instance of {@link TestSpringDIResponse }
     * 
     */
    public TestSpringDIResponse createTestSpringDIResponse() {
        return new TestSpringDIResponse();
    }

    /**
     * Create an instance of {@link ExecutePentahoJobResponse }
     * 
     */
    public ExecutePentahoJobResponse createExecutePentahoJobResponse() {
        return new ExecutePentahoJobResponse();
    }

    /**
     * Create an instance of {@link SandboxServiceOneEcho }
     * 
     */
    public SandboxServiceOneEcho createSandboxServiceOneEcho() {
        return new SandboxServiceOneEcho();
    }

    /**
     * Create an instance of {@link ExecutePentahoJob }
     * 
     */
    public ExecutePentahoJob createExecutePentahoJob() {
        return new ExecutePentahoJob();
    }

    /**
     * Create an instance of {@link ExecutePentahoTransformation }
     * 
     */
    public ExecutePentahoTransformation createExecutePentahoTransformation() {
        return new ExecutePentahoTransformation();
    }

    /**
     * Create an instance of {@link ExecutePentahoTransformationResponse }
     * 
     */
    public ExecutePentahoTransformationResponse createExecutePentahoTransformationResponse() {
        return new ExecutePentahoTransformationResponse();
    }

    /**
     * Create an instance of {@link SandboxServiceOneEchoResponse }
     * 
     */
    public SandboxServiceOneEchoResponse createSandboxServiceOneEchoResponse() {
        return new SandboxServiceOneEchoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SandboxServiceOneEcho }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "sandboxServiceOneEcho")
    public JAXBElement<SandboxServiceOneEcho> createSandboxServiceOneEcho(SandboxServiceOneEcho value) {
        return new JAXBElement<SandboxServiceOneEcho>(_SandboxServiceOneEcho_QNAME, SandboxServiceOneEcho.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SandboxServiceOneEchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "sandboxServiceOneEchoResponse")
    public JAXBElement<SandboxServiceOneEchoResponse> createSandboxServiceOneEchoResponse(SandboxServiceOneEchoResponse value) {
        return new JAXBElement<SandboxServiceOneEchoResponse>(_SandboxServiceOneEchoResponse_QNAME, SandboxServiceOneEchoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSpringDI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "testSpringDI")
    public JAXBElement<TestSpringDI> createTestSpringDI(TestSpringDI value) {
        return new JAXBElement<TestSpringDI>(_TestSpringDI_QNAME, TestSpringDI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutePentahoTransformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "executePentahoTransformationResponse")
    public JAXBElement<ExecutePentahoTransformationResponse> createExecutePentahoTransformationResponse(ExecutePentahoTransformationResponse value) {
        return new JAXBElement<ExecutePentahoTransformationResponse>(_ExecutePentahoTransformationResponse_QNAME, ExecutePentahoTransformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutePentahoJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "executePentahoJob")
    public JAXBElement<ExecutePentahoJob> createExecutePentahoJob(ExecutePentahoJob value) {
        return new JAXBElement<ExecutePentahoJob>(_ExecutePentahoJob_QNAME, ExecutePentahoJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutePentahoJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "executePentahoJobResponse")
    public JAXBElement<ExecutePentahoJobResponse> createExecutePentahoJobResponse(ExecutePentahoJobResponse value) {
        return new JAXBElement<ExecutePentahoJobResponse>(_ExecutePentahoJobResponse_QNAME, ExecutePentahoJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSpringDIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "testSpringDIResponse")
    public JAXBElement<TestSpringDIResponse> createTestSpringDIResponse(TestSpringDIResponse value) {
        return new JAXBElement<TestSpringDIResponse>(_TestSpringDIResponse_QNAME, TestSpringDIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutePentahoTransformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sandbox.com/SandboxServiceOne/", name = "executePentahoTransformation")
    public JAXBElement<ExecutePentahoTransformation> createExecutePentahoTransformation(ExecutePentahoTransformation value) {
        return new JAXBElement<ExecutePentahoTransformation>(_ExecutePentahoTransformation_QNAME, ExecutePentahoTransformation.class, null, value);
    }

}
