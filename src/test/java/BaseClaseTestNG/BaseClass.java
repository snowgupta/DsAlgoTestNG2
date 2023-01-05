package BaseClaseTestNG;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import PageObjectTestNG.GetStartedButton;

//import PageObjectTestNG.GetStartedButton;
import UtilitiesTestNG.Readconfig;

public class BaseClass {
	Readconfig readconfig = new Readconfig ();
	public String baseurl = readconfig.MainHomepageURL();
			//"https://dsportalapp.herokuapp.com/";
public String username = readconfig.EnterUserName();
//"numpininja001";
public String password= readconfig.EnterPassWord();

public String regUserName = readconfig.EnterUserNameToRegister();
public String  regPassword = readconfig.EnterPasswordToRegister();
public String rePassword = readconfig.ConfirmpasswordToRegister();
public String pythonCode= readconfig.enterPythonCode();
//"Ninja@123";
public static WebDriver driver;
@Parameters("browser")
@BeforeClass
public void setup(String brow) {
	if (brow.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			//"C:/Users/snowg/eclipse-workspace/DsAlgoTestNG/DriversSrc/chromedriver.exe");
driver = new ChromeDriver();

	}
	else if (brow.equals("firefox")) {
System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());

		driver = new FirefoxDriver();
		
	}
	else if (brow.equals("edge")) {
System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
		driver = new EdgeDriver();
		
	}

driver.get(baseurl);
driver.manage().window().maximize();
GetStartedButton gt = new GetStartedButton (driver);
gt.ClickOnGetStarButton();
}



public void failed(String testMethodName) {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src, new File("C:/work/screenshots.png"));// give the folder path where you want to save the screenshot
	try {
		FileUtils.copyFile(src, new File("C:/Users/snowg/eclipse-workspace/DsAlgoTestNG2/Screenshots/"+testMethodName+"-" + ".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
}



@AfterClass
public void tearDown() {
	driver.quit();
}




}
