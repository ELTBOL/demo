package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class VerifyJoinUs {

	WebDriver driver;
	public VerifyJoinUs(WebDriver Hdriver) 
	{
		// TODO Auto-generated constructor stub
	 
   	this.driver=Hdriver;
	}
	
	@FindBy(xpath= "//*[@id=\"__next\"]/div/header/div[2]/nav/ul/li[3]") WebElement JSLink;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[1]/div[1]") WebElement VidBanner1;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/section[1]/div/div/div[1]/div[1]/div/button[2]/span") WebElement OpenLNavButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/section[1]/div/div/div[1]/button/span") WebElement OpenLButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[2]/div/div[1]/h4") WebElement OLN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[2]/div/div[3]") WebElement LetterBody;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[1]/i") WebElement XButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/article/section/div[1]/h4") WebElement CVTitle;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/article/section/ul/li[2]") WebElement CV2;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/article/div/span[2]") WebElement CVNextButton;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/article/div/div[1]") WebElement CVBodyHeader;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div/article/div/div[2]/p") WebElement CVBodyText;
	
	public void VerifyJoinUsHeader() throws InterruptedException
	{
		Utility.waitForWebelement(driver, JSLink).click();
		Thread.sleep(2000);
		System.out.println("LOG: INFO- Navigating to Join Us Page");
		Utility.validatePartialText(VidBanner1, "SEEKING EXCEPTIONAL");
		Utility.validatePartialText(VidBanner1, "WITHOUT EXCEPTION");
		System.out.println("LOG: INFO- Validated Video Banner");
		Utility.captureScreenShot(driver);
	}
	
	public void ValidateOpenLetters() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 600);");
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, OpenLNavButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, OpenLNavButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, OpenLNavButton).click();
		System.out.println("LOG: INFO- Validated Navigation through Open Letters Carousel");
		Utility.waitForWebelement(driver, OpenLButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.validatePartialText(OLN, "ANTHONY");
		Utility.validatePartialText(OLN, "WATSON");
		Utility.validatePartialText(LetterBody, "Our ‘maxims’");
		Utility.validatePartialText(LetterBody, "define who we are when we operate at our best; they are the oxygen in our culture, they cement the connection of trust and belonging between us all. They’re a part of everything we create here, including careers. As such, they are the primary prism through which we gauge if our culture is the right place for you to excel.");
		Utility.validatePartialText(LetterBody, "Whilst our ambitions are bold; we’re still tiny relative to the opportunity. We have an astonishing amount of work ahead. As both a regulated bank");
		Utility.validatePartialText(LetterBody, "a technology company we need to think different than others. We need to invent a mode of working that marries the intensity of a start-up whilst sustaining careers and that builds for long-term success.");
		Utility.validatePartialText(LetterBody, "To power the economic infrastructure of the future we seek out exceptional people who are diverse, innovative, and inclusive forward thinkers with a bias for action – those who push boundaries.");
		Utility.validatePartialText(LetterBody, "Often, exceptional people don’t see themselves that way. A lot of times, they see themselves as just being different. So, we tend to take a different approach to hiring. As we seek heterogeneous perspectives, we don’t rely too much on traditional profiling against laden job specs. Aside from being abysmal predictors of future success, they’re anti-talent and anti-diversity.");
		Utility.validatePartialText(LetterBody, "you went to university; we'd rather learn how you want to grow next, and we’ll probably be less interested in what you built previously than what you want to create next.");
		Utility.validatePartialText(LetterBody, "So, to those different exceptional people, those round pegs in square holes, those unconstrained by convention, those rigorous thinkers who know that things worth doing are rarely simple, and those who can think forward with visions of futures yet to be realised. Welcome to The Bank of London.");
		Utility.validatePartialText(LetterBody, "Join us. Be you.");
		Utility.validatePartialText(LetterBody, "Anthony");
		System.out.println("LOG: INFO- Validated Opening Letter");
		Utility.waitForWebelement(driver, XButton).click();
	}
	
	public void ValidateCoreValues() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1260);");
		Thread.sleep(1000);
		Utility.validatePartialText(CVTitle, "OUR");
		Utility.validatePartialText(CVTitle, "CORE VALUES");
		Utility.validatePartialText(CVTitle, " DEFINE WHO WE ARE WHEN WE OPERATE AT OUR BEST");
		Utility.captureScreenShot(driver);
		System.out.println("LOG: INFO- Validated Title for 'Core Values'");
		Utility.waitForWebelement(driver, CV2).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, CVNextButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, CVNextButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, CVNextButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, CVNextButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, CVNextButton).click();
		Thread.sleep(1000);
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, CVNextButton).click();
		Thread.sleep(1000);
		Utility.validatePartialText(CVBodyHeader, "WE`RE");
		Utility.validatePartialText(CVBodyHeader, "EXCEPTIONAL");
		Utility.validatePartialText(CVBodyHeader, "WITHOUT");
		Utility.validatePartialText(CVBodyHeader, "EXCEPTION");
		Utility.validateMessage(CVBodyText, "We are akin to a championship sports team. We hire, develop, advance and retain only exceptional individuals and place them in the right spots to excel. We define exceptional people as those unconstrained by convention, possess a think forward mindset, hold a bias for action, and can self-direct to deliver complex outcomes with agility, speed, accuracy and excellence. As such, we acknowledge our culture will not be the right choice for everyone.");
		
	}
	
}
