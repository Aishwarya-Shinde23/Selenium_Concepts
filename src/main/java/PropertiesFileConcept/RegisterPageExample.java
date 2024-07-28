package PropertiesFileConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterPageExample {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\AISHWARYA R SHINDE\\eclipse-workspace\\SeleniumProject1\\src\\main\\java\\PropertiesFileConcept\\config.properties");

		prop.load(ip);
		
		String url = prop.getProperty("URL1");
		
		String browser_name = prop.getProperty("browser1");
				
		if (browser_name.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

			driver = new ChromeDriver();

		}

		else if (browser_name.equals("firefox")) {

			System.setProperty("webDriver.gecko.driver",
					"D:/SeleniumAutomationProject/BrowserDrivers/GeckoDriver/geckodriver.exe/");

			driver = new FirefoxDriver();

		}

		else if (browser_name.equals("MicrosoftEdge")) {

			System.setProperty("webdriver.msedge.driver",
					"D:/SeleniumAutomationProject/BrowserDrivers/EdgeDriver/msedgedriver.exe/");

			driver = new EdgeDriver();

		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath(prop.getProperty("name_xpath"))).sendKeys(prop.getProperty("name"));
		
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.xpath(prop.getProperty("gender_xpath"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("mobile_xpath"))).sendKeys(prop.getProperty("mobile"));
		
		driver.findElement(By.xpath(prop.getProperty("subjects_xpath"))).sendKeys(prop.getProperty("subjects"));
		
		driver.quit();

	}

}
