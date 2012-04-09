/**
 * 
 */
package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.Result;
import org.pentaho.di.core.RowMetaAndData;
import org.pentaho.di.core.database.Database;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.logging.LogChannel;
import org.pentaho.di.core.logging.LogChannelInterface;
import org.pentaho.di.core.logging.LogLevel;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * @author kbober
 * 
 */
public class SimpleKettleTest {

	private String jobFileName = "\\src\\test\\resources\\tsa_optus\\Job 1.kjb";
	private String transformationFileName = "\\src\\test\\resources\\WebServicesMovieListingAsHTTP.ktr";

	
	@Test
	public void testTransformation() {

		try {
			KettleEnvironment.init(false);
			EnvUtil.environmentInit();			
			TransMeta transMeta = new TransMeta(transformationFileName);
			Trans trans = new Trans(transMeta);
			trans.execute(null); // You can pass arguments instead of null.
			trans.waitUntilFinished();
			Result r = trans.getResult();
			List<RowMetaAndData> rowsResult = r.getRows();

			if (trans.getErrors() > 0) {
				throw new RuntimeException("There were errors during transformation execution.");
			}

		} catch (KettleException e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void testJob() {		
		
		LogChannelInterface log = new LogChannel("Test_JOB");
		log.setLogLevel(LogLevel.DETAILED);
		
		try {
			Job job = null;
			JobMeta jobMeta = null;
			Result result = null;
			Date start, stop;
			Calendar cal;
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
			
			KettleEnvironment.init(false);
			EnvUtil.environmentInit();
			
			jobMeta = new JobMeta(jobFileName.toString(), null, null);
			job = new Job(null, jobMeta);
			job.setLogLevel(log.getLogLevel());
			job.getJobMeta().setArguments(null);
			job.initializeVariablesFrom(null);
			job.getJobMeta().setInternalKettleVariables(job);
						
			cal=Calendar.getInstance();
			start=cal.getTime();
			
			job.start();
		    job.waitUntilFinished();
		    result = job.getResult(); 
		    	    
		    
		    cal=Calendar.getInstance();
			stop=cal.getTime();
			String begin=df.format(start).toString();
			String end  =df.format(stop).toString();

			System.out.println("Job Start ["+begin+"] , Stop ["+end+"]");			
			
			if (job.getErrors() > 0) {
				
				throw new RuntimeException("There were errors during Job execution.");
			}
		} catch (KettleException e) {
			System.out.println(e);
		}

	}
	
	@Test
	public void loadFileInputStreamtest() {
		
		String fileName = "/home/jason.stedman/Downloads/data-integration/datafeeds/Job 1.kjb";
		File file = null;
		InputStream fileInputStream = null;
		
		System.out.println("FileName :: "+fileName);
		
		try {
			file = new File(fileName);
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("FileName :: "+fileName);
	}
}
