package HandleCalendarConcept;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumAutomationProject/BrowserDrivers/ChromeDriver/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.globalsqa.com/demo-site/datepicker/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,180)", "");

		driver.findElement(By.id("DropDown DatePicker")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==']")));		
		
		Thread.sleep(5000);

		driver.findElement(By.id("datepicker")).click();
		
		String date = "31-Dec-2024";

		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.xpath("//select[@title='Select year']")));
		select.selectByVisibleText(year);

		Select select1 = new Select(driver.findElement(By.xpath("//select[@title='Select month']")));
		select1.selectByVisibleText(month);

		/*
		 * Abs xpath -
		 * html[1]/body[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[2
		 * ]/div[3]
		 * html[1]/body[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[2
		 * ]/div[4]
		 * html[1]/body[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[2
		 * ]/div[5]
		 * /html[1]/body[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[
		 * 2]/div[3]/span[1]
		 * /html[1]/body[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[
		 * 2]/div[4]/span[1]
		 */

		String before_xpath = "//html[1]/body[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[";
		String after_xpath = "]/div[";

		final int totalweekdays = 7;

		boolean flag = false;
		String dayVal = null;

		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalweekdays; colNum++) {

				try {
				dayVal = driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).getText();
				}
				catch(NoSuchElementException e) {
					System.out.println("Please print the correct date value -  ");
					flag = false;
					break;
					
				}

				System.out.println(dayVal);

				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).click();

					flag = true;
					break;
				}

			}

			if (flag) {
				break;
			}

		}

	}
}
