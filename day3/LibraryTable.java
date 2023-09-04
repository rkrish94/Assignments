package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement tableHead = driver.findElement(By.xpath("//div[@class='render']/table/thead"));
		WebElement tableBody = driver.findElement(By.xpath("//div[@class='render']/table/tbody"));

		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		List<WebElement> columns = tableHead.findElements(By.tagName("th"));

		for (int i = 1; i <= columns.size(); i++) {
			String text = driver.findElement(By.xpath("//div[@class='render']/table/thead/tr[1]/th[" + i + "]"))
					.getText();
			System.out.print(text + "\t\t");
		}

		for (int i = 1; i <= rows.size(); i++) {
			System.out.println();
			for (int j = 1; j <= columns.size(); j++) {
				String text = driver
						.findElement(By.xpath("//div[@class='render']/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(text + "\t\t");
			}
		}

	}

}
