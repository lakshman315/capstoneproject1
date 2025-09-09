package stepdeffinitions;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	WebDriver driver;
	
	@Given("User should open nopCommerce home page")
	public void user_should_open_nop_commerce_home_page() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.nopcommerce.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("User click on login")
	public void user_click_on_login() {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.login_click();
	}

	@When("the user enters email {string} and password {string}")
	public void the_user_enters_email_and_password(String email, String pass) throws InterruptedException {
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.enterDetails(email, pass);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.login_submit();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		System.out.println("user get logged in");
	}



}
