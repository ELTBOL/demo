package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class FSCSLinks {
	
	WebDriver driver;
	public FSCSLinks(WebDriver Edriver)

	{

		this.driver=Edriver;
		
	}
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[1]/h1[1]")WebElement BannerH1;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[1]/h1[2]")WebElement BannerH2;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[1]/p[1]")WebElement Body1;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[1]/p[2]")WebElement Body2;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[2]/div/div[2]/ul/li[1]")WebElement FSCSWL;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[2]/div/div[2]/ul/li[2]")WebElement FactSheet;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[2]/div/div[2]/ul/li[3]")WebElement Leaflet;
	@FindBy(xpath="//*[@id=\"__next\"]/div/section/div[2]/div/div[2]/ul/li[1]/span[2]/span[1]/span/span[3]/a")WebElement ProceedButton;
	@FindBy(xpath="//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")WebElement FSCSCookies;
	//@FindBy(xpath="")WebElement ;
	
	
	public void ValidateFSCSBanner()
	{
		Utility.validateMessage(BannerH1, "FSCS PROTECTED");
		System.out.println("LOG: INFO- Top Half of FSCS Banner has been validated");
		Utility.validateMessage(BannerH2, "FOR YOUR PEACE OF MIND");
		System.out.println("LOG: INFO- Bottom Half of FSCS Banner has been validated");
		//Utility.captureScreenShot(driver);
	}
	
	public void ValidateFSCSBody()
	{
		Utility.validatePartialText(Body1, "The Financial Services Compensation Scheme (FSCS) is the United Kingdom’s independent deposit guarantee scheme, and it protects some of your deposits with authorised banks like ours.");
		System.out.println("LOG: INFO- Top Half of FSCS Body verified");
		Utility.validatePartialText(Body2, "For more information about your protection at The Bank of London, please read our downloadable FSCS fact sheet.");
		System.out.println("LOG: INFO- Bottom Half of FSCS Body verified");
		Utility.captureScreenShot(driver);
	}
	
	public void ValidateFSCSLink() throws InterruptedException
	{

		String baseWindowHandle = driver.getWindowHandle();
		Utility.waitForWebelement(driver, FSCSWL).click();
		System.out.println("LOG: INFO- FSCS web link selected");
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, ProceedButton).click();
		for(String FSCSPage : driver.getWindowHandles())
		
		{
			driver.switchTo().window(FSCSPage);
		}
		System.out.println("LOG: INFO- Validate TBOL leaving page");
		Utility.verifyCurrentUrl(driver, "https://www.fscs.org.uk/");
		System.out.println("LOG: INFO- Validated FSCS page");
		Utility.waitForWebelement(driver, FSCSCookies).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		driver.switchTo().window(baseWindowHandle);
		
	}
	
	public void ValidateFactsSheet() throws InterruptedException
	{
		String baseWindowHandle = driver.getWindowHandle();
		Utility.waitForWebelement(driver, FactSheet).click();
		
		System.out.println("LOG: INFO- Verfied Facts Sheet");
		for(String FactsSheetPage : driver.getWindowHandles())
		{
			driver.switchTo().window(FactsSheetPage);
			Thread.sleep(1000);
			Utility.captureScreenShot(driver);
		}
		Utility.verifyCurrentUrl(driver, "https://thebankoflondon.com/pdf/TBOL%20FSCS%20Fact%20Sheet.pdf");
		driver.switchTo().window(baseWindowHandle);
	}
	
	public void ValidateLeaflet() throws InterruptedException
	{
		String baseWindowHandle = driver.getWindowHandle();
		Utility.waitForWebelement(driver, Leaflet).click();
		for(String FactsSheetPage : driver.getWindowHandles())
		{
			driver.switchTo().window(FactsSheetPage);
			Thread.sleep(1000);
			Utility.captureScreenShot(driver);
		}
		Utility.verifyCurrentUrl(driver, "https://thebankoflondon.com/pdf/TBOL%20FSCS%20Fact%20Sheet.pdf");
		Utility.captureScreenShot(driver);
		driver.switchTo().window(baseWindowHandle);
		
	}

}
