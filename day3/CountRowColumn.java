package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowColumn {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
        driver.get("https://html.com/tags/table/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement webTable = driver.findElement(By.className("attributes-list"));

        List<WebElement> rowCount = webTable.findElements(By.tagName("tr"));
        List<WebElement> columnCount = webTable.findElements(By.tagName("th"));

        System.out.println("Row Count : "+ rowCount.size());
        System.out.println("Column Count : " + columnCount.size());

	}

}
