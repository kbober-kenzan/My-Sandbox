package com.sandbox.common.utils;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

public class EJBTest {
    
    @Test
    public void remoteCallToAccountService() throws Exception {
    	Context context = getContext();        
        
        System.out.println("AccountID: " + accountID);
    }
    
    /**
     * Returns InitialContext configured to connect to local JBoss
     * 
     * @return
     * @throws NamingException
     */
    public Context getContext() throws NamingException
    {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
        props.put(Context.PROVIDER_URL, "localhost:1099");
        props.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");

        Context ret = new InitialContext(props);

        return ret;
    }    
}
