package LocatorsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		//1. Locator = id 
		driver.findElement(By.id("autosuggest")).sendKeys("Test123");
		
		//2. Locator = Xpath
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Tom");
		
		//3. Locator = cssSelector
		driver.findElement(By.cssSelector("#displayed-text")).sendKeys("Example_01");
		
		//4. Locator = name
		driver.findElement(By.name("enter-name")).sendKeys("Nick");
		
		//5. Locator = LinkText
		//driver.findElement(By.linkText("dynamic-link")).click();
		
		driver.quit();
		
	}

}
