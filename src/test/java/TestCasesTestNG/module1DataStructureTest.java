package TestCasesTestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import UtilitiesTestNG.ExcelUtils;



public class module1DataStructureTest extends BaseClass{
	
	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	LoginPage lp;
	@BeforeClass
	 public void setupDS() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			lp= new LoginPage (driver);
		MDS =	new Module1ForDtataStructure(driver);
		 }

@Test (priority=1)
public void enterToDataStructureModule() throws InterruptedException {
	portalPage.ClickOnGetStarButton();
	onHomePage.clickOnLoginTab();
	Thread.sleep(500);
	lp.typeUserName(username);
	lp.typePassword(password);
	lp.clickLoginBtn();
	
Thread.sleep(500);

		onHomePage.clickOnDataStructureGetStarted();
		Thread.sleep(500);
	boolean dataMsg= driver.getPageSource().contains("Data Structures-Introduction");
	if (dataMsg==true) {
		Assert.assertTrue(true);
		System.out.println("you are on Data Structure Page");
	}
	
	else {
		Assert.assertTrue(false);
		System.out.println("you are on Home Page");
	}
	
}

@Test (priority=2)
public void clickOnTimeCopmlexityOnDataStructure() throws InterruptedException {
	if(driver.getTitle().equals("Data Structures-Introduction"))
	MDS.clickOnTimeComplexityBtnFrmDataStrucPage();
	Thread.sleep(500);
	boolean timemsg= driver.getPageSource().contains("Time Complexity");
	if (timemsg==true) {
	Assert.assertTrue(true);
	System.out.println("Time Coplexity Page");
	}
	else {
		Assert.assertTrue(false);
		System.out.println("its not a time Coplexity Page");
	}
}

@Test (priority=3)
public void ClickOnTry() throws InterruptedException {
	if(driver.getTitle().equals("Time Complexity"))
		MDS.clickOndataStructTrybtn();
	Thread.sleep(1000);
	MDS.TestEditor();
	Thread.sleep(1000);
MDS.clickOnRunbtnForDtaStruc();
driver.navigate().back();
Boolean acttextT= driver.getPageSource().contains("Time Complexity");
if(acttextT==true) {
	Assert.assertTrue(true);
	System.out.println("you are back on time complexity page");
}
else {
	Assert.assertTrue(false);
	driver.getWindowHandle();
	System.out.println("you are on Try Editor window");
}
	
}

@Test (priority=4)
public void PracticeQuestion() {
	if(driver.getTitle().equals("Time Complexity"))
	MDS.clickOnPracticeQuestions();
	//boolean PTitle= driver.getPageSource().contains("NumpyNinja");
	if (MDS.PracticeQuespage().equals("Practice Questions")) {
		Assert.assertTrue(false);
		System.out.println("Practice Question is blank");
	}
	else {
		Assert.assertTrue(true);
	}
}





















}

