package StepDefinations;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.OnlineSchedulingPage;
import com.qa.factory.DriverFactory;
import com.qa.util.FileUtility;
import com.qa.util.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HospitalLevelConfigCreate {
	FileUtility fu;
	WebDriverUtility wu;
	HomePage hp;
	OnlineSchedulingPage osp;
	
	@Given("User is in Visit Management page")
	public void user_is_in_visit_management_page() throws Throwable {
		fu= new FileUtility();
		wu = new WebDriverUtility();
		String url = fu.getPropertyKeyValue("url");
		DriverFactory.getDriver().get(url);
		wu.implicitWait30(DriverFactory.getDriver());
	}

	@When("Click on Admin tab from top navigation bar")
	public void click_on_admin_tab_from_top_navigation_bar() {
		hp = new HomePage();
		wu.mouseHover(DriverFactory.getDriver(), DriverFactory.getDriver().findElement(hp.getNavigationbar()));
		DriverFactory.getDriver().findElement(hp.getAdminSettings()).click();
	}
	
	@When("Click on Hospital Info")
	public void click_on_hospital_info() throws InterruptedException {
		DriverFactory.getDriver().findElement(hp.getHospitalInfo()).click();
		Thread.sleep(5000);
	}
	
	@Then("Login popup should display")
	public void login_popup_should_display() {
		Assert.assertTrue(DriverFactory.getDriver().findElement(hp.getSignButton()).isDisplayed());
	}
	
	@When("User Login With Valid Admin Creds")
	public void user_login_with_valid_admin_creds() throws Throwable {
		String username = fu.getPropertyKeyValue("username");
		String password = fu.getPropertyKeyValue("password");
		DriverFactory.getDriver().findElement(hp.getUsernameField()).sendKeys(username);
		DriverFactory.getDriver().findElement(hp.getPasswordField()).sendKeys(password);
		DriverFactory.getDriver().findElement(hp.getSignButton()).click();
	}
	
	@Then("Adminstration page should display")
	public void adminstration_page_should_display() {
		osp = new OnlineSchedulingPage();
		Assert.assertTrue(DriverFactory.getDriver().findElement(osp.getAdministrationTitle()).isDisplayed());
	}
	
	@When("User click Online Scheduling option")
	public void user_click_online_scheduling_option() {
		DriverFactory.getDriver().findElement(osp.getOnlineScheduling()).click();
	}
	
	@Then("Online Scheduling Screen should display")
	public void online_scheduling_screen_should_display() {
		Assert.assertTrue(DriverFactory.getDriver().findElement(osp.getOnlineSchedulingTitle()).isDisplayed());
	}
	
	@Then("Verify {string} label text")
	public void verify_label_text(String delayTitle) {
		Assert.assertEquals(DriverFactory.getDriver().findElement(osp.getDelaytimeTitle()), delayTitle);
	}

}
