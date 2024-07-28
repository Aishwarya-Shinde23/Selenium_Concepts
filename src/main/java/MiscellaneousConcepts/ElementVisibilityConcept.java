package MiscellaneousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.letskodeit.com/practice");

		Boolean b = driver.findElement(By.id("displayed-text")).isDisplayed();

		System.out.println("Element is displayed : " + b);

		driver.findElement(By.id("hide-textbox")).click();

		Boolean b1 = driver.findElement(By.id("displayed-text")).isDisplayed();

		System.out.println("Element is displayed : " + b1);

		System.out.println("******i****************************");

		Boolean b2 = driver.findElement(By.id("enabled-example-input")).isEnabled();

		System.out.println("Element is enabled : " + b2);

		driver.findElement(By.id("disabled-button")).click();

		Boolean b3 = driver.findElement(By.id("enabled-example-input")).isEnabled();

		System.out.println("Element is enabled : " + b3);

		System.out.println("**********************************");

		Boolean b4 = driver.findElement(By.id("bmwcheck")).isSelected();

		System.out.println("Element is selected : " + b4);

		driver.findElement(By.id("bmwcheck")).click();

		Boolean b5 = driver.findElement(By.id("bmwcheck")).isSelected();

		System.out.println("Element is selected : " + b5);

		driver.quit();

	}

}
