package TestNGConcept;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void LoginPageTest() {
		System.out.println("LoginPageTest");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="LoginPageTest")
	public void HomePageTest() {
		System.out.println("HomePageTest");		
	}
	
	@Test
	public void SearchPageTest() {
		System.out.println("SearchPageTest");		
	}
	
	@Test (invocationCount = 3)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is --> " + c);
	}
	
/*	@Test(invocationTimeOut = 2000)
	public void infiniteloop() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}*/
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
