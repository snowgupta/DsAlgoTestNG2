package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack_Module {
	
	
	WebDriver driver;
	public Actions action;


	public Stack_Module(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}
	
	
	
	@FindBy (xpath ="//a[@href='stack']")  WebElement stClick ;
	@FindBy (xpath = "//h4") WebElement heading;
	@FindBy (xpath= "/html/body/div[2]/div/div[2]/strong/p") WebElement paragaphtext;
	@FindBy (xpath ="//a[@href='/tryEditor']")  WebElement stedClick ;
	@FindBy(xpath="//pre[@role='presentation']/span") public WebElement Editor;
	@FindBy (xpath ="//a[@href='operations-in-stack']")  WebElement opstClick ;
	@FindBy (xpath ="//a[@href='implementation']")  WebElement impClick ;	
	@FindBy (xpath ="//a[@href='stack-applications']")  WebElement stappClick ;
	
	public void ClickST () {
		stClick.click();
	}
	public String getheading() {
		String head = heading.getText();
		return head;
	}
	public String getparagraphText() {
		String para=paragaphtext.getText();
		return para;
	}
	public void STClick() {
		stedClick.click();
	} 
	public void TEditor() {
	    action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
	}
	public void OPSTClick()
	{
		opstClick.click();
	}
	public void IMPClick()
	{
		impClick.click();
	}
	public void STAPPClick()
	{
		stappClick.click();
	}

}
