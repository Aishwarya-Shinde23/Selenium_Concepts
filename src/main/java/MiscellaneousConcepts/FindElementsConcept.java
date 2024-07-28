package MiscellaneousConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		List<WebElement> Linklist = driver.findElements(By.tagName("a"));

		System.out.println(Linklist.size());

		for (int i = 0; i < Linklist.size(); i++) {
			String Linktext = Linklist.get(i).getText();

			System.out.println(Linktext);
		}

		driver.quit();

	}

}
