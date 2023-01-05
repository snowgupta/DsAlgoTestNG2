package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(name="username") WebElement txtUserName;
@FindBy(name="password") WebElement txtPassword;
@FindBy(xpath="//input[@value='Login']") WebElement btnLogin;
@FindBy(xpath="//a[@href='/logout']") WebElement logoutbtn;
@FindBy(xpath="/html/body/div[3]") WebElement invalidUserNameorpwdMsg;

public String invlaiduserorPaswdMsg() {
	invalidUserNameorpwdMsg.getText();
	//return driver.getTitle();
	return invlaiduserorPaswdMsg();
}
public void typeUserName(String uname) throws InterruptedException {
Thread.sleep(500);
	txtUserName.sendKeys(uname);
	
}

public String valiLoginTitle() {
	return driver.getTitle();
}
public void typePassword(String passwrd) throws InterruptedException {
	Thread.sleep(500);
	txtPassword.sendKeys(passwrd);
}
public void clickLoginBtn() throws InterruptedException {
	Thread.sleep(500);
	btnLogin.click();
}
public void clicklogout() {
	logoutbtn.click();
}

}
