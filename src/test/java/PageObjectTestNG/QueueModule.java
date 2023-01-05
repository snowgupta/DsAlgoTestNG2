package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueueModule {
	
	WebDriver driver;
	public Actions action;


	public QueueModule (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}
	@FindBy (xpath ="//a[@href='queue']")  WebElement queClick ;
	@FindBy (xpath = "//h4") WebElement heading;
	@FindBy (xpath= "/html/body/div[2]/div/div[2]/strong/p") WebElement paragaphtext;
	@FindBy (xpath ="//a[@href='/tryEditor']")  WebElement queedClick ;
	@FindBy(xpath="//pre[@role='presentation']/span") public WebElement Editor;
	@FindBy (xpath ="//a[@href='implementation-lists']")  WebElement implstClick ;
	@FindBy (xpath ="//a[@href='implementation-collections']")  WebElement impcollClick ;	
	@FindBy (xpath ="//a[@href='Implementation-array']")  WebElement imparrClick ;
	@FindBy (xpath ="//a[@href='QueueOp']")  WebElement queopClick ;
	
	public void ClickQUEUE () {
		queClick.click();
	}
	public String getheading() {
		String head = heading.getText();
		return head;
	}
	public String getparagraphText() {
		String para=paragaphtext.getText();
		return para;
	}
	public void QUEUEClick() {
		queedClick.click();
	} 
	public void TEditor() {
	    action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
	}
	public void IMPLSTClick()
	{
		implstClick.click();
	}
	public void IMPCOLLClick()
	{
		impcollClick.click();
	}
	public void IMPARRClick()
	{
		imparrClick.click();
	}
	public void QUEOPClick()
	{
		queopClick.click();
	}
	
	
	
	
	
	

}
