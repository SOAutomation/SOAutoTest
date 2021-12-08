package StepDefinations;

import com.qa.factory.DriverFactory;
import com.qa.util.FileUtility;
import com.qa.util.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HospitalLevelConfigCreate {
	FileUtility fu;
	WebDriverUtility wu;
	
	@Given("User is in Visit Management page")
	public void user_is_in_visit_management_page() throws Throwable {
		fu= new FileUtility();
		wu = new WebDriverUtility();
		String url = fu.getPropertyKeyValue("url");
		DriverFactory.getDriver().get(url);
		wu.implicitWait30(DriverFactory.getDriver());
		Thread.sleep(10000);
	}

	@When("Click on Admin tab from top navigation bar")
	public void click_on_admin_tab_from_top_navigation_bar() {
		
	}
	
	@When("Click on Hospital Info")
	public void click_on_hospital_info() {
		
	}
	
	@Then("Login popup should display")
	public void login_popup_should_display() {
		
	}
	
	@When("User Login With Valid Admin Creds")
	public void user_login_with_valid_admin_creds() {
		
	}
	
	@Then("Adminstration page should display")
	public void adminstration_page_should_display() {
		
	}
	
	@When("User click Online Scheduling option")
	public void user_click_online_scheduling_option() {
		
	}
	
	@Then("Online Scheduling Screen should display")
	public void online_scheduling_screen_should_display() {
		
	}
	
	@Then("Verify {string} label text")
	public void verify_label_text(String string) {
		
	}

}
