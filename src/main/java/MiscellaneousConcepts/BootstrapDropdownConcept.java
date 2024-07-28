package MiscellaneousConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		driver.findElement(By.id("dropdownMenuButton")).click();

		List<WebElement> list = driver
				.findElements(By.xpath("//button[@id='dropdownMenuButton']//following-sibling::div//a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("Something else here")) {
				list.get(i).click();
				break;
			}
		}

	}

}
