package MiscellaneousConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksConcept {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in");

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));

		System.out.println("Size of links list : " + linkslist.size());

		List<WebElement> activelinklist = new ArrayList<WebElement>();

		for (int i = 0; i < linkslist.size(); i++) {
			System.out.println(linkslist.get(i).getAttribute("href"));

			if (linkslist.get(i).getAttribute("href") != null
					&& (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activelinklist.add(linkslist.get(i));
			}
		}

		System.out.println("Size of activelinklist : " + activelinklist.size());

		for (int j = 0; j < activelinklist.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activelinklist.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();

			String response = connection.getResponseMessage();

			connection.disconnect();

			System.out.println(activelinklist.get(j).getAttribute("href") + "----->" + response);

		}

	}

}
