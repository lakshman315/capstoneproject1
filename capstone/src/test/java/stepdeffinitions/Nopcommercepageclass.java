package stepdeffinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nopcommercepageclass 
{
	WebDriver driver;
	public Nopcommercepageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void register_link()
	{
		driver.findElement(By.linkText("Register")).click();
	}
	
	public void register_details() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("FirstName")).sendKeys("Lakshman");
		  Thread.sleep(2000);
	      driver.findElement(By.id("LastName")).sendKeys("Vangapandu");
	      Thread.sleep(2000);
	      driver.findElement(By.id("Email")).sendKeys("Lakshman64@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.id("Password")).sendKeys("Lakshman.6134");
	      Thread.sleep(2000);
	      driver.findElement(By.id("ConfirmPassword")).sendKeys("Lakshman.6134");
	}

	public void register_submit() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("register-button")).click();
		
	}

	public void login_click() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Log in")).click();
	}

	public void enterDetails() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Lakshman64@gmail.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Lakshman.6134");
        Thread.sleep(2000);
		
	}

	public void login_submit() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
		
	}

	public void search() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("MacBook");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
	}

	public void search_adobe() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

	public void addProductToCart() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); 
		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
	}

	public void search_adobe_photoshop() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	public void userAddToCart() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
		
	}

	public void goToCart() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Shopping cart")).click();
		
	}

	public void removeFromCart() {
		// TODO Auto-generated method stub
		WebElement ele=driver.findElement(By.xpath("//button[@class='remove-btn']"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",ele );
		
	}

	public void search_for_adobe_photo() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
	}

	public void addToWishlist() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to wishlist']")).click();
		
	}

	public void enterEmail() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("newsletter-email")).sendKeys("Lakshman@test.com");
	}

	public void clickSubscribe() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

	public void navigateToCategory() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Computers")).click();
		
	}

	public void clickO() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Desktops")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Build your own computer")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
	}
	
	public void searchForCheckout() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
	}
	
	public void addCartForCheckout() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
	}
	
	public void checkoutAsGuest() throws InterruptedException
	{
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(1000);
        driver.findElement(By.id("termsofservice")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]")).click();
	}
	
	public void billingDetailCheckout() throws InterruptedException
	{
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Lakshman");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Vangapandu");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Lakshman@gmail.com");
        
        WebElement sort1=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select sle1=new Select(sort1);
        sle1.selectByVisibleText("India");
        
        sort1.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        WebElement sort=driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select sle=new Select(sort);
        sle.selectByIndex(2);
        
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Kakinada");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("velampeta");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("533343");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("8688061416");
        driver.findElement(By.cssSelector("button[name='save']")).click();
        Thread.sleep(2000);

	}
	
	public void shipAndPayment() throws InterruptedException
	{
		//for shipping method
				WebElement ele= driver.findElement(By.xpath("//button[text()='Continue' and @class='button-1 shipping-method-next-step-button']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", ele);
				
				//for payment method
				//driver.findElement(By.id("paymentmethod_0")).click(); 
				Thread.sleep(2000);
		        WebElement ele1=driver.findElement(By.xpath("//button[text()='Continue' and @name='save' and @class='button-1 payment-method-next-step-button']"));
		        js.executeScript("arguments[0].click();", ele1);
		        
		        //for payment information
		        Thread.sleep(2000);
		        WebElement ele2=driver.findElement(By.xpath("//button[text()='Continue' and @class='button-1 payment-info-next-step-button']"));
		        js.executeScript("arguments[0].click();", ele2);
		        
		       
		        WebElement ele3=driver.findElement(By.xpath("//button[text()='Confirm']"));
		        js.executeScript("arguments[0].click();", ele3);
		        
		        Thread.sleep(3000);
		       
		   
		        WebElement ele4=driver.findElement(By.xpath("//button[text()='Confirm' and @class='button-1 confirm-order-next-step-button']"));
		        js.executeScript("arguments[0].scrollIntoView();", ele4);
		        ele4.click();
		        //button[text()='Continue' and @class='button-1 order-completed-continue-button']
	}
	
	
	
}
