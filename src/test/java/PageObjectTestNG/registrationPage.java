package PageObjectTestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class registrationPage {
	WebDriver driver;
	public registrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//input[@id= 'id_username']") WebElement UserNameText;
	@FindBy(xpath="//input[@id='id_password1']") WebElement PasswordText;
	@FindBy(xpath="//input[@id='id_password2'] ") WebElement RePasswordText;
	@FindBy(xpath="//input[@value='Register']  ") WebElement RegisterBtn;
	@FindBy(xpath="//a[@href='/logout']") WebElement logoutbtn;
	@FindBy(xpath="/html/head/title") WebElement registPageTitle;
	@FindBy(xpath="/html/body/div[3]") WebElement passwordDidnrMatch;
	
	public String passwrdMisMatchMsg() {
	//String pkm=	passwordDidnrMatch.getText();
		return driver.getTitle();
	
	}
	public void logout() {
		logoutbtn.click();
	}
	
	public String validregisterTitle() {
		return driver.getTitle();
	}
	
	public void UserFieldBlank() throws InterruptedException
	  {
	      Thread.sleep(2000);
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", UserNameText);
	     Assert.assertFalse(is_valid);
	     String message = (String)js.executeScript("return arguments[0].validationMessage;", UserNameText);
	     Assert.assertEquals(message, "Please fill out this field.");
	  }

	public void PasswordFieldBlank() throws InterruptedException
	  {
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", PasswordText);
	    Assert.assertFalse(is_valid);
	    String message = (String)js.executeScript("return arguments[0].validationMessage;", PasswordText);
	    Assert.assertEquals(message, "Please fill out this field.");
	  }

	public void ConfirmPwdFieldBlank() throws InterruptedException
	  {
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", RePasswordText);
	    Assert.assertFalse(is_valid);
	    String message = (String)js.executeScript("return arguments[0].validationMessage;", RePasswordText);
	    Assert.assertEquals(message, "Please fill out this field.");
	  }
	
	
	
	
	
	
	public String verifyRegistrationPage() {
		return driver.getCurrentUrl();
	}
	
public void enterUserNameToRegis(String rUname) {
	UserNameText.sendKeys(rUname);
}

public void enterPasswordToRegis(String rPwd) {
	PasswordText.sendKeys(rPwd);
}
public void reEnterPasswordToRegis(String rrPwd) {
	RePasswordText.sendKeys(rrPwd);
	
}
public void clickOnRegisBtn() {
	RegisterBtn.click();
}
}
