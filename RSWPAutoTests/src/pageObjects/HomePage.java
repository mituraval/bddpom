package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
	private static WebElement element = null;

	public static WebElement busOption(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Where's My Bus?")));
		// element = driver.findElement(By.linkText("Where's My Bus?"));
		return element;

	}

	public static WebElement schedule(WebDriver driver) {
		element = driver.findElement(By.partialLinkText("Schedule"));
		return element;
	}

	public static WebElement Locate(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Locate Me")));
		return element;
	}

	public static WebElement ClickSearchAddress(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Search Address")));
		return element;
	}

	public static WebElement MyNotification(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("My Notifications")));
		return element;
	}

	public static WebElement ServiceAnnouncements(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Service Announcements")));
		return element;
	}
	// home screen splash
	public static WebElement homesplashschedule(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='indexSpan'and contains(text(), 'Schedule')]")));
		return element;

	}
	public static WebElement homesplashwheresmybus(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='indexSpan'and contains(text(), \"Where's My Bus?\")]")));
		return element;

}
}
