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
	
	//constructor
	public Nopcommercepageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By ClickOnRegister= By.linkText("Register");
	By MaleRad=By.xpath("//input[@id=\"gender-male\"]");
	By FemaleRad=By.xpath("//input[@id=\"gender-female\"]");
	By FNameTxtBox=By.id("FirstName");
	By LNameTxtBox=By.id("LastName");
	By EmailTxtBox=By.id("Email");
	By PassTxtBox=By.id("Password");
	By CPassTxtBox=By.id("ConfirmPassword");
	By ClickRegisterSubmit =By.id("register-button");
	
	By ClickOnLogin =By.linkText("Log in");
	By ClickLoginSubmit=By.xpath("//button[@class='button-1 login-button']");
	
	By SearchTxtBox= By.id("small-searchterms");
	By SearchSubmit=By.cssSelector("button[type='submit']");
	
	By ClickAddToCart=By.cssSelector(".product-box-add-to-cart-button");
	By ClickGoToCart=By.linkText("Shopping cart");
	By ClickRemoveFromCart=By.xpath("//button[@class='remove-btn']");
	
	By ClickAddToWishlist=By.xpath("//button[text()='Add to wishlist']");
	
	By ClickTermsService =By.id("termsofservice");
	By ClickCheckout=By.id("checkout");
	By ClickCheckoutAsGuest=By.xpath("//button[text()='Checkout as Guest']");
	
	By BillingFName=By.id("BillingNewAddress_FirstName");
	By BillingLName=By.id("BillingNewAddress_LastName");
	By BillingEmail=By.id("BillingNewAddress_Email");
	By BillingCountry=By.id("BillingNewAddress_CountryId");
	By BillingState=By.id("BillingNewAddress_StateProvinceId");
	By BillingCity=By.id("BillingNewAddress_City");
	By BillingTown=By.id("BillingNewAddress_Address1");
	By BillingPostalCode=By.id("BillingNewAddress_ZipPostalCode");
	By BillingPhNo=By.id("BillingNewAddress_PhoneNumber");
	By BillingSaveButton=By.cssSelector("button[name='save']");
	
	By ShippingMetConBtn=By.xpath("//button[text()='Continue' and @class='button-1 shipping-method-next-step-button']");
	By PaymentMetConBtn=By.xpath("//button[text()='Continue' and @name='save' and @class='button-1 payment-method-next-step-button']");
	By PaymentInfoConBtn=By.xpath("//button[text()='Continue' and @class='button-1 payment-info-next-step-button']");
	By ConfirmBtn=By.xpath("//button[text()='Confirm']");
	
	
	//action methods
	public void register_link()
	{
		driver.findElement(ClickOnRegister).click();
	}
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male"))
		{
			driver.findElement(MaleRad).click();
		}
		else
		{
			driver.findElement(FemaleRad).click();
		}
		
	}

	public void enterCredentials(String f_name, String l_name, String email, String pass, String c_pass) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(FNameTxtBox).sendKeys(f_name);
		  Thread.sleep(2000);
	      driver.findElement(LNameTxtBox).sendKeys(l_name);
	      Thread.sleep(2000);
	      driver.findElement(EmailTxtBox).sendKeys(email);
	      Thread.sleep(2000);
	      driver.findElement(PassTxtBox).sendKeys(pass);
	      Thread.sleep(2000);
	      driver.findElement(CPassTxtBox).sendKeys(c_pass);
	}

	public void enterDetails(String email, String pass) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(EmailTxtBox).sendKeys(email);
		Thread.sleep(2000);
        driver.findElement(PassTxtBox).sendKeys(pass);
        Thread.sleep(2000);
	}



	public void register_submit() {
		// TODO Auto-generated method stub
		driver.findElement(ClickRegisterSubmit).click();
		
	}

	public void login_click() {
		// TODO Auto-generated method stub
		driver.findElement(ClickOnLogin).click();
	}

	public void login_submit() {
		// TODO Auto-generated method stub
		driver.findElement(ClickLoginSubmit).click();
		
	}

	public void search(String product) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(SearchTxtBox));

	    // Enter product in search box
	    driver.findElement(SearchTxtBox).clear();
	    driver.findElement(SearchTxtBox).sendKeys(product);

	    // Click search button
	    driver.findElement(SearchSubmit).click();

	    // Scroll results into view (if needed)
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 500)"); 
	}

	public void addProductToCart() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); 
		driver.findElement(ClickAddToCart).click();
	}

	public void goToCart() {
		// TODO Auto-generated method stub
		driver.findElement(ClickGoToCart).click();
		
	}

	public void removeFromCart() {
		// TODO Auto-generated method stub
		WebElement ele=driver.findElement(ClickRemoveFromCart);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",ele );
		
	}

	public void addToWishlist() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(ClickAddToWishlist).click();
		
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
		driver.findElement(SearchTxtBox).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(SearchSubmit).click();
        Thread.sleep(2000);
	}
	
	public void addCartForCheckout() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(2000);
		driver.findElement(ClickAddToCart).click();
	}
	
	public void checkoutAsGuest() throws InterruptedException
	{
		driver.findElement(ClickGoToCart).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(1000);
        driver.findElement(ClickTermsService).click();
        Thread.sleep(1000);
        driver.findElement(ClickCheckout).click(); 		
        Thread.sleep(2000);
        driver.findElement(ClickCheckoutAsGuest).click();
	}
	
	public void billingDetailCheckout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(BillingFName).sendKeys("Lakshman");
	    driver.findElement(BillingLName).sendKeys("Vangapandu");
	    driver.findElement(BillingEmail).sendKeys("Lakshman@gmail.com");
	    
	    WebElement sort1=driver.findElement(BillingCountry);
	    Select sle1=new Select(sort1);
	    sle1.selectByVisibleText("India");
	    
	    sort1.sendKeys(Keys.TAB);
	    Thread.sleep(2000);
	    WebElement sort=driver.findElement(BillingState);
	    Select sle=new Select(sort);
	    sle.selectByIndex(2);
	    
	    driver.findElement(BillingCity).sendKeys("Kakinada");
	    driver.findElement(BillingTown).sendKeys("velampeta");
	    driver.findElement(BillingPostalCode).sendKeys("533343");
	    driver.findElement(BillingPhNo).sendKeys("8688061416");
	    driver.findElement(BillingSaveButton).click();
	    Thread.sleep(2000);

	}
	
	public void shipAndPayment() throws InterruptedException
	{
		//for shipping method
		WebElement ele= driver.findElement(ShippingMetConBtn);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		//for payment method 
		Thread.sleep(2000);
	    WebElement ele1=driver.findElement(PaymentMetConBtn);
	    js.executeScript("arguments[0].click();", ele1);
	    
	    //for payment information
	    Thread.sleep(2000);
	    WebElement ele2=driver.findElement(PaymentInfoConBtn);
	    js.executeScript("arguments[0].click();", ele2);
	    
	   
	    WebElement ele3=driver.findElement(ConfirmBtn);
	    js.executeScript("arguments[0].click();", ele3);
		        
		Thread.sleep(3000);
		       
		   
		WebElement ele4=driver.findElement(By.xpath("//button[text()='Confirm' and @class='button-1 confirm-order-next-step-button']"));
		js.executeScript("arguments[0].scrollIntoView();", ele4);
		ele4.click();
		        //button[text()='Continue' and @class='button-1 order-completed-continue-button']
	}


}
