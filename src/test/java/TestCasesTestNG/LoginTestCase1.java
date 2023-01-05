package TestCasesTestNG;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.OnHomePage;
import UtilitiesTestNG.ExcelUtils;

public class LoginTestCase1 extends BaseClass {

	OnHomePage onHomePage;
	LoginPage lp;
	GetStartedButton portalPage;
	
	@BeforeClass
	 public void setup3() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			 lp = new LoginPage(driver);
		 }
	
	
	
	@Test (priority=1, dataProvider="logindata")
	public void DDLogin(String ddUsername, String DDPwd) throws InterruptedException {
		
		
		onHomePage.clickOnLoginTab();
		lp.typeUserName(ddUsername);
		lp.typePassword(DDPwd);
		lp.clickLoginBtn();
		Thread.sleep(500);
		String logmsg = onHomePage.loggedin();
		if (logmsg.equals("You are logged in")) {
			System.out.println("you are logged in");
			onHomePage.clickonSignOutbtn();
			
		}
		else {
			System.out.println("username or password is incorrect");
		}
	
		
	}
	@DataProvider (name = "logindata")

	String [][] getData() throws IOException
		 {
			 String path =System.getProperty("user.dir")+ "/src/test/java/TestDataTestNG/DsAlgoRegisterdata.xlsx";
		 int rownum = ExcelUtils.getRowCount(path, "Sheet3");
		 int colcount = ExcelUtils.getCellCount(path, "Sheet3", 1);
		 String logindata[][]= new String [rownum][colcount];
		 System.out.println("excel sheet has opened");
		for (int i=1; i<=rownum; i++) {
			 for (int j=0; j<colcount; j++) {
				logindata [i-1][j]=ExcelUtils.getCellData(path, "Sheet3", i,j);
				 
			 }
		 }
		 return logindata;
		 
		 }
	
	@Test (priority=2)
	public void sucessLogin() throws InterruptedException {
		onHomePage.clickOnLoginTab();
		lp.typeUserName(username);
		lp.typePassword(password);
		lp.clickLoginBtn();
		Thread.sleep(500);
		boolean logmsg=driver.getPageSource().contains("Sign out");
		if(logmsg==true) {
			Assert.assertTrue(true);
			System.out.println("you are sucessfully logged in");
			
		}
		else {
			Assert.assertTrue(false);
			System.out.println("username or password is not correct");
		}
	
	
	
	
	
	}
	
	
	
	
}