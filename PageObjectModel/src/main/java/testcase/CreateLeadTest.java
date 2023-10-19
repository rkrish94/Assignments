package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod {

	@BeforeTest
	public void setUp() {
		excelFile = "createLead";
	}
	
	@Test(dataProvider="fetchData")
	public void runRreateLead(String username, String password, String companyName, String firstName, String lastName) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(username)
			.enterPassword(password)
			.clickLogin()
			.clickCrmSfa()
			.clickLead()
			.clickCreateLead()
			.enterCompanyName(companyName)
			.enterFirstName(firstName)
			.enterLastName(lastName)
			.clickCreateLeadButton()
			.verifyFirstName();
	}
}
