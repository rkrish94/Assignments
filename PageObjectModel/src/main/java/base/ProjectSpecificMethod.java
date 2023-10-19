package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;

public class ProjectSpecificMethod {

	public ChromeDriver driver;
	public String excelFile;
	public static Properties property1;

	@DataProvider(name = "fetchData")

	public String[][] getData() throws IOException {
		String[][] readData = ReadExcel.readData(excelFile);
		return readData;
	}

	@BeforeMethod
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/config.properties"));
		property.load(fis);
		driver.get(property.getProperty("url"));

		String lang = property.getProperty("language");
		property1 = new Properties();
		FileInputStream fis1 = new FileInputStream(new File("./src/main/resources/" + lang + ".properties"));
		property1.load(fis1);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
