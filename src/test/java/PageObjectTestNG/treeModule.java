package PageObjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class treeModule {
	
	WebDriver driver;
	public Actions action;


	public treeModule (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action = new Actions(this.driver);

		
	}
	
	@FindBy (xpath ="//a[@href='tree']")  WebElement TreeClick ;
	@FindBy (xpath = "//h4") WebElement heading;
	@FindBy (xpath ="//a[@href='/tryEditor']")  WebElement teClick ;
	@FindBy(xpath="//pre[@role='presentation']/span") public WebElement Editor;
	@FindBy (xpath= "/html/body/div[2]/div/div[2]/strong/p") WebElement paragaphtext;
	@FindBy (xpath ="//a[@href='overview-of-trees']")  WebElement ovotClick ;
	@FindBy (xpath ="//a[@href='terminologies']")  WebElement termClick ;
	@FindBy (xpath ="//a[@href='types-of-trees']")  WebElement typetreeClick ;
	@FindBy (xpath ="//a[@href='tree-traversals']")  WebElement treetravClick ;
	@FindBy (xpath ="//a[@href='traversals-illustration']")  WebElement travilluClick ;
	@FindBy (xpath ="//a[@href='binary-trees']")  WebElement bintreeClick ;
	@FindBy (xpath ="//a[@href='types-of-binary-trees']")  WebElement typbintreeClick ;
	@FindBy (xpath ="//a[@href='implementation-in-python']")  WebElement imppythonClick ;
	@FindBy (xpath ="//a[@href='binary-tree-traversals']")  WebElement bintreetravClick ;
	@FindBy (xpath ="//a[@href='implementation-of-binary-trees']")  WebElement impbintreeClick ;
	@FindBy (xpath ="//a[@href='applications-of-binary-trees']")  WebElement appbintreeClick ;
	@FindBy (xpath ="//a[@href='binary-search-trees']")  WebElement binsearchtreeClick ;
	@FindBy (xpath ="//a[@href='implementation-of-bst']")  WebElement impbstClick ;
	
		   
	   public String verifytitle()
		{
		 //String NN=Title.getText();
		 //return NN;
		 return driver.getTitle();
		}
	   	 @FindBy(name="username") WebElement in_username;	
		 @FindBy(name="password") WebElement in_password;
		 @FindBy(xpath="//input[@value='Login']") WebElement login_btn;
		
		 public void typeUserName(String RegUserName) {
			 in_username.clear();
			 in_username.sendKeys(RegUserName); 
		 }
		 public void typePassword(String RegPaswrd) {
			 in_password.sendKeys(RegPaswrd);
		 }
		 public void clickLogin() {
			 login_btn.click();
		 }
		 public void ClickTree()
			{
			 TreeClick.click();
			}
		 public String getheading() {
				String head = heading.getText();
				 return head;
			}
		 public String getparagraphText() {
			 String para=paragaphtext.getText();
			 return para;
			}
		 public void OvotClick() {
			 ovotClick.click();
			}
		 public void TEClick() {
			 teClick.click();
			}
		 public void TEditor() {
		     action.moveToElement(Editor).click().sendKeys("print('Hello World')").build().perform();
		   }
		 public void TermClick() {
			 termClick.click();
			}
		 public void TypeofTree() {
			 typetreeClick.click();
		 }
		 public void TreeTrav() {
		 treetravClick.click();
		 }
		 public void TravIllu() {
			 travilluClick.click(); 
		 }
		 public void BinaryTree() {
			 bintreeClick.click();
		 }
		 public void TypeOfBinaryTree() {
			 typbintreeClick.click();
		 }
		 public void ImplementationPython() {
			 imppythonClick.click();
		 }
		 public void BinaryTreeTrav() {
			 bintreetravClick.click();
		 }
		 public void ImplementationBinaryTree() {
			 impbintreeClick.click();
		 }
		 public void ApplicationBinary() {
			 appbintreeClick.click();
		 }
		 public void BinaryTreeSearch() {
			 binsearchtreeClick.click();
		 }
		 public void ImplementationBST() {
			 impbstClick.click();
		 }
	
	
	

}
