package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import PageObjectTestNG.Stack_Module;
import UtilitiesTestNG.Loggerclass;

public class Tc_StackModule extends BaseClass {
	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	LoginPage lp;
	Stack_Module st;
	@BeforeClass
	 public void setupDS() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			lp= new LoginPage (driver);
		MDS =	new Module1ForDtataStructure(driver);
		st = new Stack_Module (driver);
		 }
	
	@Test
	public void User_Login() throws InterruptedException {
		portalPage.ClickOnGetStarButton();
		onHomePage.clickOnLoginTab();
		Thread.sleep(500);
		lp.typeUserName(username);
		lp.typePassword(password);
		lp.clickLoginBtn();
		
	Thread.sleep(500);
		Assert.assertTrue(true);
		Loggerclass.info("User logged in successfully");
	}
	
	@Test(priority=1, description="Stack Page")
	 public void ClickStack() throws Exception {
		//User_Login();
		st.ClickST();
		Thread.sleep(500);
		String actH = st.getheading();
		String expH = "Stack";
		if (actH.equals(expH)) {
			Assert.assertEquals (actH,expH);
			Loggerclass.info("You are on the Stack page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on the Stack page");
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2, description="Operations in Stack")
	 public void ClickOperInStack() throws Exception {
		st.OPSTClick();
		Thread.sleep(500);
		String actPara = st.getparagraphText();
		String expPara = "Operations in Stack";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Operations in Stack page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Operations in Stack page");
			Assert.assertTrue(false);
		}
		st.STClick();
		Thread.sleep(500);
		st.TEditor();
		Thread.sleep(500);
		Loggerclass.info("Operations in Stack page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=3, description="Implementation")
	 public void ClickImplementation() throws Exception {
		st.IMPClick();
		Thread.sleep(500);
		String actPara = st.getparagraphText();
		String expPara = "Implementation";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation page");
			Assert.assertTrue(false);
		}
		st.STClick();
		Thread.sleep(500);
		st.TEditor();
		Thread.sleep(500);
		Loggerclass.info("Implementation page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=4, description="Applications")
	 public void ClickApplications() throws Exception {
		st.STAPPClick();
		Thread.sleep(500);
		String actPara = st.getparagraphText();
		String expPara = "Applications";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Applications page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Applications page");
			Assert.assertTrue(false);
		}
		st.STClick();
		Thread.sleep(500);
		st.TEditor();
		Thread.sleep(500);
		Loggerclass.info("Applications page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	
	
	
	
	

}
