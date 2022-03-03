package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class VerifyImg {

	WebDriver driver;
	public VerifyImg (WebDriver Bdriver)

	{

		this.driver=Bdriver;
	}
	
	
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[2]/div[1]/section[1]/div[2]") WebElement AntImg;
	@FindBy(css= "#__next > div > main > div.modal-slideout_container__FK_7C > div.our-story_modalBody__FowWy > div.our-story_data__52Vf6 > div > div > div.our-story_content__2UuWb > p") WebElement FN;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[2]/div/div/div[3]/a") WebElement DP;
	@FindBy(css= "#__next > div > main > div.modal-slideout_container__FK_7C > div.modal-slideout_header__1IPmx > i > svg") WebElement ImgX;
	
	public void clickAnthonyImg() throws InterruptedException
	{
		Utility.waitForWebelement(driver, AntImg).click();
		System.out.println("LOG: INFO- Anothny's image has been selected, statement is shown");
		Utility.waitForWebelement(driver, FN);
		Thread.sleep(2000);
		Utility.captureScreenShot(driver);
		
	}
	
	public void verifyImgButtons()
	{
		
		Utility.waitForWebelement(driver, DP).click();
		System.out.println("LOG: INFO- Download photo link selected");
		Utility.captureScreenShot(driver);
		Utility.waitForWebelement(driver, ImgX).click();
		Utility.captureScreenShot(driver);
	}
}
