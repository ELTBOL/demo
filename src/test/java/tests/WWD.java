package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.OpenBrowser;
import pages.VerifyGraphicImg;
import utilities.BaseClass;

public class WWD extends BaseClass{
	
	OpenBrowser op;
	VerifyGraphicImg gi;
	
	@Test (priority=1, alwaysRun=true)
	public void WWDregTest() throws InterruptedException
	{
		logger = report.createTest("Regression test for What We Do landing page for corporate site" );
		op = PageFactory.initElements(driver, OpenBrowser.class);
		gi = PageFactory.initElements(driver, VerifyGraphicImg.class);
		Thread.sleep(1000);
		op.cookiespu();
		logger.pass("Cookies pop up initialized");
		op.validateHomePage();
		logger.pass("Homepage validated");
		gi.ClickWWDLink();
		logger.pass("Validated What We do landing page and Video Banner");
		gi.ValidateGraphicImg1();
		logger.pass("First Img and Text Verified and Validated");
		gi.ValidateGraphicImg2();
		logger.pass("Second Img and Text Verified and Validated");
		gi.ValidateGraphicImg3();
		logger.pass("Third Img and Text Verified and Validated");
		gi.ValidateGraphicImg4();
		logger.pass("Fourth Img and Text Verified and Validated");
		gi.ValidateGraphicImgR();
		logger.pass("Restarting Gallery Img and Text Verified and Validated");
		
		
	}

}
