package week6.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation {
	@Test
	public void test1() {
		System.out.println("@Test1");
	}

	@Test
	public void test2() {
		System.out.println("@Test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
