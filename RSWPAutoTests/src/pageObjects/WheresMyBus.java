package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WheresMyBus {
	private static WebElement element = null;

	public static WebElement busOption(WebDriver driver) {
		element = driver.findElement(By.linkText("Where's My Bus?"));
		return element;
	}

	public static WebElement browseRoutes(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='the-list']/a[1]")));
		return element;
	}

	public static WebElement stopName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='the-list']/a[1]")));
		return element;
	}

	public static WebElement StopText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='busHeaderText']/text()")));
		element.getText();
		return element;
	}

	public static WebElement stopNotifyBell(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertIcon")));
		return element;
	}

	public static WebElement DowModal(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertIcon")));
		return element;
	}

}
