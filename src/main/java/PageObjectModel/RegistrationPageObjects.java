package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By phone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirm = By.xpath("//input[@name='confirm']");
	private By agree=By.xpath("//input[@name='agree']");
	private By cont= By.xpath("//input[@value='Continue']");
	// private By cont=By.xpath("//input[@class='btn btn-primary']"

	public RegistrationPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterFirstname() { // returns webelement not xpath

		return driver.findElement(firstname);

	}

	public WebElement enterLastname() { // returns webelement not xpath

		return driver.findElement(lastname);

	}

	public WebElement enterEmail() { // returns webelement not xpath

		return driver.findElement(email);

	}

	public WebElement enterPhone() { // returns webelement not xpath

		return driver.findElement(phone);

	}

	public WebElement enterPassword() { // returns webelement not xpath

		return driver.findElement(password);

	}

	public WebElement ConfirmPassword() { // returns webelement not xpath

		return driver.findElement(confirm);

	}
	public WebElement agree() { // returns webelement not xpath

		return driver.findElement(agree);

	}
	public WebElement clickContinue() { //returns webelement not xpath
	 
	  return driver.findElement(cont);
	  
	  }
	 

}
