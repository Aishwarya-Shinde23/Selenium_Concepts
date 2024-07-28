package TestNGConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcept {

	WebDriver driver;

	@Test
	@Parameters({ "env", "browser", "url", "username", "password" })

	public void LoginTest(String env, String browser, String url, String username, String password) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.get(url);
		}

		driver.findElement(By.cssSelector(".btn")).click();

		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();

	}

}
