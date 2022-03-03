package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class VerifyNMPage {

	WebDriver driver;
	public VerifyNMPage(WebDriver Idriver) 
	{
		// TODO Auto-generated constructor stub
	 
   	this.driver=Idriver;
	}
	
	@FindBy(xpath= "//*[@id=\"__next\"]/div/header/div[2]/nav/ul/li[4]") WebElement NMLink;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[1]/div[1]") WebElement NMBanner;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div/div[2]/div") WebElement MediacContact;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[3]/section/div[1]/h1") WebElement BAHeader;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[3]/section/div[1]/p") WebElement BACaption;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[3]/section/div[1]/a/span") WebElement DownloadLP;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[3]/div/h2") WebElement CBioTitle;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[3]/div/a/button/span") WebElement PhotoPack;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div/div[1]/div[4]/div") WebElement PressR1;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[1]/div[1]/span") WebElement PressRelease;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div/p[7]") WebElement Enquiries;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div/p[16]/a") WebElement TBOLLink;
	
	public void ClickNewsMediaLink()
	{
		Utility.waitForWebelement(driver, NMLink).click();
		System.out.println("LOG: INFO- Verified News and Media link");
	}
	
	public void VerifyNMBanner() throws InterruptedException
	{
		Utility.waitForWebelement(driver, NMBanner).getText();
		System.out.println("LOG: INFO- Verified News and Media Banner");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 300);");
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
	}
	
	public void VerifyMediaContact()
	{
		Utility.validatePartialText(MediacContact, "MEDIA CONTACT");
		Utility.validatePartialText(MediacContact, "PRESS/MEDIA ENQUIRIES");
		Utility.validatePartialText(MediacContact, "PRESS@THEBANKOFLONDON.COM");
		Utility.validatePartialText(MediacContact, "FOLLOW US");
	}
	
	public void VerifyBrandAssets()
	{
		Utility.validatePartialText(BAHeader, "BRAND");
		Utility.validatePartialText(BAHeader, "ASSETS");
		Utility.validatePartialText(BACaption, "Download official ‘The Bank of London’ logos, badges and product screenshots.");
		Utility.validatePartialText(BACaption, "All ‘The Bank of London’, logos or other brand elements are subject to ‘The Bank of London’ Usage Agreement.");
		Utility.waitForWebelement(driver, DownloadLP).click();
		System.out.println("LOG: INFO- Validated Brand Assets text and Download Logo Pack");
		Utility.captureScreenShot(driver);
	}
	
	public void VerifyPhotoPack()
	{
		Utility.validatePartialText(CBioTitle, "FIND HIGH-RES HEADSHOTS OF THE BANK OF");
		Utility.validatePartialText(CBioTitle, "LONDON EXECUTIVE TEAM AND BOARD");
		Utility.waitForWebelement(driver, PhotoPack).click();
		Utility.captureScreenShot(driver);
	}
	
	public void NavToPressRelease()
	{
		Utility.waitForWebelement(driver, PressRelease).click();
		System.out.println("LOG: INFO- Navigating to Press Release");
		Utility.validatePartialText(Enquiries, "Enquiries: Powerscourt");
		Utility.waitForWebelement(driver, TBOLLink).click();
		Utility.verifyCurrentUrl(driver, "https://thebankoflondon.com/");
		
	}
	
	
}
