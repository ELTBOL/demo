package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import dataprovider.DataProviderFactory;

public class BaseClass {

	// we are creating objects so we can reference back to them
	// instead of calling the jar files every time.
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	BrowserFactories brow;

	@BeforeClass()
	public void setupReport() throws InterruptedException {
		System.out.println("LOG: Info- Before Suite Running- Setting Up Report");

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				new File(System.getProperty("user.dir") + "/Reports/AP" + Utility.getTime() + ".html"));

		report = new ExtentReports();
		report.attachReporter(reporter);

		System.out.println("LOG: Info- After Suite Running - Reports are ready to use");

		System.out.println("LOG: INFO- Creating Browser Session");
		
		String environment = System.getProperty("Env","PROD");
		String browser = System.getProperty("browser","chrome");

		switch (environment) {
		case "DEV":
			driver = BrowserFactories.startBrowser(browser,DataProviderFactory.getConfig().getDevURL());
			break;
		case "PROD":
			driver = BrowserFactories.startBrowser(browser,DataProviderFactory.getConfig().getStagingURL());
			break;
		}
		System.out.println("LOG: Info- Browser Session Created");
		Thread.sleep(2000);
	}

	@AfterMethod

	public void closeSession() {

		System.out.println("LOG: INFO- Closing Browser Session");
		driver.quit();
		System.out.println("LOG: INFO- After method executed");
	}

	@AfterSuite

	public void appendReport(ITestResult result) {
		System.out.println("Test Name " + result.getName());

		System.out.println("LOG: INFO- After method running - Generating test report");

		int status = result.getStatus();

		if (status == ITestResult.SUCCESS) {
			try {// build method for action classes to compile all the code into one action
				logger.pass("Test Scenario Passed",
						MediaEntityBuilder.createScreenCaptureFromPath(Utility.captureScreenShot(driver)).build());

			}

			catch (IOException e) {
				System.out.println("Not Able to attach screenshot " + e.getMessage());
			}
		} else if (status == ITestResult.FAILURE) {
			try {// get throwable basically tells you what type of exception it is
				logger.fail("Test Failed" + result.getThrowable(),
						MediaEntityBuilder.createScreenCaptureFromPath(Utility.captureScreenShot(driver)).build());
			} catch (IOException e) {
				System.out.println("Not able to attach screenshot " + e.getMessage());
			}
		} else if (status == ITestResult.SKIP) {
			logger.skip("Test Scenario skipped");
		} // flush basically empties the old and starts the basis for a new report
		report.flush();

		System.out.println("LOG: INFO- After Method Executed- Test Result appended to report");

	}

}
