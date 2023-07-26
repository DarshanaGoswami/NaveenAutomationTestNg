package TestCase;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

//import PageObjectModel.LoginPageObjects;
import PageObjectModel.ProductPageObjects;
import Resources.BaseClass;

public class ProductValueTestCase extends BaseClass {

	@Test
	public void comparision() throws IOException, InterruptedException {

		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		ProductPageObjects ppo = new ProductPageObjects(driver);
		
		Thread.sleep(3000);

		// iphone
		ppo.searchprod().sendKeys("iphone");
		ppo.product().click();
		String IphonePrice= ppo.getpriceOne().getText();
		System.out.println("actual price:"+ IphonePrice);
		
		 //split
		String[] spl = IphonePrice.split("\\s+");
		System.out.println("split method:" + Arrays.toString(spl));
		
		String iphonePricewithDoller = spl[0];
		String iphonePricewithoutDollar = iphonePricewithDoller.replaceAll("[$,]", "");
		System.out.println("without doller: "+iphonePricewithoutDollar);
		
		double iphonePriceInDouble = Double.parseDouble(iphonePricewithoutDollar);
		System.out.println(iphonePriceInDouble);
		
		ppo.addToCartone().click();
		ppo.clearsearch().clear();
		
		// samsung
		ppo.searchprod().sendKeys("Samsung tab");
		ppo.product().click();
		String SamsungPrice= ppo.getpricetwo().getText();
		System.out.println("actual price:"+ SamsungPrice);
		String[] sam = SamsungPrice.split("\\s+");
		System.out.println("Split: "+Arrays.toString(sam));
		
		String SamsungPriceWithDoller = sam[0];
		String SamsungPriceWithoutDoller = SamsungPriceWithDoller.replaceAll("[$,]", "");
		System.out.println("without doller: "+SamsungPriceWithoutDoller);
		
		double SamsungPriceDouble = Double.parseDouble(SamsungPriceWithoutDoller);
		
		System.out.println("in double:"+SamsungPriceDouble);
		
		System.out.println("without doller: "+SamsungPriceWithoutDoller);
		ppo.addToCarttwo().click();
		
		
		double totalCount = iphonePriceInDouble + SamsungPriceDouble;
		
		System.out.println("Total count: "+totalCount);
		
		ppo.goToCart().click();
		
		String CartValue = ppo.CartValue().getText();
		System.out.println("Cart Value: "+CartValue);
		
		
		String CartValueWithoutDoller = CartValue.replaceAll("[$,]", "");
		System.out.println(CartValueWithoutDoller);
		
		ppo.Checkout().click();
		
		String total = Double.toString(totalCount);
		System.out.println(total);
		
			if (total==CartValueWithoutDoller) {

			System.out.println("successful");
		} else {
			System.out.println("Unsuccessful");
		}
		

	}
}

 