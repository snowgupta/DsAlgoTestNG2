package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import PageObjectTestNG.QueueModule;
import UtilitiesTestNG.Loggerclass;

public class TC_ModuleQueue extends BaseClass {
	
	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	LoginPage lp;
	QueueModule qu;
	@BeforeClass
	 public void setupQU() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			lp= new LoginPage (driver);
		MDS =	new Module1ForDtataStructure(driver);
		qu = new QueueModule(driver);
		
		
		 }
	@Test 
	public void User_Login() throws InterruptedException {
		portalPage.ClickOnGetStarButton();
		onHomePage.clickOnLoginTab();
		Thread.sleep(500);
		lp.typeUserName(username);
		lp.typePassword(password);
		lp.clickLoginBtn();
		Assert.assertTrue(true);
		Loggerclass.info("User logged in successfully");
	}
	
	
	@Test(priority=1, description="Queue Page")
	 public void ClickQueue() throws Exception {
		//User_Login();
		qu.ClickQUEUE();
		Thread.sleep(500);
		String actH = qu.getheading();
		String expH = "Queue";
		if (actH.equals(expH)) {
			Assert.assertEquals (actH,expH);
			Loggerclass.info("You are on the Queue page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on the Queue page");
			Assert.assertTrue(false);
		}
	}
	
	
	
	@Test(priority=2, description="Implementation of Queue in Python")
	 public void ClickImplementQueuePython() throws Exception {
		qu.IMPLSTClick();
		Thread.sleep(500);
		String actPara = qu.getparagraphText();
		String expPara = "Implementation of Queue in Python";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation of Queue in Python page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation of Queue in Python page");
			Assert.assertTrue(false);
		}
		qu.QUEUEClick();
		Thread.sleep(500);
		qu.TEditor();
		Loggerclass.info("Implementation of Queue in Python page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=2, description="Implementation using collections.deque")
	 public void ClickImplementCollectDeque() throws Exception {
		qu.IMPCOLLClick();
		Thread.sleep(500);
		String actPara = qu.getparagraphText();
		String expPara = "Implementation using collections.deque";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation using collections.deque page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation using collections.deque page");
			Assert.assertTrue(false);
		}
		qu.QUEUEClick();
		Thread.sleep(500);
		qu.TEditor();
		Loggerclass.info("Implementation using collections.deque page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=3, description="Implementation using array")
	 public void ClickImplementArray() throws Exception {
		qu.IMPARRClick();
		Thread.sleep(500);
		String actPara = qu.getparagraphText();
		String expPara = "Implementation using array";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation using array page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation using array page");
			Assert.assertTrue(false);
		}
		qu.QUEUEClick();
		Thread.sleep(500);
		qu.TEditor();
		Loggerclass.info("Implementation using array page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=4, description="Queue Operations")
	 public void ClickQueueOperation() throws Exception {
		qu.QUEOPClick();
		Thread.sleep(500);
		String actPara = qu.getparagraphText();
		String expPara = "Queue Operations";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Queue Operations page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Queue Operations page");
			Assert.assertTrue(false);
		}
		qu.QUEUEClick();
		Thread.sleep(500);
		qu.TEditor();
		Loggerclass.info("Queue Operations page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	

}
