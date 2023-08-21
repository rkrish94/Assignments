package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {

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

		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9988776655");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		WebElement firstResultingLead = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String idText = firstResultingLead.getText();
		System.out.println(idText);
		firstResultingLead.click();

		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(idText);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String expectedDisplayRecords="No records to display";
		String actualDisplayRecords=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(expectedDisplayRecords.equals(actualDisplayRecords)) {
			System.out.println("Passed. No records to display");
		}
		driver.close();
	}

}
