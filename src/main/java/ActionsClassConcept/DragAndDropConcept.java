package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/"); // enter URL

		driver.switchTo().frame(0);

		Actions action = new Actions(driver);

		Thread.sleep(3000);

		action.clickAndHold(driver.findElement(By.cssSelector("#draggable")))
				.moveToElement(driver.findElement(By.cssSelector("#droppable"))).release().build().perform();

		driver.quit();
	}

}
