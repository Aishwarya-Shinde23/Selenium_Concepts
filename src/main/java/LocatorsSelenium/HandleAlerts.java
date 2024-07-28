package LocatorsSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");

		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Tom");

		driver.findElement(By.cssSelector("#alertbtn")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//Validate Alert button text -
		if(alert.getText().equals("Hello Tom, share this practice page and share your knowledge")) {
			System.out.println("Correct Alert message displayed --> Alert btn");
		}
		else {
			System.out.println("Incorrect Alert message displayed --> Alert btn");
		}
		
		Thread.sleep(2000);
		
		alert.accept();

		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(alert.getText());
		
		//Validate Confirm button text -
		if(alert.getText().equals("Hello , Are you sure you want to confirm?")) {
			System.out.println("Correct Alert message displayed --> Confirm btn");
		}
		else {
			System.out.println("Incorrect Alert message displayed --> Confirm btn");
		}

		alert.dismiss();
		
		driver.quit();

	}

}
