package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchedulePage {
	
	public static WebElement routesonSchedule(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='the-list']/a[1]")));
		return element;
	}
	public static String AMText(WebDriver driver) {
		String AMPls = driver.findElement(By.tagName("h4")).getText();
		return AMPls;
	}
	public static WebElement PMText (WebDriver driver){
		WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'PM')]"));
		return element;
}
	public static WebElement AMTimes(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[contains(text(), '05:45 AM')]"));
		//String AMtimetext = element.getText();
		//return AMtimetext;
		return element;
	}
	public static WebElement PMTimes(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[contains(text(), '03:40 PM')]"));
		// try relative xpath .//*[@id='the-list' and contains(text(), '03:40 PM ') ]
		return element;
	}
}