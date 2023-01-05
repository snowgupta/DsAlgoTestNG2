package TestCasesTestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import PageObjectTestNG.LoginPage;
import PageObjectTestNG.Module1ForDtataStructure;
import PageObjectTestNG.OnHomePage;
import PageObjectTestNG.module2Array;
import UtilitiesTestNG.Loggerclass;

public class Module2Array_Test extends BaseClass{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	GetStartedButton portalPage;
	OnHomePage onHomePage;
	Module1ForDtataStructure MDS;
	module2Array ModArr;
	LoginPage lp;
	@BeforeClass
	 public void setupDS() {
			portalPage = new GetStartedButton(driver);
			onHomePage = new OnHomePage(driver);
			lp= new LoginPage (driver);
		MDS =	new Module1ForDtataStructure(driver);
		ModArr = new module2Array(driver);
		
		 }
	
	@Test (priority=1)
	public void EnterArraysInPython() throws InterruptedException {
		portalPage.ClickOnGetStarButton();
		onHomePage.clickOnLoginTab();
		Thread.sleep(500);
		lp.typeUserName(username);
		Loggerclass.info(" user provided valid username");
		lp.typePassword(password);
		Loggerclass.info(" user provided valid password");
		lp.clickLoginBtn();
		Loggerclass.info(" user Signed in");
		//if( (driver.getTitle().equals("Sign out")))
		
			onHomePage.clickOnArrayGetStartedBtn();
		boolean arrypagetitle= driver.getPageSource().contains("Array");
		Loggerclass.info(" user is on Array page");
		if (arrypagetitle==true) {
			Assert.assertTrue(true);
			System.out.println("you are on Array Page");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("you are not on array page");
		}
	}
	
	@Test (priority=2)
	public void enterOnArraysinPython() throws InterruptedException {
		if(driver.getTitle().equals("Array")) {
			Thread.sleep(500);
//		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
			//jse.executeScript("window.scrollBy(0,250)");
		ModArr.clickOnArraysPythonTabfromArray();
		boolean arraypythonPT= driver.getPageSource().contains("Arrays in Python");
		if (arraypythonPT==true) {
			Assert.assertTrue(true);
			System.out.println("you are on arrays on python page");
			Loggerclass.info(" user is on Array on Python page");
		}}
		else {
			System.out.println("you are not arrays on python page");
		}
	
	}
	
	@Test (priority=3)
	public void tryArraysinPython() throws InterruptedException {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
		if(driver.getTitle().equals("Arrays in Python")) {
			
			ModArr.ScrolltoTryherebutton();
			ModArr.ClickOntrybtn();
		ModArr.TestEditor();
		Thread.sleep(500);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		driver.navigate().back();
		boolean APtit= driver.getPageSource().contains("Arrays in Python");
		if (APtit==true) {
			Assert.assertTrue(true);
			System.out.println("you sucessfully tried Arrays in Python");
			Loggerclass.info(" usersucessfully tried Arrays in Python");
		}}
		else {
			System.out.println("you couldn't try python Code");
		}
	}
	
	
	@Test (priority=4)
	public void enterArraysUsingList() throws InterruptedException {
		 if(driver.getTitle().equals("Array")) {
			ModArr.clickonarraysInUsingListtab();
			Thread.sleep(500);
			 boolean arrPageTitle= driver.getPageSource().contains("Arrays Using List");
			 if(arrPageTitle==true) {
				 Assert.assertTrue(true);
				 System.out.println("you are on Array Using List Page");
				 Loggerclass.info(" user is on Array Using List Page");
			 }
			 
			 else {
				 Assert.assertTrue(false);
				 System.out.println("You are not on Array Using List Page");
			 }
			 
		 }
	
		 else {
			 System.out.println("you are not on Array Page");
			 
		 }
	}
	
	
	@Test (priority=5)
	public void tryforArraysUsingList() throws InterruptedException{
		
if(driver.getTitle().equals("Arrays Using List")) {
			
			ModArr.ScrolltoTryherebutton();
			ModArr.ClickOntrybtn();
		ModArr.TestEditor();
		Thread.sleep(500);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		driver.navigate().back();
		boolean AULtit= driver.getPageSource().contains("Arrays Using List");
		if (AULtit==true) {
			Assert.assertTrue(true);
			System.out.println("you sucessfully tried Arrays Using List");
			Loggerclass.info(" user sucessfully tried Arrays Using List");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("you couldn't try Arrays Using List");
		}
		}
		else {
			System.out.println("you are not on Array Using List Page");
		}
		
		
		
	}
	
	
	@Test (priority=6)
	
	public void enteringToBasicOperationList() throws InterruptedException {
		 if(driver.getTitle().equals("Array")) {
			 ModArr.clickOnbasicOperationtab();
			 Thread.sleep(500);
			 Loggerclass.info(" varified user is onArray Page");
		 boolean BOPTi= driver.getPageSource().contains("Basic Operations in Lists");
		 if (BOPTi==true) {
			 Assert.assertTrue(true);
			 System.out.println("you are on Basic Operation List Page");
			 Loggerclass.info(" Varified user is on Basic Operation page");
		 }
		 else {
			 Assert.assertTrue(false); 
			 System.out.println("you are not on Basic Operation List Page");
		 }
		 
		  }
		 else {
			System.out.println("you are not on array page"); 
		 }
		
		}
	
