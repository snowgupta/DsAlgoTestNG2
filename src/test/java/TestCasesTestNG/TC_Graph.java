package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.Graph;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.GraphModule;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import PageObjectTestNG.module2Array;
import UtilitiesTestNG.Loggerclass;

public class TC_Graph extends BaseClass{
	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	LoginPage lp;
	GraphModule gr;
//	String RegUserName = "khush2023";
//	String RegPaswrd = "Hello@123";

	@BeforeClass
	 public void setupgraph() throws InterruptedException
	 {
		portalPage = new GetStartedButton(driver);
		onHomePage = new OnHomePage(driver);
		lp= new LoginPage (driver);
	MDS =	new Module1ForDtataStructure(driver);
	gr = new GraphModule(driver);
	
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
		//Loggerclass.info("User logged in successfully");
	}

	@Test(priority=1, description="Graph Page")
	 public void ClickGraphPage() throws Exception {
		//User_Login();
		gr.ClickGR();
		Thread.sleep(500);
		String actH = gr.getheading();
		String expH = "Graph";
		if (actH.equals(expH)) {
			Assert.assertEquals (actH,expH);
			Loggerclass.info("You are on the Graph page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on the Graph page");
			Assert.assertTrue(false);
		}
	}

	@Test(priority=2, description="Graph")
	 public void ClickGraph() throws Exception {
		gr.GRAPHClick();
		Thread.sleep(500);
		String actPara = gr.getparagraphText();
		String expPara = "Graph";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Graph page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Graph page");
			Assert.assertTrue(false);
		}
		gr.GREDClick();
		Thread.sleep(500);
		gr.TEditor();
		Loggerclass.info("Graph verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test(priority=3, description="Graph Representations")
	 public void ClickGraphRep() throws Exception {
		gr.GRREPClick();
		Thread.sleep(500);
		String actPara = gr.getparagraphText();
		String expPara = "Graph Representations";
		if (actPara.equals(expPara)) {
			Assert.assertEquals (actPara,expPara);
			Loggerclass.info("You are on Graph Representations page");
			Assert.assertTrue(true);
		}
		else {
			Loggerclass.info("You are not on Graph Representations page");
			Assert.assertTrue(false);
		}
		gr.GREDClick();
		Thread.sleep(500);
		gr.TEditor();
		Loggerclass.info("Graph Representations verified successfully");
		driver.navigate().back();
		driver.navigate().back();
	}

}
