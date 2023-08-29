package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AJIO {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");

		driver.findElement(By.name("searchVal")).sendKeys("Bags", Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='facet-linkhead']//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);

		String searchResults = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Output : " + searchResults);

		List<String> brandList = new ArrayList<String>();
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='items']//div[@class='brand']"));

		List<String> bagsNameList = new ArrayList<String>();
		List<WebElement> bagsName = driver.findElements(By.xpath("//div[@class='items']//div[@class='nameCls']"));

		for (int i = 0; i < brand.size(); i++) {
			String text = brand.get(i).getText();
			brandList.add(text);
		}
		System.out.println("List of Brands :");
		System.out.println(brandList);

		for (int i = 0; i < bagsName.size(); i++) {
			String text = bagsName.get(i).getText();
			bagsNameList.add(text);
		}
		System.out.println("List of Bag Names :");
		System.out.println(bagsNameList);
	}
}
