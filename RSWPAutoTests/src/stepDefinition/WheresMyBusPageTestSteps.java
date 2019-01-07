package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WheresMyBusPageTestSteps {
	public static final WebDriver driver = new ChromeDriver();

	@Given("^User is on the Home Page$")
	public void user_is_on_the_Home_Page() throws Throwable {
		methods.HomePageMethods.BrowserSetup(driver);

	}

	@When("^User clicks Wheres my Bus$")
	public void user_clicks_Wheres_my_Bus() throws Throwable {
		pageObjects.HomePage.busOption(driver).click();
	}

	@Then("^User is on Wheres My Bus Page$")
	public void user_is_on_Wheres_my_Bus_Page() throws Throwable {
		methods.HomePageMethods.VerifyPage(driver);
	}

	@Given("^User verifies routes display$")
	public void user_verifies_routes_display() throws Throwable {
		methods.HomePageMethods.VerifyPage(driver);
	}

	@And("^User clicks the route$")
	public void user_clicks_the_route() throws Throwable {
		pageObjects.WheresMyBus.browseRoutes(driver).click();
	}

	@Then("^User in on the trips page$")
	public void user_in_on_the_trips_page() throws Throwable {
		methods.WheresMyBusMethods.VerifyRouteName(driver);
	}

	@Given("^User verifies trip name$")
	public void user_verifies_trip_name() throws Throwable {
		methods.WheresMyBusMethods.VerifyRouteName(driver);
	}

	@When("^User clicks a Stop$")
	public void user_clicks_a_Stop() throws Throwable {
		pageObjects.WheresMyBus.stopName(driver).click();
	}

	@Then("^User is on Stops page$")
	public void user_is_on_Stops_page() throws Throwable {
		methods.WheresMyBusMethods.VerifyStopTitle(driver);
		methods.HomePageMethods.CloseBrowser(driver);
	}

}
