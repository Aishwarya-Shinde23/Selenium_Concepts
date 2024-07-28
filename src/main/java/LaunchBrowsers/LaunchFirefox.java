package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {

		// Launch GECKO BROWSER -->

		System.setProperty("webDriver.gecko.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/GeckoDriver/geckodriver.exe/");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Title of Firefox Browser : " + title);

		// To verify title :
		if (title.equals("Google")) {
			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect Title");

		}

		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
