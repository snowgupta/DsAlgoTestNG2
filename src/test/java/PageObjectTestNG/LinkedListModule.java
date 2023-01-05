package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListModule {
	WebDriver driver;
	public Actions action;
	

	public LinkedListModule (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}
	@FindBy (xpath ="//a[@href='linked-list']")  WebElement llClick ;
	@FindBy (xpath = "//h4") WebElement heading;
	@FindBy (xpath= "/html/body/div[2]/div/div[2]/strong/p") WebElement paragaphtext;
	@FindBy (xpath ="//a[@href='/tryEditor']")  WebElement lledClick ;
	@FindBy(xpath="//pre[@role='presentation']/span") public WebElement Editor;
	@FindBy (xpath ="//a[@href='introduction']")  WebElement introClick ;
	@FindBy (xpath ="//a[@href='creating-linked-list']")  WebElement cllClick ;
	@FindBy (xpath ="//a[@href='types-of-linked-list']")  WebElement tllClick ;
	@FindBy (xpath ="//a[@href='implement-linked-list-in-python']")  WebElement illpClick ;
	@FindBy (xpath ="//a[@href='traversal']")  WebElement travClick;
	@FindBy (xpath ="//a[@href='insertion-in-linked-list']")  WebElement insllpClick ;
	@FindBy (xpath ="//a[@href='deletion-in-linked-list']")  WebElement dllClick ;
	
	public void ClickLL () {
		llClick.click();
	}
	public String getheading() {
		String head = heading.getText();
		return head;
	}
	public String getparagraphText() {
		String para=paragaphtext.getText();
		return para;
	}
	public void LLClick() {
		lledClick.click();
	} 
	public void TEditor() {
	    action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
	}
	public void INTROClick()
	{
		introClick.click();
	}
	public void CLLClick()
	{
		cllClick.click();
	}
	public void TLLClick()
	{
		tllClick.click();
	}
	public void ILLPClick()
	{
		illpClick.click();
	}
	public void TRAVClick()
	{
		travClick.click();
	}
	public void INSLLClick()
	{
		insllpClick.click();
	}
	public void DLLClick()
	{
		dllClick.click();
	}
}
