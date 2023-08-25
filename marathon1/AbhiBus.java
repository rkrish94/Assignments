package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("pills-home-tab")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[contains(text(),\"26\")]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		String firstResultText = driver.findElement(By.xpath("(//div[@id='SerVicesDetOnewayInner']//h2[contains(text(),\"Yolo Bus\")])[1]")).getText();
		System.out.println("First Resulting Bus Service Name : " + firstResultText);
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
		String seatsAvailableText = driver.findElement(By.xpath("(//div[@id='SerVicesDetOnewayInner']//p[@class='noseats AvailSts ng-binding'])[1]")).getText();
		System.out.println("Seats Available : " + seatsAvailableText);
		driver.findElement(By.xpath("(//div[@id='SerVicesDetOnewayInner']//span[contains(text(),'Select Seat')])[1]")).click();
		driver.findElement(By.id("UO4-1ZZ")).click();
		String seatsSelectedText = driver.findElement(By.xpath("//div[@class='jurnydetails']//span[@id='seatnos']")).getText();
		System.out.println("Seat Selected : " + seatsSelectedText);
		String seatFareText = driver.findElement(By.xpath("//div[@class='jurnydetails']//span[@id='ticketfare']")).getText();
		System.out.println("Seat Fare : " + seatFareText);

		WebElement boardingPointElement = driver.findElement(By.id("boardingpoint_id"));
		Select boardingPoint = new Select(boardingPointElement);
		boardingPoint.selectByIndex(2);
		WebElement droppingPointElement = driver.findElement(By.id("droppingpoint_id"));
		Select droppingPoint = new Select(droppingPointElement);
		droppingPoint.selectByIndex(4);
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
	}
}
