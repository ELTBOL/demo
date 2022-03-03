package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class TalentAquisition {

	WebDriver driver;
	public TalentAquisition(WebDriver Gdriver) 
	{
		// TODO Auto-generated constructor stub
	 
   	this.driver=Gdriver;
	}
	
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[1]/div[2]/button") WebElement JSBUButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/h2") WebElement TAHeader;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[1]/button") WebElement LocDropdown;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[1]/div[2]/div[2]") WebElement UKButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[1]/div[1]/div[1]/p[2]/span") WebElement UKLocation1;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[2]/div[1]/div[1]/p[2]/span") WebElement UKLocation2;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[3]/div[1]/div[1]/p[2]/span") WebElement UKLocation3;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[4]/div[1]/div[1]/p[2]/span") WebElement UKLocation4;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[5]/div[1]/div[1]/p[2]/span") WebElement UKLocation5;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[6]/div[1]/div[1]/p[2]/span") WebElement UKLocation6;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[1]/div[2]/div[3]") WebElement USButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[1]/div[1]/div[1]/p[2]/span") WebElement USLocation1;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[2]/div[1]/div[1]/p[2]/span") WebElement USLocation2;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[3]/div[1]/div[1]/p[2]/span") WebElement USLocation3;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div[2]/section[1]/div[2]/button") WebElement LearnMButton;
	@FindBy(xpath= "//*[@id=\"spandesc\"]/div[1]/h1") WebElement JobPageHeaderJS;
	@FindBy(xpath= "//*[@id=\"spandesc\"]/div[1]/div/h1[1]/b") WebElement JobHeaderWYD;
	@FindBy(xpath= "//*[@id=\"spandesc\"]/div[1]/div/h1[2]") WebElement JobHeaderWYB;
	@FindBy(xpath= "//*[@id=\"spandesc\"]/div[1]/div/div/h1") WebElement JobHeaderWL;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div/div[1]/h3") WebElement JobHeaderRD;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[2]/div/div[5]/button/span") WebElement ApplyButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/h3") WebElement TAppHeader;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[1]/label") WebElement FN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[1]/input") WebElement FNTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[2]/label") WebElement LN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[2]/input") WebElement LNTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[3]/label") WebElement EA;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[3]/input") WebElement EATbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[4]/label") WebElement Country;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[4]/select") WebElement CDropdown;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[5]/label") WebElement PN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[5]/input") WebElement PNTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[6]/label") WebElement City;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[6]/input") WebElement CTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[7]/div/label") WebElement Address;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[7]/div/input") WebElement ATbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[8]/label") WebElement State;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[8]/input") WebElement STbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[9]/label") WebElement Zip;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[9]/input") WebElement ZTbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[10]/div/label") WebElement CV;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[10]/div/div[1]/div") WebElement CVDropbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[11]/div/label") WebElement ShareInfo;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[11]/div/textarea") WebElement SITbox;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[12]/button/span") WebElement SubmitButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[2]/div[1]/form/div[13]/div") WebElement SuccessText;
	
	
	
	
	
	public void ValidateNavOfTA()
	{
		Utility.waitForWebelement(driver, JSBUButton).click();
		System.out.println("LOG; INFO- Navigating To Talent Aquisition Section");
		Utility.validatePartialText(TAHeader, "EXPLORE");
		Utility.validatePartialText(TAHeader, "OUR");
		Utility.validatePartialText(TAHeader, "OPPORTUNITIES");
		Utility.captureScreenShot(driver);
		System.out.println("LOG: INFO- Validated Talent Aquisition Header");
		Utility.waitForWebelement(driver, LocDropdown).click();
		Utility.waitForWebelement(driver, UKButton).click();
		Utility.validatePartialText(UKLocation1, "London and Hybrid UK");
		Utility.validatePartialText(UKLocation2, "London and Hybrid UK");
		Utility.validatePartialText(UKLocation3, "London and Hybrid UK");
		Utility.validatePartialText(UKLocation4, "London and Hybrid UK");
		Utility.validatePartialText(UKLocation5, "London and Hybrid UK");
		Utility.validatePartialText(UKLocation6, "London and Hybrid UK");
		System.out.println("LOG: INFO- Validated all UK positions");
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, LocDropdown).click();
		Utility.waitForWebelement(driver, USButton).click();
		Utility.validatePartialText(USLocation1, "New York and Hybrid US");
		Utility.validatePartialText(USLocation2, "New York and Hybrid US");
		Utility.validatePartialText(USLocation3, "New York and Hybrid US");
		System.out.println("LOG: INFO- Validated all US positions");
	}
	
	public void ValidateTalentTransitionPage()
	{
		Utility.waitForWebelement(driver, LearnMButton).click();
		System.out.println("LOG: INFO- Navigating to Talent Transition Page");
		Utility.validatePartialText(JobPageHeaderJS, "Join Us. Be You");
		System.out.println("LOG: INFO- Validated 'Join Us. Be You. header in Transition Page");
		Utility.validatePartialText(JobHeaderWYD, "What You’ll Do");
		System.out.println("LOG: INFO- Validated 'What You'll Do' header in Transition page");
		Utility.validatePartialText(JobHeaderWYB, "What You’ll Bring");
		System.out.println("LOG: INFO- Validated 'What You'll Bring' header in Transition page");
		Utility.validatePartialText(JobHeaderWL, "Work Location");
		System.out.println("LOG: INFO- Validated 'Work Location' header in Transition page");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 3000);");
		Utility.captureScreenShot(driver);
		System.out.println("LOG: INFO- Validated 'Role Details' header in Transition page");
		Utility.waitForWebelement(driver, ApplyButton).click();
		System.out.println("Transitioned to Application Page");
		
	}
	
	public void ValidateTalentApplication() throws InterruptedException
	{
		Utility.validateMessage(TAppHeader, "APPLICANT DETAILS");
		System.out.println("LOG: INFO- Header for application verified");
		Utility.validateMessage(FN, "First Name");
		Utility.waitForWebelement(driver, FNTbox).sendKeys("M");
		System.out.println("LOG: INFO - First Name Feild Verified and Validated");
		Utility.validateMessage(LN, "Last Name");
		Utility.waitForWebelement(driver, LNTbox).sendKeys("Khan");
		System.out.println("LOG: INFO- Last Name Feild Validated");
		Utility.validateMessage(EA, "Email Address");
		Utility.waitForWebelement(driver, EATbox).sendKeys("97mhkhan@gmail.com");
		System.out.println("LOG: INFO- Email Feild Validated");
		Utility.validateMessage(Country, "Country");
		Utility.waitForWebelement(driver, CDropdown).sendKeys("United States");
		System.out.println("LOG: INFO- Country Dropdown Validated");
		Utility.validatePartialText(PN, "Phone");
		Utility.waitForWebelement(driver, PNTbox).sendKeys("3233442435");
		System.out.println("LOG: INFO- Validated Phone feild");
		Utility.validatePartialText(City, "City");
		Utility.waitForWebelement(driver, CTbox).sendKeys("Queens");
		System.out.println("LOG: INFO- Validated City feild");
		Utility.validatePartialText(Address, "Address");
		Utility.waitForWebelement(driver, ATbox).sendKeys("728 Jamaica Ave.");
		System.out.println("LOG: INFO- Validated Address feild");
		Utility.validatePartialText(State, "County / State");
		Utility.waitForWebelement(driver, STbox).sendKeys("NY");
		System.out.println("LOG: INFO- Validated State feild");
		Utility.validatePartialText(Zip, "Postcode / ZIP");
		Utility.waitForWebelement(driver, ZTbox).sendKeys("11324");
		System.out.println("LOG: INFO- Validated ZIP code feild");
		Utility.validatePartialText(CV, "Upload your CV / Resume");
		Utility.waitForWebelement(driver, CVDropbox).isDisplayed();
		Utility.captureScreenShot(driver);
		System.out.println("LOG: INFO- Validated CV/Resume Section");
		Utility.validatePartialText(ShareInfo, "A cover letter or any further information you’d like to share?");
		Utility.waitForWebelement(driver, SITbox).sendKeys("Very Exceptional");
		System.out.println("LOG: INFO- Validated Share more info Feild");
		Utility.waitForWebelement(driver, SubmitButton).click();
		Thread.sleep(1000);
		Utility.validateMessage(SuccessText, "Thank you for your interest in the opportunities at The Bank of London – we will be in touch soon – we look forward to hearing your story");
		
		
		
		
		
	}
	
	
}
