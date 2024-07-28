package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {

		// Launch EDGE BROWSER -->

		System.setProperty("webdriver.msedge.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/EdgeDriver/msedgedriver.exe/");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Title of Edge Browser : " + title);

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
