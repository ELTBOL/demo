package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.OpenBrowser;
import pages.TalentAquisition;
import pages.VerifyJoinUs;
import utilities.BaseClass;

public class JoinUs extends BaseClass {

	OpenBrowser op;
	VerifyJoinUs vjs;
	TalentAquisition ta;

	@Test(priority = 2)
	public void JoinUsregTest() throws InterruptedException {
		logger = report.createTest("Regression test for Join Us landing page for corporate site");
		op = PageFactory.initElements(driver, OpenBrowser.class);
		vjs = PageFactory.initElements(driver, VerifyJoinUs.class);
		ta = PageFactory.initElements(driver, TalentAquisition.class);

		op.cookiespu();
		logger.pass("Cookies pop up initialized");
		op.validateHomePage();
		logger.pass("Homepage validated");
		vjs.VerifyJoinUsHeader();
		logger.pass("Validated Join Us Header Banner");
		vjs.ValidateOpenLetters();
		logger.pass("Verified Images for Opening Letters and Validated the Text Body and Title");
		vjs.ValidateCoreValues();
		logger.pass("Verified Core Values");
		ta.ValidateNavOfTA();
		logger.pass("Validated Talent Aquisition Navigation");
		ta.ValidateTalentTransitionPage();
		logger.pass("Talent Transition Page Validated");
		ta.ValidateTalentApplication();
		logger.pass("Talent Aquisition Application Validated");

	}
}
