package com.sandbox.service.two.binding;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "SandboxServiceTwo", targetNamespace = "http://www.thesearchagency.com/SandboxServiceTwo/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
//@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface ISandboxServiceTwoWS {

	@WebMethod(operationName = "sandboxServiceTwoEcho")	    
    public void sandboxServiceTwoEcho();
    
}

