package stepdeffinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCatalog
{
	WebDriver driver;
	@Given("user open nopCommerce website")
	public void user_open_nop_commerce_website()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	}
	@When("user navigates to category")
	public void user_navigates_to_category( ) 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.navigateToCategory();
		
	}

	@When("user clicks on")
	public void user_clicks_on() throws InterruptedException
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.clickO();
		
	}

	@Then("user should see the product details page")
	public void user_should_see_the_product_details_page() 
	{
	    System.out.println("user can see");
	}




}
