package TestCasesTestNG;




import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.OnHomePage;
import UtilitiesTestNG.ReportingListner;
@Listeners(ReportingListner.class)
public class TestHomePage extends BaseClass {
	 OnHomePage onHomePage;
	GetStartedButton portalPage ;
	LoginPage lp;
	@BeforeClass 
	 public void setup1() {
		portalPage = new GetStartedButton(driver);
		onHomePage = new OnHomePage(driver);
		lp = new LoginPage(driver);
	 }
	@Test (priority=1)
	 public void HomePAgetest() throws Exception
	 {
	  portalPage.ClickOnGetStarButton();
//		String actHlink= driver.getCurrentUrl();
//String expHlink= "https://dsportalapp.herokuapp.com/home";
	  if (onHomePage.verifyTitel().equals("NumpyNinja"))
	  {
	      //Pass
	   Assert.assertTrue(true);
	      System.out.println("you are on homepage ");
	  }
	  else 
	      //Fail
	  {
	   try 
	          {
	               
	                Assert.assertTrue(false);
	              }
	       catch(Exception e)
	          {
	          //log
	          e.printStackTrace();
	          Assert.assertTrue(false);
	          }
	  }
	  }
			  
	@Test (priority=2)
	public void checkLoginWarningMsg() {
		if (onHomePage.verifyTitel().equals("NumpyNinja"))
		{
			onHomePage.clickOnDataStructureGetStarted();
			
		}
		else {
			portalPage.ClickOnGetStarButton();
		
	onHomePage.clickOnDataStructureGetStarted();
		}
		onHomePage.clickOnStackGetStartedButton();
		Assert.assertEquals(onHomePage.Notloggedin(), "You are not logged in");
		driver.switchTo().defaultContent();
	}
		@Test (priority=3)
	public void CheckDataStructureMenu() throws InterruptedException {
	Thread.sleep(1000);
	if (onHomePage.verifyTitel().equals("NumpyNinja"))
	{
		onHomePage.ClickOnDataStructureMenubutton();
		
	}
	else {
		portalPage.ClickOnGetStarButton();
	 onHomePage.ClickOnDataStructureMenubutton();
	}
	Assert.assertEquals(onHomePage.DsOpenDropdown.getText(), "Data Structures");
	Assert.assertEquals(onHomePage.ArrayDropdown.getText(), "Arrays");
	Assert.assertEquals(onHomePage.LinkedListDropdown.getText(), "Linked List");
	Assert.assertEquals(onHomePage.StackDropdown.getText(), "Stack");
	Assert.assertEquals(onHomePage.QueueDropdown.getText(), "Queue");
	Assert.assertEquals(onHomePage.TreeDropdown.getText(), "Tree");
	Assert.assertEquals(onHomePage.GraphDropdown.getText(), "Graph");
	//onHomePage.CloseDSDropdown();
	driver.switchTo().defaultContent();
	}
//@Test (priority=4)	
//public void Login() {
//	if (onHomePage.verifyTitel().equals("NumpyNinja"))
//	{
//		onHomePage.clickOnDataStructureGetStarted();
//		
//	}
//	else {
//		portalPage.ClickOnGetStarButton();
//	
//onHomePage.clickOnLoginTab();
//	}
////	onHomePage.clickOnLoginTab();
////	
////	
////	lp = new LoginPage(driver);
//	 //driver.navigate().back();
//lp.typeUserName(username);
//lp.typePassword(password);
//lp.clickLoginBtn();
//
//}
}
