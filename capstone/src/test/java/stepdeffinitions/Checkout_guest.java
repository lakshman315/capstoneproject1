package stepdeffinitions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_guest 
{
	WebDriver driver;
	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
	@Given("user opened nopCommerce site")
	public void user_opened_nop_commerce_site() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/"); 
	}

	@When("user do search for product")
	public void user_do_search_for_product() throws InterruptedException {
		
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.searchForCheckout();
		 
	}

	@And("user add product to cart")
	public void user_add_product_to_cart() throws InterruptedException 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.addCartForCheckout();
	}

	@And("user proceed to checkout as guest")
	public void user_proceed_to_checkout_as_guest() throws InterruptedException
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.checkoutAsGuest();
		
       //driver.findElement(By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]")).click();
	   
	}

	@And("user enter billing details")
	public void user_enter_billing_details() throws InterruptedException
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.billingDetailCheckout();
		
	    
	}

	@And("user select shipping and payment method")
	public void user_select_shipping_and_payment_method() throws InterruptedException 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.shipAndPayment();
		
	}

	@Then("user should see order confirmation")
	public void user_should_see_order_confirmation() 
	{
		System.out.println("user can see the order confirmation");
	}




}
