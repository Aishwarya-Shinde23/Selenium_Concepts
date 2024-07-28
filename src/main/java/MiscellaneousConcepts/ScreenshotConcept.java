package MiscellaneousConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com/");
		
		//Take screenshot and store as FILE format - 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Now, copy the screenshot to desired location using copyFile method - 
		FileUtils.copyFile(src, new File("C:\\Users\\AISHWARYA R SHINDE\\Downloads\\image.png"));

		driver.quit();

	}

}
