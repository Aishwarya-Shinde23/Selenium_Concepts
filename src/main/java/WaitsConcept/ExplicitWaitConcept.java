package WaitsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver",
				"\"D:\\SeleniumAutomationProject\\BrowserDrivers\\ChromeDriver\\chromedriver.exe\"");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		clickOn(driver, driver.findElement(By.xpath("//a[contains(text(), 'Login')]")), Duration.ofSeconds(10));

	}

	public static void clickOn(WebDriver driver, WebElement locator, Duration timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));

		locator.click();

	}

}
