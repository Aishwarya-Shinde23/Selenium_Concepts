package MiscellaneousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size = 1400,800");
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		System.out.println("Title after URL launched is - " + driver.getTitle());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1650)", "");

		driver.findElement(
				By.xpath("//td[contains(text(), 'Francisco Chang')]/parent::tr//following-sibling::td[5]//a")).click();

		driver.navigate().back();

		driver.findElement(
				By.xpath("//td[contains(text(), 'Francisco Chang')]/parent::tr//preceding-sibling::td[1]//input")).click();
		
		System.out.println("Title after element is clicked is - " + driver.getTitle());
		
		driver.quit();

	}

}
