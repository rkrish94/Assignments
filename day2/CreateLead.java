package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		// setup the path and launch the browser
		ChromeDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// find the element and enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// find the element and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// find the element and click login
		driver.findElement(By.className("decorativeSubmit")).click();

		// click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click Lead
		driver.findElement(By.linkText("Leads")).click();

		// click createlead
		driver.findElement(By.linkText("Create Lead")).click();

		// enter companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// enter firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Radhakrishnan");

		// enter lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rangarajan");

		// enter emailId
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kradha158@gmail.com");

		// enter emailId
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");

		// click CreateLead
		driver.findElement(By.name("submitButton")).click();

	}

}
