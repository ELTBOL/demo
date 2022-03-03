package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.OpenBrowser;
import pages.VerifyNMPage;
import utilities.BaseClass;


public class NewsAMedia extends BaseClass
{
	OpenBrowser op;
	VerifyNMPage nm;
	
	
	@Test (priority=3)
	public void NewsMediaregTest() throws InterruptedException
	{
		logger = report.createTest("Regression test for News and Media landing page for corporate site" );
		op = PageFactory.initElements(driver, OpenBrowser.class);
		nm = PageFactory.initElements(driver, VerifyNMPage.class);
				
		op.cookiespu();
		logger.pass("Cookies pop up initialized");
		op.validateHomePage();
		logger.pass("Homepage validated");
		nm.ClickNewsMediaLink();
		logger.pass("Navigated to News and Media Page");
		nm.VerifyNMBanner();
		logger.pass("Validated News and Media Banner");
		nm.VerifyMediaContact();
		logger.pass("Validated Media Contact info");
		nm.VerifyBrandAssets();
		logger.pass("Validated Brand Assets Text and Logo Pack");
		nm.VerifyPhotoPack();
		logger.pass("Vaildated Photo Pack Header and download");
		nm.NavToPressRelease();
		logger.pass("Validated Press Release");
		

		
	}
}
