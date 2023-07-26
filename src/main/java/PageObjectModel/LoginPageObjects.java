package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver; //this driver dont have scope
	
	private By email=By.xpath("//input[@name='email']"); 
	private By password=By.xpath("//input[@name='password']");
	private By login=By.xpath("//input[@value='Login']");
	private By register=By.xpath("//a[@class='btn btn-primary']");
	
	
	
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	public WebElement enterEmail() { //returns webelement not xpath
		
		return driver.findElement(email);
		
	}
	public WebElement enterpassword() {
		
		return driver.findElement(password);
		
	}
	public WebElement clicklogin() {
		
		return driver.findElement(login);
		
	}
	public WebElement clickonRegistration() {
		
		return driver.findElement(register);
	}
	
}
