package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.RegistrationPageObjects;
import Resources.BaseClass;

public class RegistrationTestCase extends BaseClass {
	
	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.clickonRegistration().click();
		
		Thread.sleep(3000);
		
		RegistrationPageObjects rpo=new RegistrationPageObjects(driver);
		rpo.enterFirstname().sendKeys("abcd");
		rpo.enterLastname().sendKeys("abcd");
		rpo.enterEmail().sendKeys("abcd@gmail.com");
		rpo.enterPhone().sendKeys("8888877777");
		rpo.enterPassword().sendKeys("abcdefg");
		rpo.ConfirmPassword().sendKeys("abcdefg");
		rpo.agree().click();
		
	}

}
