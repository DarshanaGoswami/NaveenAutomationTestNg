package TestCase;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObjects;
import PageObjectModel.RegistrationPageObjects;
import Resources.BaseClass;
import Resources.constants;

public class RegistrationTestCase extends BaseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.clickonRegistration().click();

		Thread.sleep(3000);

		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);

		rpo.enterFirstname().sendKeys(constants.firstname);
		rpo.enterLastname().sendKeys(constants.lastname);
		rpo.enterEmail().sendKeys(constants.enteremailtwo);
		rpo.enterPhone().sendKeys(constants.enterphone);
		rpo.enterPassword().sendKeys(constants.passwordtwo);
		rpo.ConfirmPassword().sendKeys(constants.confirmpasswordtwo);
		rpo.agree().click();

	}

}
