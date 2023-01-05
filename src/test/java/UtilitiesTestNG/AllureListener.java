package UtilitiesTestNG;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClaseTestNG.BaseClass;
import io.qameta.allure.Attachment;

public class AllureListener  implements ITestListener{
	 private static String getTestMethodName(ITestResult iTestResult)
	 {
	  return iTestResult.getMethod().getConstructorOrMethod().getName();
	 }
	 @Attachment
	 public byte[] saveFailureScreenShot(WebDriver driver)
	 {
	  return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 }
	 @Attachment(value = "{0}", type = "text/plain")
	 public static String saveTextLog(String message)
	 {
	  return message;
	 }
	 @Override
	 public void onStart(ITestContext iTestContext)
	 {
	  System.out.println("I am on start method " + iTestContext.getName());
	  iTestContext.setAttribute("WebDriver", BaseClass.driver);
	  
	 }
	 @Override
	 public void onFinish(ITestContext iTestContext)
	 {
	  System.out.println("I am on finished method " + iTestContext.getName());
	 }
	 @Override
	 public void onTestStart(ITestResult iTestResult)
	 {
	  System.out.println("I am on TestStart method " + getTestMethodName(iTestResult) + "start");
	 }
	 @Override
	 public void onTestSuccess(ITestResult iTestResult)
	 {
	  System.out.println("I am onTestSuccess method" + getTestMethodName(iTestResult) + "succeed");
	 }
	 @Override
	 public void onTestFailure(ITestResult iTestResult)
	 {
	  System.out.println("I am onTestFailure method" + getTestMethodName(iTestResult) + "failed");
	  Object testClass = iTestResult.getInstance();
	  WebDriver driver1 = BaseClass.driver;
	  if(driver1 instanceof WebDriver)
	  {
	   System.out.println("Screenshot captured for test case: " + getTestMethodName(iTestResult));
	   saveFailureScreenShot(driver1);
	  }
	  saveTextLog(getTestMethodName(iTestResult) + "failed and screenshot taken");
	  
	 }
	 @Override
	 public void onTestSkipped(ITestResult iTestResult)
	 {
	  System.out.println("I am onTestSkipped method" + getTestMethodName(iTestResult) + "Skipped");
	 }

}
