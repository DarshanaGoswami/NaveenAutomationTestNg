package TestCase;

import java.io.IOException;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;

import Resources.BaseClass;

public class LoginTestCase extends BaseClass {  //testcase for naveen automation

	@Test
	public void verifyLogin() throws IOException, InterruptedException {
		
		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		
		Thread.sleep(3000);
		
		lpo.enterEmail().sendKeys("darshna.info@gmail.com");
		lpo.enterpassword().sendKeys("darshana123");
		lpo.clicklogin().click();
		
		
	}
	
	
}
