package com.sandbox.service.one.pentaho;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.Result;
import org.pentaho.di.core.RowMetaAndData;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.logging.LogChannel;
import org.pentaho.di.core.logging.LogChannelInterface;
import org.pentaho.di.core.logging.LogLevel;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kbober
 * 
 */
public class PentahoEngine {

	private static String LOG_CHANNEL = "PentahoEngine";

	private static Logger logger = LoggerFactory.getLogger(PentahoEngine.class);
	private static Boolean initialized;

	static {
		try {
			init();
		} catch (KettleException e) {
			logger.error(e.getMessage());
		}
	}

	public static void init() throws KettleException {
		if (initialized == null) {
			try {
				logger.info("Initizialing the Pentaho - Kettle Environment");
				KettleEnvironment.init(false);
				EnvUtil.environmentInit();
				initialized = true;
			} catch (KettleException e) {
				logger.error(e.getMessage());
				throw e;
			}
		}
	}

	public static void executeTransformation(String aTransformationFileName) throws KettleException {
		
		PentahoEngine.init();

		try {
			TransMeta transMeta = new TransMeta(aTransformationFileName);
			Trans trans = new Trans(transMeta);
			trans.execute(null); // You can pass arguments instead of null.
			trans.waitUntilFinished();
			Result r = trans.getResult();
			List<RowMetaAndData> rowsResult = r.getRows();

			if (trans.getErrors() > 0) {
				throw new RuntimeException("There were errors during transformation execution.");
			}
		} catch (KettleException e) {
			logger.error("There were errors during the transformation execution. For Transformation File : " + aTransformationFileName);
			throw e;
		}
	}

	public static void executeJob(String aJobFileName) throws KettleException {

		PentahoEngine.init();
		
		LogChannelInterface log = new LogChannel(PentahoEngine.LOG_CHANNEL);
		log.setLogLevel(LogLevel.DETAILED);

		try {
			Job job = null;
			JobMeta jobMeta = null;
			Result result = null;
			Date start, stop;
			Calendar cal;
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

			jobMeta = new JobMeta(aJobFileName, null, null);
			job = new Job(null, jobMeta);
			job.setLogLevel(log.getLogLevel());
			job.getJobMeta().setArguments(null);
			job.initializeVariablesFrom(null);
			job.getJobMeta().setInternalKettleVariables(job);

			cal = Calendar.getInstance();
			start = cal.getTime();

			logger.info("Executing Job File : aJobFileName");

			job.start();
			job.waitUntilFinished();
			result = job.getResult();

			cal = Calendar.getInstance();
			stop = cal.getTime();
			String begin = df.format(start).toString();
			String end = df.format(stop).toString();

			logger.info("Job Start [" + begin + "] , Job Stop [" + end + "]");

			if (job.getErrors() > 0) {
				logger.error("There were errors during Job execution. For Job : " + aJobFileName);
				throw new RuntimeException("There were errors during Job execution.");
			}
		} catch (KettleException e) {
			logger.error("There were errors during Job execution. For Job : " + aJobFileName);
			throw e;
		}
	}
}
