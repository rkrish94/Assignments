package week5.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find the element and enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// find the element and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// find the element and click login
		driver.findElement(By.className("decorativeSubmit")).click();

		// click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click Contacts
		driver.findElement(By.linkText("Contacts")).click();

		// click Merge Contacs using xpath locator
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//li)[4]")).click();

		// click on widget of from contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> listWindow =new ArrayList<String>(windowHandles);

		driver.switchTo().window(listWindow.get(1));
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		driver.switchTo().window(listWindow.get(0));

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> listWindow1 =new ArrayList<String>(windowHandles1);

		driver.switchTo().window(listWindow1.get(1));

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

		driver.switchTo().window(listWindow1.get(0));

		driver.findElement(By.className("buttonDangerous")).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		String title = driver.getTitle();

		System.out.println("Title of the page : " + title);
		
	}

}
