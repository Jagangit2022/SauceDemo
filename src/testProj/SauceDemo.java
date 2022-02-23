package testProj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		//WebElement userNameVal = driver.findElement(By.xpath("(//div[@id='login_credentials']/text())[1]"));
		//System.out.println("User name Val : " +userNameVal);
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		
		WebElement userPwd = driver.findElement(By.xpath("//input[@id='password']"));
		userPwd.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();
	
		//List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		WebElement productBag = driver.findElement(By.xpath("(//div[@class='inventory_item'])[1]"));
		if(productBag.isDisplayed()) {
			WebElement productText = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
			WebElement addToCartBtn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
			addToCartBtn.click();
			
			WebElement shoppingCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			if(shoppingCart.isDisplayed()) {
				shoppingCart.click();
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				
				WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
				firstName.sendKeys("Rohit");
				WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
				lastName.sendKeys("Kumar");
				WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
				postalCode.sendKeys("560061");
				WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
				continueBtn.click();
				
				WebElement qtyVal = driver.findElement(By.xpath("//div[@class='cart_quantity']"));
				System.out.println("Qty : " +qtyVal.getText());
				WebElement descVal = driver.findElement(By.xpath("//div[@class='cart_quantity']"));
				System.out.println("Description : " +descVal.getText());
				WebElement amount = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
				System.out.println("Amount : " +amount.getText());
				WebElement paymentVal = driver.findElement(By.xpath("(//div[@class='summary_value_label'])[1]"));
				System.out.println("Payment Information : " +paymentVal.getText());
				WebElement shippingVal = driver.findElement(By.xpath("(//div[@class='summary_value_label'])[2]"));
				System.out.println("Shipping Infomration : " +shippingVal.getText());
				WebElement itemTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
				System.out.println(itemTotal.getText());
				WebElement itemTax = driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
				System.out.println(itemTax.getText());
				WebElement totalFinal = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
				System.out.println(totalFinal.getText());
				
				WebElement finishBtn = driver.findElement(By.xpath("//button[@name='finish']"));
				finishBtn.click();
				WebElement thankyouTxt = driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU')]"));
				System.out.println(thankyouTxt.getText());
				WebElement backBtn = driver.findElement(By.xpath("//button[@id='back-to-products']"));
				backBtn.click();
				
			}
			
		}
		
		
		

	}

}
