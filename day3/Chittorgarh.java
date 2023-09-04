package week4.day3;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[@title='NSE Bulk Deals']")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr"));

		System.out.println(rows.size());

		Set<String> securityNames = new LinkedHashSet<String>();

		for (int i = 1; i < rows.size(); i++) {
			String name = driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr["+i+"]/td[1]")).getText();
			securityNames.add(name);
		}
		System.out.println(securityNames);

	}

}
