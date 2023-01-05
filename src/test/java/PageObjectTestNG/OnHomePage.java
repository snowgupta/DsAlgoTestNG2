package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnHomePage {
	WebDriver driver;
	
public OnHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy (xpath= "//*[@id=\"navbarCollapse\"]/div[1]/div/a") WebElement  DataStructureMenu;
@FindBy(xpath ="//a[text()='Data Structures']") public WebElement DsOpenDropdown;
@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") public WebElement ArrayDropdown;
@FindBy (xpath="//a[text()='Linked List']") public WebElement LinkedListDropdown;
@FindBy (xpath="//a[text()='Stack']") public WebElement StackDropdown;
@FindBy (xpath="//a[text()='Queue']") public WebElement QueueDropdown;
@FindBy (xpath="//a[text()='Tree']") public WebElement TreeDropdown ;
@FindBy (xpath="//a[text()='Graph']") public WebElement GraphDropdown ;
@FindBy (xpath="//div[@class='nav-item dropdown show']") public WebElement DsCloseDropdown;
@FindBy (xpath = "//a[ @href = '/login']") WebElement loginbutton;
@FindBy (xpath= "   //*[@id=\"navbarCollapse\"]/div[2]/ul/a[3] ") WebElement signOutbtn;
@FindBy (xpath = "//a [@href='/register']") WebElement RegisterButton;
@FindBy (xpath= "//a [@href='data-structures-introduction']") WebElement DataStructuresbutton;
@FindBy (xpath = "//a [@href='array']") WebElement ArrayGetStartedButton;
@FindBy (xpath = "//a [@href='linked-list']") WebElement LinkedListGetButton;
@FindBy (xpath ="//a [@href='stack']") WebElement SatckGetStartedButton;
@FindBy (xpath ="//a [@href='queue']") WebElement QueueGetStartedButton;
@FindBy (xpath = "//a [@href='tree']") WebElement TreeGetStartedButton;
@FindBy (xpath = "//a [@href='graph']") WebElement GraphGetStartedButton;
@FindBy (xpath= "//a[text()='NumpyNinja']") WebElement numpiNinjaTitleText;
@FindBy (xpath= "//div[contains(text(), 'You are not logged in')]") public WebElement NotlogedinMsg;
@FindBy(xpath="//html/body/div[2]") public WebElement loggedInMessage;
@FindBy (xpath= " /html/body/div[2]/text() ") WebElement regSuccessfullMsg;
public String verifyUserRegisterMsg() {
	String regmessage = regSuccessfullMsg.getText();
	 System.out.println("You are sucessfully registered");
	 return regmessage;}

public String loggedin() {
	String logInMsg = loggedInMessage.getText();
	return logInMsg;
}

public String Notloggedin()
{
 String message = NotlogedinMsg.getText();
 System.out.println("You are not logged in");
 return message;
}

public  String verifyTitel() {
	return driver.getTitle();
}

public void OpenDsDropdown()
{
 DsOpenDropdown.click();
 
}

public void Array()
{
 ArrayDropdown.click();
}

public void LinkedList()
{
 LinkedListDropdown.click();
}

public void Stack()
{
 StackDropdown.click();
}

public void Queue()
{
 QueueDropdown.click();
}

public void Tree()
{
 TreeDropdown.click();
}

public void Graph()
{
 GraphDropdown.click();
}

public void CloseDSDropdown()
{
 DsCloseDropdown.click();
}

public void ClickOnDataStructureMenubutton() {
	DataStructureMenu.click();
}

public void clickOnLoginTab() {
	loginbutton.click();
}

public void clickonRegisterButton() {
	RegisterButton.click();
}
public void clickOnDataStructureGetStarted() //for datastructure getstatrted button
{
	DataStructuresbutton.click();
	
	}
public void clickOnArrayGetStartedBtn() {
	ArrayGetStartedButton.click();
}
public void clickOnLinkedListGetStartedButton() {
	LinkedListGetButton.click();
}
public void clickOnStackGetStartedButton() {
	SatckGetStartedButton.click();
}
public void clickOnQueueGetStartedButton() {
	QueueGetStartedButton.click();
}
public void clickOnTreeGetStartedButton() {
	TreeGetStartedButton.click();
}
public void clickOnGraphGetStartedButton() {
	GraphGetStartedButton.click();
}
public void clickonSignOutbtn() {
	signOutbtn.click();
}
}
