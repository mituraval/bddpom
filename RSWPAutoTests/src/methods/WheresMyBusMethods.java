package methods;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;


public class WheresMyBusMethods  {
	
	public static void VerifyPage(WebDriver driver){
		methods.HomePageMethods.BrowserSetup(driver);
		String title = driver.getTitle();
	     System.out.println(title);
	     Assert.assertEquals("Browse Routes", title);
    
	}
	
public static void VerifyRouteName(WebDriver driver){
		String triptitle = driver.getTitle();
		System.out.println("Trip Page has this title :" + triptitle);
		Assert.assertEquals("400 - Cumming to Downtown",triptitle);
	}
public static void VerifyTripName(WebDriver driver){
	System.out.println("This is stop name: " + pageObjects.WheresMyBus.StopText(driver));
}

public static void VerifyStopTitle(WebDriver driver){

	String title = driver.getTitle();
     System.out.println(title);
     Assert.assertEquals("Central Ave (NB) @ MLK Jr Dr",driver.getTitle());

}
}
