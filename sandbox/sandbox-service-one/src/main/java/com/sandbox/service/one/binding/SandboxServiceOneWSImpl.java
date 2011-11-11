package com.sandbox.service.one.binding;

import java.net.URL;

import javax.jws.WebService;
import javax.xml.ws.BindingProvider;

import org.pentaho.di.core.exception.KettleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sandbox.service.one.SandboxServiceOneException;
import com.sandbox.service.one.component.ISimpleInjectableServiceOne;
import com.sandbox.service.one.pentaho.PentahoEngine;
import com.sandbox.service.two.soap.client.SandboxServiceTwo;
import com.sandbox.service.two.soap.client.SandboxServiceTwo_Service;

/**
 * @author kbober
 *
 */
@Component("sandboxServiceOne")
@WebService(name="SandboxServiceOne",
	serviceName="SandboxServiceOne",
	endpointInterface="com.sandbox.service.one.binding.ISandboxServiceOneWS",
	targetNamespace = "http://www.thesearchagency.com/SandboxServiceOne/")
public class SandboxServiceOneWSImpl implements ISandboxServiceOneWS {
	
	private static Logger logger = LoggerFactory.getLogger(SandboxServiceOneWSImpl.class);
	
	@Autowired
	private ISimpleInjectableServiceOne simpleInjectableService;
	
	/* (non-Javadoc)
	 * @see com.sandbox.service.one.ISandboxServiceOneWS#sandboxServiceOneEcho()
	 */
	@Override
	public void sandboxServiceOneEcho() {
		System.out.println("sandboxServiceOneEcho");
		
		if(simpleInjectableService != null) {
			System.out.println("SpringBeanAutowiringSupport enable succeded!!!");
			simpleInjectableService.executeGreeting();			
		} else {
			System.out.println("SpringBeanAutowirtingSupport enable failed!!!");
		}	
		
		//String SANDBOX_SERVICE_TWO_URL = "http://kbober-desktop:8080/Sandbox-Two/SandboxServiceTwo";
		String SANDBOX_SERVICE_TWO_URL = "https://kbober-desktop:8443/Sandbox-Two/SandboxServiceTwo";
				
		URL sandboxServiceTwoWSDLUrl = SandboxServiceTwo_Service.class.getResource("/SandboxServiceTwo-0.0.1-SNAPSHOT.wsdl");
		
		SandboxServiceTwo_Service service = new SandboxServiceTwo_Service(sandboxServiceTwoWSDLUrl);
		SandboxServiceTwo port = service.getSandboxServiceTwoPort();
		((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SANDBOX_SERVICE_TWO_URL);
		port.sandboxServiceTwoEcho();
	}
	
	public void testSpringDI() {		
			
	}

	@Override
	public void executePentahoTransformation(String aTransformationFileName) throws SandboxServiceOneException {
		
		try {
			PentahoEngine.executeTransformation(aTransformationFileName);
		} catch (KettleException e) {
			logger.error("Error attempting to execute Pentaho Transformation File ["+aTransformationFileName+"]", e);
			throw new SandboxServiceOneException(e.getMessage());
		}		
	}
	
	@Override
	public void executePentahoJob(String aJobFileName) throws SandboxServiceOneException {
		
		try {
			PentahoEngine.executeJob(aJobFileName);
		} catch (KettleException e) {
			logger.error("Error attempting to execute Pentaho Job File ["+aJobFileName+"]", e);
			throw new SandboxServiceOneException(e.getMessage());
		}		
	}

}
