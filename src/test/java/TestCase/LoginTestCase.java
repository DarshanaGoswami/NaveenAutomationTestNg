package TestCase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;

import Resources.BaseClass;
import Resources.constants;

public class LoginTestCase extends BaseClass { // testcase for naveen automation

	@Test(dataProvider = "testData")
	public void verifyLogin(String em, String pw) throws IOException, InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);

		Thread.sleep(2000);

		lpo.enterEmail().sendKeys(em);
		lpo.enterpassword().sendKeys(pw);
		lpo.clicklogin().click();
	}

	@DataProvider
	public Object[][] testData() { // testData() - is dataprovider name
		Object[][] data = new Object[3][2]; // create the object of object class
		data[0][0] = constants.entergamilone; // 1st username
		data[0][1] = constants.enterpasswordone;// 1st password
		data[1][0] = constants.entergmailtwo; // 2nd username
		data[1][1] = constants.enterpasswordtwo; // 2nd password

		return data;

	}
}
