package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedButton { //portal Page
WebDriver driver;

public GetStartedButton (WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy (xpath="//a") WebElement getstartbutton; //for GetStated Tab
@FindBy (xpath = "//h1") WebElement headingtext;
@FindBy (xpath= "/html/body/div[1]/div/div/p") WebElement paragaphtext;

public String getheading() {
String head =	headingtext.getText();
	return head;
}

public String getparagraphText() {
	String para=paragaphtext.getText();
	return para;
}
public void ClickOnGetStarButton() {
	
	getstartbutton.click();
}
}
