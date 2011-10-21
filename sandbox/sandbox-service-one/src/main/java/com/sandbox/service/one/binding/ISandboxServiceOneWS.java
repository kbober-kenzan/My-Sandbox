package com.sandbox.service.one.binding;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "SandboxServiceOne", targetNamespace = "http://www.thesearchagency.com/SandboxServiceOne/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
//@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface ISandboxServiceOneWS {

	@WebMethod(operationName = "sandboxServiceOneEcho")	    
    public void sandboxServiceOneEcho();
    
	@WebMethod(operationName = "testSpringDI")
	public void testSpringDI();
}

