package com.sandbox.service.one;

import java.rmi.RemoteException;

import javax.xml.ws.WebFault;

/**
 * <p>SanboxServiceOneException class.</p>
 *
 * @author kbober
 * @version $Id: $
 */
@WebFault
public class SandboxServiceOneException extends RemoteException {

	private static final long serialVersionUID = 20090425001L;

	/**
	 * <p>Constructor for SandboxServiceOneException.</p>
	 */
	public SandboxServiceOneException() {
		super();
	}

	/**
	 * <p>Constructor for SandboxServiceOneException.</p>
	 *
	 * @param anMessage a {@link java.lang.String} object.
	 */
	public SandboxServiceOneException(String anMessage) {
		super(anMessage);
	}

	/**
	 * <p>Constructor for SandboxServiceOneException.</p>
	 *
	 * @param anMessage a {@link java.lang.String} object.
	 * @param anCause a {@link java.lang.Throwable} object.
	 */
	public SandboxServiceOneException(String anMessage, Throwable anCause) {
		super(anMessage, anCause);
	}	
}
