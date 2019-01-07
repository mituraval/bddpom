package methods;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

public class HomePageMethods {
	
	public static void Execute(WebDriver driver) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(utility.Constant.HomePage);
		pageObjects.HomePage.busOption(driver).click();
		pageObjects.HomePage.schedule(driver).click();
					
}
	public static void BrowserSetup(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver", utility.Constant.Path);
		driver.manage().window().maximize();
		driver.get(utility.Constant.HomePage);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void VerifyPage(WebDriver driver){

		String title = driver.getTitle();
	     System.out.println(title);
	     try {
			Assert.assertEquals("Browse Routes",driver.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
    
	}
	public static void CheckSchduleURL(WebDriver driver){
		
		String scheduleurl = driver.getCurrentUrl();
		System.out.println("Schedule Page has this url :" + scheduleurl);
		Assert.assertEquals("http://grta.routematch.com:52077/routeshout/routes" ,driver.getCurrentUrl());
		// when pointing to final build locally "http://localhost:8080/routeshout/routes" or "http://grta.routematch.com:52077/routeshout/routes"
	}
	public static void ValidateLocate(WebDriver driver){
		String title = driver.getTitle();
	     System.out.println("This is title for Locate Me page: " +title);
	     Assert.assertEquals("Nearby Stops",driver.getTitle());
	}
	public static void VerifySearchAddress(WebDriver driver){
		String title = driver.getTitle();
	     System.out.println("This is title for Search page: " + title);
	     Assert.assertEquals("Search Address",driver.getTitle());
	}
	public static void VerifyNotificationsPage(WebDriver driver){
		String title = driver.getTitle();
	     System.out.println("This is title for Notifications page: " +title);
	     Assert.assertEquals("My Notifications",driver.getTitle());
	}
	public static void VerifyServiceAnnoucementsPage(WebDriver driver){
		String title = driver.getTitle();
	     System.out.println("This is title for Service Announcements page: " +title);
	     Assert.assertEquals("Service Announcements",driver.getTitle());
	}
	public static void HighLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	} 

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

	}
	public static void CloseBrowser(WebDriver driver){
		driver.close();
        driver.quit();
        
	}
	
}