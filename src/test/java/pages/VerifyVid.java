package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class VerifyVid {

	WebDriver driver;
	public VerifyVid (WebDriver Ddriver)

	{

		this.driver=Ddriver;
	}

	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[1]/div[2]/button/span/span") WebElement vt;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[1]/div[1]/h2") WebElement vbTop;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[1]/div[2]/button/span") WebElement pb;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[4]/div/button[1]") WebElement  pbim;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[4]/div/div/button[2]") WebElement sb;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[4]/div/button[3]") WebElement ccb;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[4]/div/button[4]") WebElement cvb;
    @FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[4]/video") WebElement vFS;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/section[4]/hr") WebElement vtp;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;
//	@FindBy(xpath= "") WebElement  ;

	public void validateVideoText()
	{
		Utility.validatePartialText(vt, "THE BANK OF LONDON STORY");
		System.out.println("LOG: INFO- Validated video title on 'Who We Are' page");
		Utility.validatePartialText(vbTop, "HOW WE'RE DISRUPTING");
		System.out.println("LOG: INFO- Headertop validated");
		
	}
	
	public void ss()
	{
		Utility.captureScreenShot(driver);
	}
	
	public void pressPlay()
	{
		Utility.waitForWebelement(driver, pb).click();
		System.out.println("LOG: INFO- Video is playing");
	}
	
	public void vidInMotion() throws InterruptedException
	
	{
		Utility.waitForWebelement(driver, vtp).click();
		System.out.println("LOG: INFO- Top of video selected icons now showing");
		Utility.waitForWebelement(driver, sb).click();
		System.out.println("LOG: INFO- Sound has been muted on video");
		Utility.waitForWebelement(driver, ccb).click();
		System.out.println("LOG: INFO- Closed captions are on the video");
		Thread.sleep(5000);
		Utility.waitForWebelement(driver, vtp).click();
		System.out.println("LOG: INFO- Top of video selected icons now showing");
		Utility.waitForWebelement(driver, pbim).click();
		System.out.println("LOG: INFO- Pause Button clicked");
	}
	
	public void vss()
	{
		Utility.captureScreenShot(driver);
		System.out.println("LOG: INFO- Screenshot of video captured");
		Utility.waitForWebelement(driver, cvb).click();
		Utility.captureScreenShot(driver);
	}
	
	
	
	

}

