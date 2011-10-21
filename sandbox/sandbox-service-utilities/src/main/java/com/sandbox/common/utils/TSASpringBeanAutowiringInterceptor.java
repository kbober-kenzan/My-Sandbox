package com.sandbox.common.utils;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

/**
 * @author kbober
 *
 */
public class TSASpringBeanAutowiringInterceptor extends	SpringBeanAutowiringInterceptor {

	private static final String DEFAULT_RESOURCE_LOCATION = "classpath*:sandboxBeanRefContext.xml";
	
	/**
	 * Determine the BeanFactoryLocator to obtain the BeanFactoryReference from.
	 * <p>The default implementation exposes Spring's default
	 * {@link ContextSingletonBeanFactoryLocator}.
	 * @param target the target bean to autowire
	 * @return the BeanFactoryLocator to use (never <code>null</code>)
	 * @see org.springframework.context.access.ContextSingletonBeanFactoryLocator#getInstance()
	 */
	protected BeanFactoryLocator getBeanFactoryLocator(Object target) {
		return ContextSingletonBeanFactoryLocator.getInstance(DEFAULT_RESOURCE_LOCATION);
	}	
}
