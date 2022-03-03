package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class VerifyGraphicImg {

	WebDriver driver;
	public VerifyGraphicImg(WebDriver Fdriver) 
	{
		// TODO Auto-generated constructor stub
	 
   	this.driver=Fdriver;
	}
	
	@FindBy(xpath= "//*[@id=\"__next\"]/div/header/div[2]/nav/ul/li[2]") WebElement WWDLink;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section/div[1]/h2") WebElement VidBanner;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[2]/div/h2") WebElement GImgHeader;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[2]/div/p") WebElement GImgBody;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[3]") WebElement GImg;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[3]/div/button") WebElement ExploreButton;
	
	public void ClickWWDLink()
	{
		Utility.waitForWebelement(driver, WWDLink).click();
		System.out.println("LOG:INFO- Navigated to What We Do Landing Page");
		Utility.validatePartialText(VidBanner, "A NEW DYNAMIC");
		Utility.validatePartialText(VidBanner, "IN BANKING");
		System.out.println("LOG: INFO- Validated Video Banner");
		Utility.captureScreenShot(driver);
	}
	
	public void ValidateGraphicImg1() throws InterruptedException
	{
		Utility.waitForWebelement(driver, GImg).click();
		Utility.validatePartialText(GImgHeader, "GLOBAL CLEARING");
		Utility.validatePartialText(GImgHeader, "PAYMENTS");
		Utility.validatePartialText(GImgHeader, "SETTLEMENT");
		System.out.println("LOG: INFO- Verified Header in 1st Graphic Image");
		Utility.validateMessage(GImgBody, "Principal risk factors across payments, clearing, liquidity and settlement are addressed in-country, in-region and cross-border allowing, for the first time, continuous transfer, with near-instant irrevocable settlement, and the immediate availability of funds disbursement: 24/7, 365 days a year.");
		System.out.println("LOG: INFO- Graphic Image 1 text body Validated");
		Thread.sleep(1000);
		
		Utility.waitForWebelement(driver, ExploreButton).click();
		Utility.captureScreenShot(driver);
	}
	
	public void ValidateGraphicImg2() throws InterruptedException
	{
		Thread.sleep(3000);
		
		Utility.validatePartialText(GImgHeader, "GLOBAL");
		Utility.validatePartialText(GImgHeader, "TRANSACTION");
		Utility.validatePartialText(GImgHeader, "BANKING");
		System.out.println("LOG: INFO- Verified Header in 2nd Graphic Image");
		Utility.validateMessage(GImgBody, "Domestic and international transaction banking are transformed by next-generation technologies and innovations. These include leading-edge global cash management, foreign exchange, treasury, liquidity, and related services that for the first time are free from intermediary risk, unnecessary cost, and complexity.");
		System.out.println("LOG: INFO- Graphic Image 2 text body Validated");
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, ExploreButton).click();
		Utility.captureScreenShot(driver);
		
	}
	
	public void ValidateGraphicImg3() throws InterruptedException
	{
		Thread.sleep(3000);
		
		Utility.validatePartialText(GImgHeader, "PREMIER");
		Utility.validatePartialText(GImgHeader, "BUSINESS");
		Utility.validatePartialText(GImgHeader, "BANKING");
		
		System.out.println("LOG: INFO- Verified Header in 3Rd Graphic Image");
		
		Utility.validateMessage(GImgBody, "The Bank of London addresses inherent structural failures of the business banking sector by deploying powerfully simple, yet premium corporate banking products and services to support businesses of all types, from SMEs to multi-national organisations and from start-up fintechs to household names across the UK.");
		System.out.println("LOG: INFO- Graphic Image 3 text body Validated");
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, ExploreButton).click();
		Utility.captureScreenShot(driver);
	}
	
	public void ValidateGraphicImg4() throws InterruptedException
	{
		Thread.sleep(3000);
		
		Utility.validatePartialText(GImgHeader, "BANKING");
		Utility.validatePartialText(GImgHeader, "AS-A-SERVICE");
		System.out.println("LOG: INFO- Verified Header in 4th Graphic Image");
		Utility.validateMessage(GImgBody, "The Bank of London is rewriting the rulebook of the legacy ‘platform-as-a-service’ and Agency bank models of old. Our TBOL-as-a-Service approach effortlessly powers any company, brand, or non-bank firm to provide end-to-end bank products and services, in full regulatory compliance, without becoming a bank.");
		System.out.println("LOG: INFO- Graphic Image 4 text body Validated");
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, ExploreButton).click();
		Utility.captureScreenShot(driver);
		
	}
	
	public void ValidateGraphicImgR() throws InterruptedException
	{
		Utility.waitForWebelement(driver, GImg).click();
		Utility.validatePartialText(GImgHeader, "GLOBAL CLEARING");
		Utility.validatePartialText(GImgHeader, "PAYMENTS");
		Utility.validatePartialText(GImgHeader, "SETTLEMENT");
		System.out.println("LOG: INFO- Verified Header in 1st Graphic Image");
		Utility.validateMessage(GImgBody, "Principal risk factors across payments, clearing, liquidity and settlement are addressed in-country, in-region and cross-border allowing, for the first time, continuous transfer, with near-instant irrevocable settlement, and the immediate availability of funds disbursement: 24/7, 365 days a year.");
		System.out.println("LOG: INFO- Graphic Image 1 text body Validated");
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
	}
	
}
