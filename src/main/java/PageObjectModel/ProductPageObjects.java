package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObjects {

	public WebDriver driver;

	private By search = By.xpath("//input[@name='search']");
	private By clickprod1 = By.xpath("//button[@class=\'btn btn-default btn-lg\']");
	private By priceone = By.xpath("//p[@class='price']");
	private By pricetwo = By.xpath("//p[@class='price']");
	private By addone = By.xpath("//button[@onclick=\"cart.add('40', '1');\"]");
	private By addtwo = By.xpath("//button[@onclick=\"cart.add('49', '1');\"]");
	private By clear = By.xpath("//input[@name='search']");
	private By gotocart = By.xpath("//i[@class=\'fa fa-shopping-cart\'][1]");
	private By cartvalue = By.xpath("(//td[@class=\'text-right\'])[26]");
	private By checkout = By.xpath("//a[@class=\'btn btn-primary\']");
	

	public ProductPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement searchprod() { // returns webelement not xpath

		return driver.findElement(search);

	}

	public WebElement product() { // returns webelement not xpath

		return driver.findElement(clickprod1);

	}

	public WebElement getpriceOne() { // returns webelement not xpath

		return driver.findElement(priceone);

	}

	public WebElement getpricetwo() { // returns webelement not xpath

		return driver.findElement(pricetwo);

	}

	public WebElement addToCartone() { // returns webelement not xpath

		return driver.findElement(addone);

	}

	public WebElement addToCarttwo() { // returns webelement not xpath

		return driver.findElement(addtwo);

	}

	public WebElement clearsearch() { // returns webelement not xpath

		return driver.findElement(clear);

	}
	public WebElement goToCart() { // returns webelement not xpath

		return driver.findElement(gotocart);

	}
	public WebElement CartValue() { // returns webelement not xpath

		return driver.findElement(cartvalue);

	}
	public WebElement Checkout() { // returns webelement not xpath

		return driver.findElement(checkout);

	}

}
