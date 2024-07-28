package HandleCalendarConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalendarConceptByJS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.airindia.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.className("ng-star-inserted"));
		
		String dateVal = "30-12-2018";
		
		selectDateByJS(driver, date, dateVal);
		

	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].setAttribute('value', '"+ dateVal +"');", element);
	}

}
