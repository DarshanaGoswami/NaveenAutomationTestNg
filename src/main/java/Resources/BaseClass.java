package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	public void initializeDriver() throws IOException {

		FileInputStream fs = new FileInputStream(
				"C:\\Users\\darsh\\eclipse-workspace\\SeleniumTestngFinal\\src\\main\\java\\Resources\\data.properties");

		prop = new Properties();
		prop.load(fs);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please choose proper driver");
		}
	}

	@BeforeMethod
	public void LaunchBrowserandUrl() throws IOException {
		// driver.get("https://login.salesforce.com/"); this is also visible so we have
		// to put this url in data properties file andd then we have to acces in base
		// class
		// driver.get(prop.getProperty("URL"));

		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/"); // this is also visible so we have to put this url in
																	// data properties file andd then we have to acces
																	// in base class
		// driver.get(prop.getProperty("URL"));
	}
}