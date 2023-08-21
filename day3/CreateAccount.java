package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limit Account");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Google User");

		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("10000");

		WebElement industryName = driver.findElement(By.name("industryEnumId"));
		Select industryNameSelect = new Select(industryName);
		industryNameSelect.selectByIndex(3);
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipSelect = new Select(ownership);
		ownershipSelect.selectByVisibleText("S-Corporation");

		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select sourceSelect = new Select(source);
		sourceSelect.selectByValue("LEAD_EMPLOYEE");

		WebElement marketingCampaign = driver.findElement(By.name("marketingCampaignId"));
		Select marketingCampaignSelect = new Select(marketingCampaign);
		marketingCampaignSelect.selectByIndex(6);

		WebElement stateOrProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateOrProvinceSelect = new Select(stateOrProvince);
		stateOrProvinceSelect.selectByValue("TX");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();


	}

}