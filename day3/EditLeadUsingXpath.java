package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadUsingXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();

		driver.findElement(By.xpath("//input[@id = 'ext-gen248']")).sendKeys("Radhakrishnan");
		driver.findElement(By.xpath("//button[@id = 'ext-gen334']")).click();
		driver.findElement(By.xpath("(//a[text() = 'Radhakrishnan'])[1]")).click();

		String pageTitle = driver.getTitle();
		System.out.println("The title of the page : " + pageTitle);

		driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();

		driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).sendKeys("Skoda");
		
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();

		String updatedCompanyName = driver.findElement(By.xpath("//span[@id = 'viewLead_companyName_sp']")).getText();
		System.out.println("Updated Company Name : " + updatedCompanyName);

	}

}
