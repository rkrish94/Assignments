package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {

		// setup the physical path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html"); // ExtentHtmlReporter(File file)
		// to keep the report history
		reporter.setAppendExisting(true);
		// create object for ExtentReporters
		ExtentReports extent = new ExtentReports();
		// attach data with physical path (reporter)
		extent.attachReporter(reporter);

		// create a test, assign the details      // testName     //testDescription
		ExtentTest test = extent.createTest("Login Test", "Login with positive credentials"); // createTest(String TestName) <- returns ExtentTest
		test.assignCategory("Smoke");
		test.assignAuthor("Radhakrishnan");

		// step level status
		test.pass("Enter the username", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/LeafLogin.png").build());
		test.pass("Enter password");
		test.fail("Click login");
		// Mandatory step
		extent.flush();

		
	}

}
