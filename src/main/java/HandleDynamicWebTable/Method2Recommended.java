package HandleDynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method2Recommended {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1650)", "");

		driver.findElement(
				By.xpath("//td[contains(text(), 'Francisco Chang')]/parent::tr//following-sibling::td[5]//a")).click();

		driver.navigate().back();

		driver.findElement(
				By.xpath("//td[contains(text(), 'Francisco Chang')]/parent::tr//preceding-sibling::td[1]//input")).click();
		
		driver.quit();

	}

}
