package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev124621.service-now.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Ak^x88vhDMV=");
		driver.findElement(By.id("sysverb_login")).click();
		// Thread.sleep(5000);

		// to access shadow elements
		Shadow dom = new Shadow(driver);
		driver.findElement(By.id("d6e462a5c3533010cbd77096e940dd8c")).click();
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		
	}

}
