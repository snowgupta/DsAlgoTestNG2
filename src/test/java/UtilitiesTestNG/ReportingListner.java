package UtilitiesTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClaseTestNG.BaseClass;

//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.testng.ITestContext;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//
//import com.aventstack.extentreports.ExtentReporter;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportingListner extends BaseClass implements ITestListener{
@Override	
	public void onTestFailure(ITestResult result) {
	System.out.println("Failed test");
	failed(result.getMethod().getMethodName());
	
}
//	public ExtentHtmlReporter htlmReporter;
//	public ExtentReports extent;
//	public ExtentTest logger;
//	private ExtentReporter htmlReporter;
//	public void onStart(ITestContext testContext) {
//		String timeStamp= new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
//	String repName = "Test-Report-"+timeStamp+".html";
//	htlmReporter = new ExtentHtmlReporter (System.getProperty("User.dir")+ "/test-output/" + repName);
//	htlmReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent.config.xml");
//	extent = new ExtentReports();
//	extent.attachReporter(htmlReporter);
//	extent.setSystemInfo("Host name", "local Host");
//	extent.setSystemInfo("Environemnt", "QA");
//	extent.setSystemInfo("user", "NumpiNinja");
//	
////	htmlReporter.config().setDocumentTitle("DsAlgo");
////	htmlReporter.config().setReporterName("Test Report");
////	htmlReporter.config().setTestViewChartlocation(ChartLocation.TOP);
////	htmlReporter.config().settheme(Theme.DARK);
//	}
//	
//	public void ontestSucess(ITestResult tr) {
//		logger = extent.createTest(tr.getName());
//		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
//		
//	}
//	public void ontestFailure(ITestResult tr) {
//		
//		logger = extent.createTest(tr.getName());
//		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
//		String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
//		File f = new File (screenshotPath);
//	if (f.exists()) {
//		try {
//			logger.fail("Screenshot is below" +logger.addScreenCaptureFromPath(screenshotPath));
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	}
//
//	public void onFinish(ITestContext testContext) {
//		extent.flush();
//	}
}
