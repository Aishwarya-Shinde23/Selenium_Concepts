package HandlePopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		// Launch CHROME BROWSER -->
		WebDriver driver = new ChromeDriver();
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//input[@id='ctl00_ContentMain_popupTest']")).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("ParentWindow Id : " + parentWindowId);
		
		System.out.println("Parent Window pop-up title : " + driver.getTitle());

		String childWindowId = it.next();
		System.out.println("ChildWindow Id : " + childWindowId);

		driver.switchTo().window(childWindowId);
		
		System.out.println("Child Window pop-up title : " + driver.getTitle());

		driver.close(); //Closes browser tab
		
		driver.quit(); //Closes complete browser

	}

}