	@Test (priority=7)
	public void tryPythonCodeinOperationBasic() throws InterruptedException {
		
if(driver.getTitle().equals("Basic Operations in Lists")) {
			
			ModArr.ScrolltoTryherebutton();
			ModArr.ClickOntrybtn();
		ModArr.TestEditor();
		Thread.sleep(500);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		driver.navigate().back();
		boolean BOPtit= driver.getPageSource().contains("Basic Operations in Lists");
		if (BOPtit==true) {
			Assert.assertTrue(true);
			System.out.println("you sucessfully tried Basic Operations in Lists");
			Loggerclass.info(" user sucessfully tried Basic Operations in Lists");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("you couldn't Basic Operations in Lists");
		}
		}
		else {
			System.out.println("you are not on Basic Operations in Lists");
		}
		}
	
	@Test (priority=8)
	public void entereningToApplicationOfArray() {
		 if(driver.getTitle().equals("Array")) {
			 ModArr.clickOnappliOfArraytab();
			 boolean AAPT=driver.getPageSource().contains("Applications of Array");
			 if (AAPT==true) {
				 Assert.assertTrue(true);
				 System.out.println("you are on Application of Array page");
				 
			 }
			 else {
				 Assert.assertTrue(false);
				 System.out.println("you are not on Application of Array page");
				 
			 }
		 }
	
	
		 else {
			 System.out.println("you are not on array Page");
		 }
	
	}
	
	@Test (priority=9)
	public void tryPythonCodeInApplicationOfArray() throws InterruptedException {
if(driver.getTitle().equals("Applications of Array")) {
			
			ModArr.ScrolltoTryherebutton();
			ModArr.ClickOntrybtn();
		ModArr.TestEditor();
		Thread.sleep(500);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		driver.navigate().back();
		boolean BOPtit= driver.getPageSource().contains("Applications of Array");
		if (BOPtit==true) {
			Assert.assertTrue(true);
			System.out.println("you sucessfully tried Applications of Array");
			Loggerclass.info(" user sucessfully tried Applications of Array");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("you couldn't try Applications of Array");
		}
		}
		else {
			System.out.println("you are not on Applications of Array");
		}

	}
	
	
	@Test (priority=10)
	public void tryPracticeQuestionForArray() {
		ModArr.clickOnappliOfArraytab();
		if (driver.getTitle().equals("Applications of Array")) {
			
			ModArr.clickOnArrayPracticeQuestion();
			
			if (MDS.PracticeQuespage().equals("Practice Questions")) {
				Assert.assertTrue(true);
				System.out.println("Practice Question Page");
			}
			else {
				Assert.assertTrue(false);
			}	
			
			
		}
		
		else {
			System.out.println("you are not on Application of array for Practice question");
			
		}
		}
	
	
	@Test (priority=11)
	public void tryQuestin1() throws InterruptedException {
	
			
			ModArr.clickOnquest1();
			
		boolean q1PTi= driver.getPageSource().contains("QUESTION");
		if(q1PTi==true) {
			Assert.assertTrue(true);
			System.out.println("Please write your code here");
			//ModArr.clearTestEditor();
			Thread.sleep(500);
			//ModArr.TestEditor();
			ModArr.sendKeyToArrayPracticeQuestion();
			Thread.sleep(1000);
			ModArr.clickOnRunbtn();
			Thread.sleep(500);
			
			
		}
		else{
			Assert.assertTrue(false);
			System.out.println("you are not on question 1");
		}
			
		}
	
	
	@Test (priority=12)
	
	public void tryQuestin2() throws InterruptedException {
		
		
		ModArr.clickOnquest2();
		
	boolean q1PTi= driver.getPageSource().contains("QUESTION");
	if(q1PTi==true) {
		Assert.assertTrue(true);
		System.out.println("Please write your code here to try question2");
		//ModArr.clearTestEditor();
		Thread.sleep(500);
		//ModArr.TestEditor();
		ModArr.sendKeyToArrayPracticeQuestion();
		Thread.sleep(1000);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		
		
	}
	else{
		Assert.assertTrue(false);
		System.out.println("you are not on question 2");
	}
		
	}


	@Test (priority=13)
	
	public void tryQuestin3() throws InterruptedException {
		
		
		ModArr.clickOnquest3();
		
	boolean q1PTi= driver.getPageSource().contains("QUESTION");
	if(q1PTi==true) {
		Assert.assertTrue(true);
		System.out.println("Please write your code here");
		//ModArr.clearTestEditor();
		Thread.sleep(500);
		//ModArr.TestEditor();
		ModArr.sendKeyToArrayPracticeQuestion();
		Thread.sleep(1000);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		
		
	}
	else{
		Assert.assertTrue(false);
		System.out.println("you are not on question 3");
	}
		
	}

@Test (priority=14)
	public void tryQuestin4() throws InterruptedException {
		
		
		ModArr.clickOnquest4();
		
	boolean q1PTi= driver.getPageSource().contains("QUESTION");
	if(q1PTi==true) {
		Assert.assertTrue(true);
		System.out.println("Please write your code here");
		//ModArr.clearTestEditor();
		Thread.sleep(500);
		//ModArr.TestEditor();
		ModArr.sendKeyToArrayPracticeQuestion();
		Thread.sleep(1000);
		ModArr.clickOnRunbtn();
		Thread.sleep(500);
		
		
	}
	else{
		Assert.assertTrue(false);
		System.out.println("you are not on question 4");
	}
		
	}






}
