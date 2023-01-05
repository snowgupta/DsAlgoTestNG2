package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphModule {

	WebDriver driver;
	public Actions action;
	

	public GraphModule (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}

	@FindBy (xpath ="//a[@href='graph']")  WebElement grClick ;
	@FindBy (xpath = "//h4") WebElement heading;
	@FindBy (xpath= "/html/body/div[2]/div/div[2]/strong/p") WebElement paragaphtext;
	@FindBy (xpath ="//a[@href='/tryEditor']")  WebElement gredClick ;
	@FindBy(xpath="//pre[@role='presentation']/span") public WebElement Editor;
	@FindBy (xpath ="//a[@href='graph']")  WebElement graphClick ;
	@FindBy (xpath ="//a[@href='graph-representations']")  WebElement grrepClick ;	

	public void ClickGR () {
		grClick.click();
	}
	public String getheading() {
		String head = heading.getText();
		return head;
	}
	public String getparagraphText() {
		String para=paragaphtext.getText();
		return para;
	}
	public void GREDClick() {
		gredClick.click();
	} 
	public void TEditor() {
	    action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
	}
	public void GRAPHClick() {
		graphClick.click();
	} 
	public void GRREPClick()
	{
		grrepClick.click();
	}
}
