package TestNGConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com");
		
	}
	
	@Test(priority=1, groups="Title_Test")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);	
		
		Assert.assertEquals(title, "Google", "The title is not matched");
	}
	
	@Test(priority=3, groups="Logo_Test")
	public void googleLogoTest() {
		Boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		
		Assert.assertTrue(b);
	}
	
	@Test(priority=2, groups="Link_Test")
	public void mailLinkTest() {
		Boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();		
	}
	
	@Test(priority=4, groups="Test")
	public void test1() {
		System.out.println("Test_1");
	}
	
	@Test(priority=6, groups="Test")
	public void test2() {
		System.out.println("Test_2");
	}
	
	@Test(priority=5, groups="Test")
	public void test3() {
		System.out.println("Test_3");
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
