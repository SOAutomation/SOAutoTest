package StepDefinations;

import com.qa.factory.DriverFactory;
import com.qa.util.FileUtility;
import com.qa.util.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	FileUtility fu;
	WebDriverUtility wu;
	
	@Given("User logged into Okta")
	public void user_logged_into_okta() throws Throwable {
		fu= new FileUtility();
		wu = new WebDriverUtility();
		String url = fu.getPropertyKeyValue("url");
		DriverFactory.getDriver().get(url);
		wu.implicitWait30(DriverFactory.getDriver());
		Thread.sleep(10000);
		
	}

	@Then("Petware login screen should display")
	public void petware_login_screen_should_display() {
		
	}
	
	@When("User enter valid Username {string} and password {string}")
	public void user_enter_valid_username_and_password(String string, String string2) {
		
	}
	@When("Click on login button")
	public void click_on_login_button() {
		
	}
	@Then("Visit Management page should display")
	public void visit_management_page_should_display() {
		
	}

}
