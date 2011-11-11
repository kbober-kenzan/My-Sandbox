package com.sandbox.service.one.binding;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.sandbox.service.one.SandboxServiceOneException;

@WebService(name = "SandboxServiceOne", targetNamespace = "http://www.thesearchagency.com/SandboxServiceOne/")
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface ISandboxServiceOneWS {

	@WebMethod(operationName = "sandboxServiceOneEcho")	    
    public void sandboxServiceOneEcho();
    
	@WebMethod(operationName = "testSpringDI")
	public void testSpringDI();
	
	@WebMethod(operationName = "executePentahoTransformation")
	public void executePentahoTransformation(String aTransformationFileName) throws SandboxServiceOneException;
	
	@WebMethod(operationName = "executePentahoJob")
	public void executePentahoJob(String aJobFileName) throws SandboxServiceOneException;
	
}

