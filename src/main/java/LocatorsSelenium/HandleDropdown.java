package LocatorsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		//Handle Dropdown - 
		Select select = new Select(driver.findElement(By.id("carselect")));
		select.selectByVisibleText("Honda");
		
		driver.quit();
		
		

	}

}
