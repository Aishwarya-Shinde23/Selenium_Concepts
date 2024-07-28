package LocatorsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://fastupload.io/en");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("dz-hidden-input")).sendKeys("C:\\Users\\AISHWARYA R SHINDE\\Downloads\\Previous Downloads\\Info.txt");

		driver.quit();
		
	}

}
