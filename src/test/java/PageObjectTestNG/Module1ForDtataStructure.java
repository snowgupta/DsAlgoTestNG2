package PageObjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module1ForDtataStructure {
	WebDriver driver;
	public Actions action;


	public Module1ForDtataStructure (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}
	@FindBy (xpath="//a[@href='time-complexity']") WebElement TimeComplexityBtnFrmDataStrucPage;
	@FindBy (xpath="//*[@id=\"content\"]/li") WebElement TimeComplexityBtn; //for GetStated Tab
	@FindBy (xpath = "//*[@id=\"content\"]/a") WebElement dataStrucPractQuestion;
	@FindBy (xpath= "//a[@href='/tryEditor']") WebElement dataStructTrybtn;
	@FindBy (xpath= "//div[@class='input'] ") WebElement tryWindowForDtaStruc;
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")	WebElement PracticeQuestions; 
	@FindBy(xpath="//pre[@role='presentation']/span") 
	public WebElement Editor;//from kusuma

	@FindBy (xpath= "//*[@id=\"answer_form\"]/button") WebElement runbtnForDtaStruc;
	@FindBy (xpath= "//*[@id=\"output\"] ") WebElement dataOutput;
	public void clickontimecomp() {
		TimeComplexityBtn.click();
	}
	public void clickOnTimeComplexityBtnFrmDataStrucPage() {
		TimeComplexityBtnFrmDataStrucPage.click();
	}
	public void clickOnTimeComplexityBtn() {
		TimeComplexityBtn.click();
	}
	public void clickOndataStrucPractQuestion() {
		dataStrucPractQuestion.click();
	}
	public void clickOndataStructTrybtn() {
		dataStructTrybtn.click();
	}

	public void TestEditor()
	{
		action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
	}	

	public void clickOnRunbtnForDtaStruc() throws InterruptedException {
		runbtnForDtaStruc.click();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
	}
	public String outPutForDataStruct() {
		String ResDataStruc = dataOutput.getText();
		return ResDataStruc;
				
	}
	public void clickOnPracticeQuestions() {
		PracticeQuestions.click();
		driver.navigate().back();
	}
	public String PracticeQuespage()
	{
		return driver.getTitle();
	}

}
