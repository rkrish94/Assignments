package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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

				// click CreateLead
				driver.findElement(By.name("submitButton")).click();

				// click edit
				driver.findElement(By.linkText("Edit")).click();

				// clear the text else the new string entered will get appended to the previous string
				driver.findElement(By.id("updateLeadForm_companyName")).clear();

				// enter companyName
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("FreshWorks");

				// click Update
				driver.findElement(By.name("submitButton")).click();

	}

}
