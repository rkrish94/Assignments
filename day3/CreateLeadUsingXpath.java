package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadUsingXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();

		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("ThoughtWorks");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Rama");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Krishnan");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("rkn@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneNumber']")).sendKeys("9874562130");

		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
	}

}
