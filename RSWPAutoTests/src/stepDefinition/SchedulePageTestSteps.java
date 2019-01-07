package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SchedulePageTestSteps {
	public static final WebDriver driver = new ChromeDriver();

	@Given("^User is on the Schedule Page$")
	public void user_is_on_the_Schedule_Page() throws Throwable {
		methods.HomePageMethods.BrowserSetup(driver);
		pageObjects.HomePage.schedule(driver).click();
	}

	@Given("^user verifies the schedule page$")
	public void user_verifies_the_schedule_page() throws Throwable {
		methods.SchedulePageMethods.ValidateSchduleURL(driver);
		
	}

	@When("^user clicks on Route$")
	public void user_clicks_on_Route() throws Throwable {
		pageObjects.SchedulePage.routesonSchedule(driver).click();
	}

	@And("^the user sees the schedule page$")
	public void the_user_sees_the_schedule_page() throws Throwable {
		methods.SchedulePageMethods.ScheduleTripTitleCheck(driver);
	}

	@Then("^user is on scheduled trips page$")
	public void user_is_on_scheduled_trips_page() throws Throwable {
		methods.SchedulePageMethods.CheckAMText(driver);
		methods.SchedulePageMethods.CheckAMText(driver);
	}

	@Given("^user is on Direction Cumming to Downtown$")
	public void user_is_on_Direction_Cumming_to_Downtown() throws Throwable {
		driver.get(utility.Constant.CummingToDowntown);

	}

	@When("^user clicks on AM times$")
	public void user_clicks_on_AM_times() throws Throwable {
		pageObjects.SchedulePage.routesonSchedule(driver).click();

	}

	@And("^user sees AM times$")
	public void user_sees_AM_times() throws Throwable {
		methods.SchedulePageMethods.CheckAMTimes(driver);
		
	}

	@Then("^users is on select trip time page$")
	public void users_is_on_select_trip_time_page() throws Throwable {
		methods.SchedulePageMethods.ScheduleTripTime(driver);
		methods.HomePageMethods.CloseBrowser(driver);
	}

}
