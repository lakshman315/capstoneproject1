package stepdeffinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search 
{
	WebDriver driver;
	@Given("user opens nopCommerce site")
	public void user_open_nop_commerce_site()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}
	
	@When("user searches for {string}")
	public void user_searches_for(String product) throws InterruptedException {
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.search(product);
	}

	@Then("user should see {string} in results")
	public void user_should_see_in_results(String string) {
		System.out.println("user should see product");
	}


}
