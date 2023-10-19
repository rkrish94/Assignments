package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {

	@BeforeTest
	public void setUp() {
		excelFile = "login";
	}

	@Test(dataProvider = "fetchData")
	public void runLoginTest(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLogin();
	}
}
