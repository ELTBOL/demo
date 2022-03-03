package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.OpenBrowser;
import pages.VerifyPrivB;
import utilities.BaseClass;


public class PrivateBeta extends BaseClass{

	OpenBrowser op;
	VerifyPrivB pb;
	
	
	@Test (priority=4)
	public void PrivateBetaregest() throws InterruptedException
	{
		logger = report.createTest("Regression test for Private Beta landing page for corporate site" );
		op = PageFactory.initElements(driver, OpenBrowser.class);
		pb = PageFactory.initElements(driver, VerifyPrivB.class);
		
		
		op.cookiespu();
		logger.pass("Cookies pop up initialized");
		op.validateHomePage();
		logger.pass("Homepage validated");
		pb.NavToPrivateBetaPage();
		logger.pass("Verified Private Beta Header Link");
		pb.ValidatePrivateBetaText();
		logger.pass("Verified Private Beta Page Text");
		pb.ValidateBetaForm();
		logger.pass("Validated Private Beta Form");
		
	}
	
}
