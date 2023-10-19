package week6.day4;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setUp() {
		fileName = "createLead";
	}

	@Test(dataProvider = "fetchData")
	public void createLeadTest(String companyName, String firstName, String lastName, String phoneNumber) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();

	}
}
