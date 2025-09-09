package stepdeffinitions;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_to_cart 
{
	WebDriver driver;

	@Given("user opens the nopCommerce site")
	public void user_opens_the_nop_commerce_site() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user searching for {string}")
	public void user_searching_for(String string) throws InterruptedException {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search(string);
	}

	@When("user adds product to cart")
	public void user_adds_product_to_cart() {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.addProductToCart();
	}

	@Then("successfully product added to cart")
	public void successfully_product_added_to_cart() {
		System.out.println("product shown in cart");
	}


}
