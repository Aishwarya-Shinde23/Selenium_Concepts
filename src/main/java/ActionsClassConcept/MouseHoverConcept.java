package ActionsClassConcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/"); // enter URL
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.cssSelector(".btn")).click();

		driver.findElement(By.name("email")).sendKeys("aishwaryashinde23496@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Aishwarya@96");
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.cssSelector(".item"))).build().perform();
		
		driver.findElement(By.cssSelector(".ui.mini.basic.icon.button")).click();

	}

}
