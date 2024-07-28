package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch Browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
}
