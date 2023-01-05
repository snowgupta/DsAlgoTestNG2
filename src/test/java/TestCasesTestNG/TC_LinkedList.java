package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LinkedListModule;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import UtilitiesTestNG.Loggerclass;

public class TC_LinkedList extends BaseClass {
	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	LoginPage lp;
	LinkedListModule ll;
	
	@BeforeClass
	 public void setupLL() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			lp= new LoginPage (driver);
		MDS =	new Module1ForDtataStructure(driver);
		ll= new LinkedListModule(driver);
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

	@Test(priority=1, description="Linked List Page")
	 public void ClickLinkedList() throws Exception {
		//User_Login();
		ll.ClickLL();
		Thread.sleep(500);
		String actH = ll.getheading();
		String expH = "Linked List";
		if (actH.equals(expH)) {
			Assert.assertEquals (actH,expH);
			Loggerclass.info("You are on the Linked List page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on the Linked List page");
			Assert.assertTrue(false);
		}
	}

	@Test(priority=2, description="Introduction")
	 public void ClickIntroduction() throws Exception {
		ll.INTROClick();
		Thread.sleep(500);
		String actPara = ll.getparagraphText();
		String expPara = "Introduction";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Introduction page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Introduction page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Introduction page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=3, description="Creating Linked LIst")
	 public void ClickCreatingLinkedList() throws Exception {
		ll.CLLClick();
		String actPara = ll.getparagraphText();
		String expPara = "Creating Linked LIst";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Creating Linked LIst page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Creating Linked LIst page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Creating Linked LIst page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=4, description="Types of Linked List")
	 public void ClickTypeLinkedList() throws Exception {
		ll.TLLClick();
		Thread.sleep(500);
		String actPara = ll.getparagraphText();
		String expPara = "Types of Linked List";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Types of Linked List page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Types of Linked List page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Types of Linked List page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=5, description="Implement Linked List in Python")
	 public void ClickImpLinkedListPython() throws Exception {
		ll.ILLPClick();
	Thread.sleep(500);
		String actPara = ll.getparagraphText();
		String expPara = "Implement Linked List in Python";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implement Linked List in Python page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implement Linked List in Python page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Implement Linked List in Python page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=6, description="Traversal")
	 public void ClickTraversal() throws Exception {
		ll.TRAVClick();
		Thread.sleep(500);
		String actPara = ll.getparagraphText();
		String expPara = "Traversal";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Traversal page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Traversal page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Traversal page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=7, description="Insertion")
	 public void ClickInsertion() throws Exception {
		ll.INSLLClick();
		String actPara = ll.getparagraphText();
		String expPara = "Insertion";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Insertion page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Insertion page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Insertion page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=8, description="Deletion")
	 public void ClickDeletion() throws Exception {
		ll.DLLClick();
		Thread.sleep(500);
		String actPara = ll.getparagraphText();
		String expPara = "Deletion";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Deletion page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Deletion page");
			Assert.assertTrue(false);
		}
		ll.LLClick();
		Thread.sleep(500);
		ll.TEditor();
		Loggerclass.info("Deletion page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	
	
	

}
