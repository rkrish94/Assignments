package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	// driver declared as global variable to be accessed across methods and classes.
	
	// public ChromeDriver driver;

	/*
	 * To connect StepDefinition with .feature file, we use annotations
	 * like @Given, @Then, etc. with string input copied from the steps in .feature
	 * file (should be the same text)
	 */

	/*
	 * @Given("Launch the browser") public void openBrowser() { driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @Given("Load the application url") public void loadUrl() {
	 * driver.get("http://leaftaps.com/opentaps/"); }
	 */

	@Given("Enter the userName as {string}")
	public void enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Home page is displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is Not displayed");
		}
	}

	@But("Error message is displayed")
	public void verifyErrorMsg() {
		System.out.println("Error message is displayed");
	}

	@Then("Click CRMSFA")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then("Click Leads")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Then("Click Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the Company Name")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}

	@Given("Enter the First Name")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	}

	@Given("Enter the Last Name")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	}
}
