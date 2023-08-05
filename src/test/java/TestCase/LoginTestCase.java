package TestCase;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.constants;

public class LoginTestCase extends BaseClass  {
   @Test
	public void Login () throws IOException {



    	LoginPageObjects obj1 =new LoginPageObjects(driver);

    	//driver.manage().window().maximize();

    	obj1.NevigateAccount().click();
    	obj1.NevigateToLogin().click();
    	obj1.EmailId().sendKeys(constants.ID);
    	obj1.Password().sendKeys(constants.Pass);
    	obj1.Submit().click(); 
	}
}