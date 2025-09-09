package stepdeffinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register 
{
	 WebDriver driver;
	 @Given("User is on nopCommerce homepage")
	 public void user_is_on_nop_commerce_homepage()
	 {
		 driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
	 }

	 @When("User clicks on register link")
	 public void user_clicks_on_register_link() 
	 {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.register_link();
	 }

	 @When("User submits the registration form")
	 public void user_submits_the_registration_form() 
	 {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.register_submit();
	 }

	 @Then("User should see registration confirmation")
	 public void user_should_see_registration_confirmation() 
	 {
		 System.out.println("User can see registration comfirmation");
	 }

	 @When("User selects gender {string}")
	 public void user_selects_gender(String gender) {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.selectGender(gender);
	 }

	 @When("User enters {string}, {string}, {string}, {string}, {string}")
	 public void user_enters(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.enterCredentials(string, string2, string3, string4, string5);
		 
	 }

}
