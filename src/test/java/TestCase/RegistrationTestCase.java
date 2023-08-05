package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.RegistrationPageObjects;

import Resources.BaseClass;

public class RegistrationTestCase extends BaseClass {

	@Test
	public void verifyRegister() throws IOException {

		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		RegistrationPageObjects obj = new RegistrationPageObjects(driver);

		//driver.manage().window().maximize();

		obj.NavigatetoMyAccount().click();
		obj.NevigatetoRegister().click();
		obj.FirstName().sendKeys("darshana");
		obj.LastName().sendKeys("goswami");
		obj.Email().sendKeys("info.darshna@gmail.com");
		obj.telephone().sendKeys("7878787878");
		obj.password().sendKeys("Test@321");
		obj.Confirmpassword().sendKeys("Test@321");
		obj.RadioBtn().click();
		obj.checkbox().click();
		obj.submit().click();

	}
}