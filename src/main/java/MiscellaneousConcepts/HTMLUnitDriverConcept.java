package MiscellaneousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		// Headless Browser testing using HTMLUnitDriver in selenium -

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch HEADLESS CHROME BROWSER -->
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.freecrm.com/");
		
		Thread.sleep(3000);

		System.out.println("Before login title is : " + driver.getTitle());
		
		driver.findElement(By.cssSelector(".btn")).click();
		
		driver.findElement(By.name("email")).sendKeys("aishwaryashinde23496@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Aishwarya@96");
		
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		
		Thread.sleep(3000);

		System.out.println("After login title is : " + driver.getTitle());

	}

}
