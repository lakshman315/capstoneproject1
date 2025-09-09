package stepdeffinitions;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wishlist 
{
	WebDriver driver;
	@Given("user open nopCommerce site")
	public void user_open_nop_commerce_site() 
	{
		driver = new ChromeDriver();
	    //driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@When("user searches for {string} in home page")
	public void user_searches_for_in_home_page(String string) throws InterruptedException {

		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search(string);
	}

	@When("user adds product to wishlist")
	public void user_adds_product_to_wishlist() throws InterruptedException {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.addToWishlist();
	}

	@Then("sucessfully added to wishlist")
	public void sucessfully_added_to_wishlist() {
		 System.out.println("product shown in wishlist");
	}


}
