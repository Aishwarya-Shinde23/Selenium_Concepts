package PropertiesFileConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:/Users/AISHWARYA R SHINDE/eclipse-workspace/SeleniumProject1/src/main/java/PropertiesFileConcept/config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("Name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browser_name = prop.getProperty("browser");
		System.out.println(browser_name);

		System.out.println("***************************************************");

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

		driver.quit();

	}

}
