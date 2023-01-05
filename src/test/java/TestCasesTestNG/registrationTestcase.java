package TestCasesTestNG;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
//import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.OnHomePage;
import PageObjectTestNG.registrationPage;
import UtilitiesTestNG.ExcelUtils;
import UtilitiesTestNG.Loggerclass;



public class registrationTestcase extends BaseClass{
	
	OnHomePage onHomePage;
	registrationPage regPage;
	GetStartedButton portalPage;
	@BeforeClass
	 public void setup2() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			 regPage = new registrationPage(driver);
		 }

@Test (priority=1)
public void allfieldsempty() throws InterruptedException {
	//portalPage.ClickOnGetStarButton();
	onHomePage.clickonRegisterButton();
	regPage.UserFieldBlank();
	regPage.PasswordFieldBlank();
	regPage.ConfirmPwdFieldBlank();
	regPage.clickOnRegisBtn();
	Loggerclass.info(" user clicked on registration without filling username");
	
	Thread.sleep(200);
	boolean fieldBlankMsg= driver.getPageSource().contains("Register");
	if (fieldBlankMsg==true) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	
}
@Test (priority=2)
public void passwordFieldBlank() throws InterruptedException {
	regPage.enterUserNameToRegis(regUserName);
	regPage.PasswordFieldBlank();
	regPage.ConfirmPwdFieldBlank();
	regPage.clickOnRegisBtn();
	boolean fieldBlankMesg= driver.getPageSource().contains("Register");
	if (fieldBlankMesg==true) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}

@Test (priority=3, dataProvider="regdata")
public void DataDrivenRegister(String ddUserName, String ddPassword, String ddConfPwd) throws InterruptedException {
	
	onHomePage.clickonRegisterButton();
	regPage.enterUserNameToRegis(ddUserName);
	regPage.enterPasswordToRegis(ddPassword);
	regPage.reEnterPasswordToRegis(ddConfPwd);
	regPage.clickOnRegisBtn();
	Thread.sleep(500);
	String regmsg = driver.findElement(By.xpath("/html/body/div[2]")).getText();
	if (regmsg.equals("New Account Created. You are logged in as "+ddUserName)) {
		System.out.println("New Account Created. You are logged in as"+ddUserName);
		
		onHomePage.clickonSignOutbtn();
	}
	else {
		
		System.out.println("password or username didnt match");
	}
	
	
	
	
	
}


@DataProvider (name = "regdata")

String [][] getData() throws IOException
	 {
		 String path =System.getProperty("user.dir")+ "/src/test/java/TestDataTestNG/DsAlgoRegisterdata.xlsx";
	 int rownum = ExcelUtils.getRowCount(path, "Sheet2");
	 int colcount = ExcelUtils.getCellCount(path, "Sheet2", 1);
	 String regdata[][]= new String [rownum][colcount];
	 System.out.println("excel sheet has opened");
	
	for (int i=1; i<=rownum; i++) {
		 for (int j=0; j<colcount; j++) {
			regdata [i-1][j]=ExcelUtils.getCellData(path, "Sheet2", i,j);
			 
		 }
	 }
	 return regdata;
	 
	 }

@Test (priority=4)
public void sucessRegister() throws InterruptedException {
	onHomePage.clickonRegisterButton();
	regPage.enterUserNameToRegis(regUserName);
	regPage.enterPasswordToRegis(regPassword);
	regPage.reEnterPasswordToRegis(rePassword);
	regPage.clickOnRegisBtn();
	Thread.sleep(500);
boolean sregMsg=driver.getPageSource().contains("Sign out");
	
if(sregMsg==true) {
	Assert.assertTrue(true);
	System.out.println("registered sucessfully");
	onHomePage.clickonSignOutbtn();
	System.out.println("sucesffully logout");
}
else {
	Assert.assertTrue(false);
}
	
	
	
	
	
}





































}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

