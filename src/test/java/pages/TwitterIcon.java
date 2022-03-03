package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class TwitterIcon {
	
	WebDriver driver;
	public TwitterIcon(WebDriver Cdriver)

	{

		this.driver=Cdriver;
	}
	@FindBy(xpath="//*[@id=\"__next\"]/div/footer/div/ul/li[1]/span/a/span/i")WebElement TLink;
	@FindBy(xpath="//*[@id=\"__next\"]/div/footer/div/ul/li[1]/span[2]/span[1]/span/span[1]/span[1]")WebElement TPExitH;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/footer/div/ul/li[1]/span[2]/span[1]/span/span[1]/span[2]")WebElement TPExitH2;
	@FindBy(xpath= "//*[@id=\"__next\"]/div/footer/div/ul/li[1]/span[2]/span[1]/span/span[2]") WebElement TPExitBody;
	@FindBy(xpath="//*[@id=\"__next\"]/div/footer/div/ul/li[1]/span[2]/span[1]/span/span[3]/a")WebElement TPButton;
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div/div[2]/div/h2/div/div/div/span[1]/span/span") WebElement TBHeader;
	@FindBy(xpath= "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/nav/div/div[2]/div/div[1]/a/div") WebElement Tweets;
	
	
	
	public void TwitterLink()
	{
		
		Utility.waitForWebelement(driver, TLink).click();
		System.out.println("LOG: INFO- Twitter Link selected");
	}
	
	public void TwitterExitPage()
	{
		Utility.validatePartialText(TPExitH, "YOU’RE NOW LEAVING");
		Utility.validateMessage(TPExitH2, "THE BANK OF LONDON");
		System.out.println("LOG: INFO- Exit Header Verified");
		
		Utility.validateMessage(TPExitBody, "The Bank of London’s website and/or mobile terms, privacy and security policies don't apply to the site or app you're about to visit. Please review its terms, privacy and security policies to see how they apply to you. The Bank of London isn't responsible for and doesn't provide any products, services or content at this third-party site or app, except for products and services that explicitly carry the The Bank of London name.");
		System.out.println("LOG: INFO- Exit message verified");
	}
	
	public void TwitterProceed()
	{
		Utility.waitForWebelement(driver, TPButton).click();
		System.out.println("LOG: INFO- Proceeding to twitter landing page");
		Utility.captureScreenShot(driver);
		
		
	}
	
	public void validateTwitterPage()
	{
		
		String baseWindowHandle = driver.getWindowHandle();
		for(String twitterWindow : driver.getWindowHandles()) {
			driver.switchTo().window(twitterWindow);
		}
		Utility.waitForWebelement(driver, Tweets);
		Utility.captureScreenShot(driver);
		System.out.println("LOG: INFO- twitter page window selected");
		Utility.verifyCurrentUrl(driver, "https://twitter.com/thebankoflondon");
		System.out.println("LOG: INFO- Twitter page verified");
		
		driver.close();
		driver.switchTo().window(baseWindowHandle);
		Utility.captureScreenShot(driver);
	}
}
