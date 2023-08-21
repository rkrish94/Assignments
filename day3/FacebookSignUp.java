package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// finding elements via Xpath locator
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Preethi");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Shenoy");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("preetiS@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Learning@123");

		// handling dropdowns using Select class
		WebElement birthDate = driver.findElement(By.name("birthday_day"));
		Select selectBirthDate = new Select(birthDate);
		selectBirthDate.selectByIndex(13);

		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		Select selectBirthMonth = new Select(birthMonth);
		selectBirthMonth.selectByIndex(7);

		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		Select selectBirthYear = new Select(birthYear);
		selectBirthYear.selectByIndex(31);

		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
	}

}
