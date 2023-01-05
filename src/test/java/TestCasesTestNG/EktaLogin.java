package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.OnHomePage;
import UtilitiesTestNG.Loggerclass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class EktaLogin extends BaseClass{
	
	OnHomePage onHomePage;
	LoginPage lp;
	GetStartedButton portalPage;
	
	@BeforeClass
	 public void setup3() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			 lp = new LoginPage(driver);
		 }
	@Test(dataProvider="LoginCredentials", priority=2)
    @Description("Verifying login credentials")
    @Epic("EP001")
    @Feature("Feature1: Login credentials")
    @Story("Story: Valid Login data")
    @Step("Verifying login credentials")
  public void verifyLoginCredentials(String scenario, String EUsername, String EPassword) throws InterruptedException 
  {
		 portalPage.ClickOnGetStarButton();
     onHomePage.clickOnLoginTab();  

     lp.typeUserName(EUsername);
    
      Loggerclass.info("Username is given");
     lp.typePassword(EPassword);
      Loggerclass.info("Password is given");
      lp.clickLoginBtn();
      Loggerclass.info("Clicked login button");
     
     
     
     if(scenario.equals("bothcorrect"))
     {
      Assert.assertEquals(onHomePage.verifyTitel(), "NumpyNinja");
      Loggerclass.info("You are logged in");
   
     onHomePage.clickonSignOutbtn();

     Thread.sleep(500);
     }
     else if(scenario.equals("bothwrong"))
       
     {
//       ppObj.ClickOnGetStartedButton();
//       hp.signinbutton();
//         lpobj.typeUserName("Username");
////         
////         Loggerclass.info("Username is given");
//         lpobj.typePassword("Password");
////         Loggerclass.info("Password is given");
//         lpobj.clickLogin();
////         Loggerclass.info("Clicked login button");
       
    Assert.assertEquals(lp.invlaiduserorPaswdMsg(), "Invalid Username and Password");
    Loggerclass.info("Incorrect Credentials");
     }
    
  }
    @DataProvider(name="LoginCredentials")
    public Object [][] getData()
    {
     return new Object[][]
       { 
      {"bothcorrect", "ektapz", "Manager@123"},
      {"bothwrong", "ekta", "cjahgs@14"}
      
       }; 
  
    }
    

}
