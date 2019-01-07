package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTestSteps {
	public static final WebDriver driver = new ChromeDriver();

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		methods.HomePageMethods.BrowserSetup(driver);
	}

	@When("^User clicks Where my Bus$")
	public void user_clicks_Where_my_Bus() throws Throwable {
		methods.HomePageMethods.HighLightElement(driver, pageObjects.HomePage.busOption(driver));
		pageObjects.HomePage.busOption(driver).click();
	}

	@Then("^User is on Routes Page$")
	public void user_is_on_Routes_Page() throws Throwable {
		methods.HomePageMethods.VerifyPage(driver);
	}

	@When("^User clicks Schedule$")
	public void user_clicks_Schedule() throws Throwable {
		methods.HomePageMethods.CheckSchduleURL(driver);
	}

	@Then("^User is on Schedule Page$")
	public void user_is_on_Schedule_Page() throws Throwable {
		pageObjects.HomePage.schedule(driver).click();
	}

	@When("^User clicks Locate Me$")
	public void user_clicks_Locate_Me() throws Throwable {
		pageObjects.HomePage.Locate(driver).click();
	}

	@Then("^User is on Locate Me Page$")
	public void user_is_on_Locate_Me_Page() throws Throwable {
		methods.HomePageMethods.ValidateLocate(driver);

	}

	@When("^User clicks Search Address$")
	public void user_clicks_Search_Address() throws Throwable {
		pageObjects.HomePage.ClickSearchAddress(driver).click();
	}

	@Then("^User is on Search Address Page$")
	public void user_is_on_Search_Address_Page() throws Throwable {
		methods.HomePageMethods.VerifySearchAddress(driver);

	}

	@When("^User clicks My Notifications$")
	public void user_clicks_My_Notifications() throws Throwable {
		pageObjects.HomePage.MyNotification(driver).click();
	}

	@Then("^User is on My Notifications page$")
	public void user_is_on_My_Notifications_page() throws Throwable {
		methods.HomePageMethods.VerifyNotificationsPage(driver);
		
	}

	@When("^User clicks Service Announcements$")
	public void user_clicks_Service_Announcements() throws Throwable {
		pageObjects.HomePage.ServiceAnnouncements(driver).click();
	}

	@Then("^User is on Service Announcements page$")
	public void user_is_on_Service_Announcements_page() throws Throwable {
		methods.HomePageMethods.VerifyServiceAnnoucementsPage(driver);
		methods.HomePageMethods.CloseBrowser(driver);
	}

}
