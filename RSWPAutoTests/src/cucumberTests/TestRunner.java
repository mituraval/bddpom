package cucumberTests;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features = "Feature"
		features = {"Feature/HomePage_Test.feature","Feature/WheresMyBus_Test.feature"}
		//,"Feature/WheresMyBus_Test.feature","Feature/SchedulePage_Test.feature"
		//  "Feature/HomePage_Test.feature","Feature/WheresMyBus_Test.feature","Feature/SchedulePage_Test.feature"
		, glue = { "stepDefinition" }, monochrome = true,
		// dryRun = true
		// format = {"pretty", "html:C:/Reports/CucumberHTMLReport",
		// "json:C:/Reports/Cucumber.json"}
		plugin = { "html:C:/Reports/CucumberHTMLReport", "pretty:C:Reports/cucumber-pretty.txt" })
public class TestRunner {

}
