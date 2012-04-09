/**
 * 
 */
package com;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pentaho.di.core.exception.KettleException;

import com.sandbox.service.one.pentaho.PentahoEngine;

/**
 * @author kbober
 *
 */
public class PentahoEngineTest {

	private String jobFileName = "\\src\\test\\resources\\tsa_optus\\Job 1.kjb";
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for {@link com.sandbox.service.one.pentaho.PentahoEngine#executeTransformation(java.lang.String)}.
	 */
	@Test
	public void testExecuteTransformation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sandbox.service.one.pentaho.PentahoEngine#executeJob(java.lang.String)}.
	 */
	@Test
	public void testExecuteJob() {
		
		try {
			PentahoEngine.executeJob(jobFileName);
		} catch (KettleException e) {

			e.printStackTrace();
		}		
	}

}
