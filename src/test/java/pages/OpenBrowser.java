package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class OpenBrowser {
	
	WebDriver driver;
	public OpenBrowser (WebDriver Adriver)

	{

		this.driver=Adriver;
	}

	@FindBy(css= "#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll") WebElement ckpu;

	public void cookiespu()
	{
		Utility.waitForWebelement(driver, ckpu).click();
		System.out.println("LOG: INFO- Allowed All Cookies");	
	}

	public void validateHomePage()
	{
		Utility.validateContainsTitle(driver, "Home");
		System.out.println("LOG: INFO- Validated Homepage");
	}
	

}
