package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FSCSLinks;
import pages.OpenBrowser;
import pages.TwitterIcon;
import pages.VerifyImg;
import pages.VerifyVid;
import utilities.BaseClass;

public class WWA extends BaseClass {
	
	OpenBrowser op;
	VerifyVid vv;
	VerifyImg vi;
	TwitterIcon ti;
	FSCSLinks fl;
	
	@Test (priority=0)
	public void WWAregTest() throws InterruptedException
	{
		logger = report.createTest("Regression test for Who We Are landing page for corporate site" );
		op = PageFactory.initElements(driver, OpenBrowser.class);
		vv = PageFactory.initElements(driver, VerifyVid.class);
		vi = PageFactory.initElements(driver, VerifyImg.class);
		ti = PageFactory.initElements(driver, TwitterIcon.class);
		fl = PageFactory.initElements(driver, FSCSLinks.class);
		op.cookiespu();
		logger.pass("Cookies pop up initialized");
		op.validateHomePage();
		logger.pass("Homepage validated");
		vv.validateVideoText();
		logger.pass("Validated Video Banner");
		vv.ss();
		logger.pass("Screenshot for GUI Verification");
		vv.pressPlay();
		logger.pass("Video Play Button Verified");
		vv.vidInMotion();
		logger.pass("Verified all video buttons");
		vv.vss();
		logger.pass("Validated Screenshot for video playing GUI");
		vi.clickAnthonyImg();
		logger.pass("Verfied Opening letter image and Screenshot taken for GUI verification");
		vi.verifyImgButtons();
		logger.pass("Validated Download Photos Button and X Icon on opening letter page");
		ti.TwitterLink();
		logger.pass("Verified Twitter Icon");
		ti.TwitterExitPage();
		logger.pass("Validated Twitter Exit Page and Verified Banner, Screenshot taken for GUI verification");
		ti.TwitterProceed();
		logger.pass("Validate page transition to twitter landing page");
		ti.validateTwitterPage();
		logger.pass("Verify Twitter URL for Corp. Site, take Screenshot for GUI verification");
		fl.ValidateFSCSBanner();
		logger.pass("Validate FSCS Banner");
		fl.ValidateFSCSBody();
		logger.pass("Validate FSCS Body");
		fl.ValidateFSCSLink();
		logger.pass("Validate FSCS page");
		fl.ValidateFactsSheet();
		logger.pass("Validated FSCS Facts Sheet");
	}
	

}
