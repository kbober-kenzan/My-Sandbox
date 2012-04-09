package com.sandbox.service.two.binding;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sandbox.service.two.component.ISimpleInjectableServiceTwo;

/**
 * @author kbober
 *
 */
@Component("sandboxServiceTwo")
@WebService(name="SandboxServiceTwo",
	serviceName="SandboxServiceTwo",
	endpointInterface="com.sandbox.service.two.binding.ISandboxServiceTwoWS",
	targetNamespace = "http://www.sandbox.com/SandboxServiceTwo/")
public class SandboxServiceTwoWSImpl implements ISandboxServiceTwoWS {

	@Autowired
	private ISimpleInjectableServiceTwo simpleInjectableServiceTwo;
	
	/* (non-Javadoc)
	 * @see com.sandbox.service.one.ISandboxServiceOneWS#sandboxServiceOneEcho()
	 */
	@Override
	public void sandboxServiceTwoEcho() {
		
		if(simpleInjectableServiceTwo != null) {
			System.out.println("SpringBeanAutowiringSupport enable succeded!!!");
			simpleInjectableServiceTwo.executeGreeting();			
		} else {
			System.out.println("SpringBeanAutowirtingSupport enable failed!!!");
		}	
		
		System.out.println("sandboxServiceTwoEcho");
		System.out.println("sandboxServiceTwoEcho");

	}

}
