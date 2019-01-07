package methods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class SchedulePageMethods {
	
public static void ValidateSchduleURL(WebDriver driver){
		
		String scheduleurl = driver.getCurrentUrl();
		System.out.println("Schedule Page has url :" + scheduleurl);
		Assert.assertEquals("https://loadtest1.routematch.com/routeshout/scheduledRoutes",scheduleurl);
		// when pointing to final build locally "http://localhost:8080/routeshout/routes" or "http://grta.routematch.com:52077/routeshout/scheduledRoutes"
	}

public static void ScheduleTripTitleCheck(WebDriver driver){
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.titleContains("Select Direction for 400 - 400:Cumming to Downtown"));
	String TripurlOnSchedule = driver.getTitle();
	System.out.println("Schedule page shows title : " + TripurlOnSchedule);
	Assert.assertEquals("Select Direction for 400 - 400:Cumming to Downtown", TripurlOnSchedule);

}
public static void CheckAMText(WebDriver driver){
	
	System.out.println("Schedule Page displays this h4 header :" + pageObjects.SchedulePage.AMText(driver));
	Assert.assertEquals("AM",pageObjects.SchedulePage.AMText(driver) );
}

public static void CheckPMText(WebDriver driver){
	String PMtext = pageObjects.SchedulePage.PMText(driver).getText();
	System.out.println("Schedule Page displays this h4 header :" + PMtext);
	Assert.assertEquals("PM",PMtext);
}
public static void ScheduleTripTime(WebDriver driver){
	String title = driver.getTitle();
     System.out.println("This is title for Schedule Select Trip page: " +title);
     Assert.assertEquals("Select Trip Time for 400 - 400:Cumming to Downtown",driver.getTitle());
}
public static void CheckAMTimes(WebDriver driver){
	String AMTimes = pageObjects.SchedulePage.AMTimes(driver).getText();
	System.out.println("Schedule Page displays this AM Times :" + AMTimes);
	Assert.assertEquals("05:45 AM", AMTimes);
}
public static void CheckPMTimes(WebDriver driver){
	String PMTimes = pageObjects.SchedulePage.PMTimes(driver).getText();
	System.out.println("Schedule Page displays this AM Times :" + PMTimes);
	Assert.assertEquals("03:40 AM", PMTimes);
}

}
