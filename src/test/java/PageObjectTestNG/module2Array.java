package PageObjectTestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class module2Array {
	WebDriver driver;
	public Actions action;


	public  module2Array(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}
@FindBy (xpath="//a[@href='arrays-in-python']") WebElement arraysinPythontabFrmArraypage;
@FindBy (xpath="//a[@href='arrays-using-list']") WebElement arraysInUsingListtab;
@FindBy (xpath="//a[@href='basic-operations-in-lists']") WebElement basicOperationtab;
@FindBy (xpath="//a[@href='applications-of-array']") WebElement appliOfArraytab;
@FindBy (xpath= "//a[@href='/tryEditor']") WebElement trybtn;
@FindBy(xpath="//pre[@role='presentation']/span") 
public WebElement Editor;
@FindBy (xpath= "//*[@id=\"answer_form\"]/button") WebElement runbtn;
@FindBy(xpath="//a[contains(text(),'Practice Questions')]")	WebElement PracticeQuestions; 
@FindBy (xpath="//a[@href='/array/practice']") WebElement ArrayPracticeQuestion;	
@FindBy(xpath= "//a[@href='/question/1']") WebElement quest1;
@FindBy (xpath= "//a[@href='/question/2']") WebElement quest2;
@FindBy (xpath="//a[@href='/question/3']") WebElement quest3;
@FindBy(xpath="//a[@href='/question/4']") WebElement quest4;
@FindBy(xpath= "//form[@id='answer_form']/div/div/div/textarea") WebElement EditorBox;


public void sendKeyToArrayPracticeQuestion() {
	EditorBox.sendKeys(Keys.CONTROL + "a");
	EditorBox.sendKeys(Keys.DELETE);

//	EditorBox.sendKeys(Keys.DELETE);
	EditorBox.sendKeys("print('Hello World')");
}

public void clickOnArraysPythonTabfromArray() {
		arraysinPythontabFrmArraypage.click();
	}
	
	public void clickonarraysInUsingListtab() {
		arraysInUsingListtab.click();
	}
	
	public void clickOnbasicOperationtab() {
		basicOperationtab.click();
	}
	
	
	public void clickOnappliOfArraytab() {
		appliOfArraytab.click();
	}
	public void ScrolltoTryherebutton() throws InterruptedException
	  {
	    action.sendKeys(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(2000);
//	   
	  }
	public void ClickOntrybtn() {
		
		trybtn.click();
	}
	public void TestEditor()
	{
		action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
	}	
public void clearTestEditor() {
	EditorBox.clear();
}
	public void clickOnRunbtn() throws InterruptedException {
		runbtn.click();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
	}
	
	
	public void clickOnPracticeQuestions() {
		PracticeQuestions.click();
		driver.navigate().back();
	}
	public String PracticeQuespage()
	{
		return driver.getTitle();
	}
	
	
	
	public void clickOnArrayPracticeQuestion() {
		ArrayPracticeQuestion.click();
	}
	
	public void clickOnquest1() {
		quest1.click();
	}
	public void clickOnquest2() {
		quest2.click();
		
	}
	public void clickOnquest3() {
		quest3.click();
	}
	public void clickOnquest4() {
		quest4.click();	
	}
}
