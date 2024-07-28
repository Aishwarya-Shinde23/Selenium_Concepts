package HandleDynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		/*
		 * ABSOLUTE XPATH :- 
		 * ROW 1 -
		 * /html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/form[1]/div[2]/table[1]/tbody[1
		 * ]/tr[1]/td[1] 
		 * 
		 * ROW 2 -
		 * /html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/form[1]/div[2]/table[1]/tbody[1
		 * ]/tr[2]/td[1]
		 */

		String before_xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/form[1]/div[2]/table[1]/tbody[1]/tr[";

		String after_xpath = "]/td[1]";

		for (int i = 1; i <= 5; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);

			if (name.contains("Alden")) {
				driver.navigate().refresh();
				String email_id = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[4]")).getText();
				System.out.println(email_id);

			}

		}

		driver.quit();

	}

}
