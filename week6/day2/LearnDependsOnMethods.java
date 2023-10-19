package week6.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(timeOut = 1000)
	public void method1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Method 1");
	}

	@Test
	public void method2() {
		System.out.println("Method 2");
	}

	@Test
	public void method3() {
		System.out.println("Method 3");
	}
}
