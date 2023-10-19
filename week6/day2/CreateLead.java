package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	@Test(dataProvider = "fetchData")
	public void createLeadTest(String companyName, String firstName, String lastName) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();

	}
	@DataProvider(name="fetchData")
	public String[][] getData() {
		String[][] data = new String[2][3];

		data[0][0] = "TestLeaf";
		data[0][1] = "Radha";
		data[0][2] = "Krishnan";
		// data[0][3] = "9988776655";

		data[1][0] = "ThoughtWorks";
		data[1][1] = "Hari";
		data[1][2] = "Krishnan";
		// data[1][3] = "8877665544";
		return data;
	}
}
