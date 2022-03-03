package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class VerifyPrivB {

	WebDriver driver;
	public VerifyPrivB(WebDriver Jdriver) 
	{
		// TODO Auto-generated constructor stub
	 
   	this.driver=Jdriver;
	}
	
	@FindBy(xpath= "//*[@id=\"__next\"]/div/header/div[2]/nav/ul/li[5]") WebElement PBLink;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/div") WebElement PBHeader;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[1]/label") WebElement FN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[1]/input")WebElement FNTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[2]/label") WebElement LN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[2]/input") WebElement LNTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[3]/label") WebElement CE;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[3]/input") WebElement CETbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[4]/label") WebElement CW;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[4]/input") WebElement CWTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[5]/label") WebElement MoreInfo;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[5]/textarea") WebElement MITbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[6]/button/span") WebElement SubmitButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/section[1]/form/div[6]/p") WebElement SuccessText;
	
	
	public void NavToPrivateBetaPage()
	{
		Utility.waitForWebelement(driver, PBLink).click();
		System.out.println("LOG: INFO- Verified Private Beta Link");
	}
	
	public void ValidatePrivateBetaText() throws InterruptedException
	{
		
		Utility.waitForWebelement(driver, PBHeader).click();
		System.out.println("LOG: INFO- Validated Private Beta Header");
		Utility.captureScreenShot(driver);
	}
	
	public void ValidateBetaForm()
	{
		Utility.validateMessage(FN, "First Name");
		Utility.waitForWebelement(driver, FNTbox).sendKeys("Test");
		System.out.println("LOG: INFO- Verified First Name Feild");
		Utility.validateMessage(LN, "Last Name");
		Utility.waitForWebelement(driver, LNTbox).sendKeys("Test");
		System.out.println("LOG: INFO- Verified Last Name Feild");
		Utility.validateMessage(CE, "Company Email");
		Utility.waitForWebelement(driver, CETbox).sendKeys("Test@test.com");
		System.out.println("LOG: INFO- Verified Company Email Feild");
		Utility.validateMessage(CW, "Company Website");
		Utility.waitForWebelement(driver, CWTbox).sendKeys("Test.com");
		System.out.println("LOG: INFO- Verified Company Website Feild");
		Utility.validateMessage(MoreInfo, "Any other information you’d like to share?");
		Utility.waitForWebelement(driver, MITbox).sendKeys("This is a test");
		System.out.println("LOG: INFO- Verified Share More Info feild");
		Utility.waitForWebelement(driver, SubmitButton).click();
		Utility.validateMessage(SuccessText, "Thank you for signing up for our private beta. We are happy to hear from you and will be in touch shortly.");
		System.out.println("LOG: INFO- Verified Submission of form");
		Utility.captureScreenShot(driver);
		
		
	}
}
