package TestCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClaseTestNG.BaseClass;
import PageObjectTestNG.GetStartedButton;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
// To test main page's elements.
public class TestPortalPage extends BaseClass{
	
	@Test (priority=1, description= "Verifying Title, paragraph and GetStarted button on very 1stpage"  )
	@Description ("Verifying Title, paragraph and GetStarted button on very 1stpage")
	@Epic ("EP001")
	@Feature("Verifying different element")
	@Story ("User launch the Site to go to the Home Page")
	@Step("Verifying all Elements on 1sPage")
	@Severity(SeverityLevel.NORMAL) 
	public void TestgetStartedPage() {
driver.get(baseurl);
	GetStartedButton gsv = new GetStartedButton(driver);
		String acth= gsv.getheading();
		String expH= "Preparing for the Interviews";
		Assert.assertEquals(acth, expH);
		String actPara = gsv.getparagraphText();
		String expPara = "You are at the right place";
		Assert.assertEquals(actPara, expPara);
		gsv.ClickOnGetStarButton();
		
	}
	

}
