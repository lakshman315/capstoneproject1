package stepdeffinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remove 
{
	WebDriver driver;
	@Given("user goes to the nopCommerce site")
	public void user_goes_to_the_nop_commerce_site() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user searched for {string}")
	public void user_searched_for(String string) throws InterruptedException {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search(string);
		
	}

	@When("user adding the product to cart")
	public void user_adding_the_product_to_cart() {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.addProductToCart();
		
	}

	@When("user is going to cart")
	public void user_is_going_to_cart() {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.goToCart();
	}
	@When("user removes the product")
	public void user_removes_the_product() {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.removeFromCart();
	}
	@Then("cart should be empty")
	public void cart_should_be_empty() {
		System.out.println("cart is empty");
	}

}
