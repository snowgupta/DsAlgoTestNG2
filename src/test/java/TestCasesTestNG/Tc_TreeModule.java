package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import PageObjectTestNG.treeModule;
import UtilitiesTestNG.Loggerclass;

public class Tc_TreeModule extends BaseClass {
	
	

	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	LoginPage lp;
	treeModule tp;
	@BeforeClass
	 public void setupTM() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			lp= new LoginPage (driver);
		MDS =	new Module1ForDtataStructure(driver);
		tp= new treeModule(driver);
		
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
	
	@Test(priority=1, description="Tree Page")
	 public void ClickTree() throws Exception {
		//User_Login();
		tp.ClickTree();
		Thread.sleep(500);

		String actH = tp.getheading();
		String expH = "Tree";	
		if (actH.equals(expH)) {
			Assert.assertEquals (actH,expH);
			Loggerclass.info("You are on the Tree page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on the Tree page");
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2, description="Overview of Tree Page")
	 public void ClickOVT() throws Exception {
		tp.OvotClick();
		String actPara = tp.getparagraphText();
		String expPara = "Overview of Trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Overview of Trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Overview of Trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Overview of Trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=3, description="Terminologies Page")
	 public void TERMClick() throws Exception {
		tp.TermClick();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Terminologies";
		
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Terminologies page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Terminologies page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Terminologies page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=4, description="Types of Trees Page")
	 public void TypeOfTree() throws Exception {
		tp.TypeofTree();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Types of Trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Types of Trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Types of Trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Types of Trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=5, description="Tree Traversals Page")
	 public void TreeTraversal() throws Exception {
		tp.TreeTrav();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Tree Traversals";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Tree Traversals page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Tree Traversals page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Tree Traversals page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=6, description="Traversals-Illustration Page")
	 public void TreeIllustration() throws Exception {
		tp.TravIllu();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Traversals-Illustration";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Traversals-Illustration page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Traversals-Illustration page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Traversals-Illustration page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=7, description="Binary Trees")
	 public void BinaryTree() throws Exception {
		tp.BinaryTree();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Binary Trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Binary Trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Binary Trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Binary Trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=8, description="Types of Binary Trees")
	 public void TypesOfBinaryTree() throws Exception {
		tp.TypeOfBinaryTree();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Types of Binary Trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Types of Binary Trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Types of Binary Trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Types of Binary Trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=9, description="Implementation in Python")
	 public void ImplementationInPython() throws Exception {
		tp.ImplementationPython();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Implementation in Python";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation in Python page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation in Python page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Implementation in Python page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=10, description="Binary Tree Traversals")
	 public void BinaryTreeTraversals() throws Exception {
		tp.BinaryTreeTrav();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Binary Tree Traversals";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Binary Tree Traversals page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Binary Tree Traversals page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Binary Tree Traversals page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=11, description="Implementation of Binary Trees")
	 public void ImplementationBinaryTree() throws Exception {
		tp.ImplementationBinaryTree();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Implementation of Binary Trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation of Binary Trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation of Binary Trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Implementation of Binary Trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=12, description="Applications of Binary trees")
	 public void ApplicationBinaryTree() throws Exception {
		tp.ApplicationBinary();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Applications of Binary trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Applications of Binary trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Applications of Binary trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Applications of Binary trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=13, description="Applications of Binary trees")
	 public void BinarySearchTree() throws Exception {
		tp.BinaryTreeSearch();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Binary Search Trees";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Binary Search Trees page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Binary Search Trees page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Binary Search Trees page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=14, description="Implementation Of BST")
	 public void ImplementionBST() throws Exception {
		tp.ImplementationBST();
		Thread.sleep(500);
		String actPara = tp.getparagraphText();
		String expPara = "Implementation Of BST";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Implementation Of BST page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Implementation Of BST page");
			Assert.assertTrue(false);
		}
		tp.TEClick();
		Thread.sleep(500);
		tp.TEditor();
		Loggerclass.info("Implementation Of BST page verified successfully");
		driver.navigate().back();
		driver.navigate().back();
		onHomePage.clickonSignOutbtn();
		Loggerclass.info("I am logging off from NumpyNinja");
	}
	
	

}
