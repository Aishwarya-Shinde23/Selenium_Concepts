package FrameConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("https://www.freecrm.com/"); // enter URL
		
		driver.findElement(By.cssSelector(".btn")).click();

		driver.findElement(By.name("email")).sendKeys("aishwaryashinde23496@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Aishwarya@96");
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		Thread.sleep(3000);

//		driver.switchTo().frame("downloadFrame"); --> This code won't work as there is a change in website layout
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.cssSelector(".users.icon"));
		
		action.moveToElement(element).build().perform();
		
		driver.findElement(By.cssSelector(".ui.mini.basic.icon.button")).click();
		
		
	}

}