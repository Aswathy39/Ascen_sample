package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AsceScheduleCallPage 
{
	public WebDriver driver;
	SoftAssert softAssert =new SoftAssert();
	

	public  AsceScheduleCallPage(WebDriver driver)
	{
		this.driver=driver; 
	}
	By cookie =By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll\"]");
	By SchCallBtn = By.id("hubspot_schedule_trigger");
	By dateSel = By.linkText("11");
	
	public void goToscheduleCall()
	{
		driver.findElement(cookie).click();
		
		//verifying page url
		String ActUrlTxt =driver.getCurrentUrl();
		String ExpUrlTxt = "https://ascensor.stage.ascensor.co.uk/";
		softAssert.assertEquals(ActUrlTxt, ExpUrlTxt, "URL Mismatched");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js1.executeScript("window.scrollBy(0,10200)"); 
		
	}
	public void scheduleCall() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(SchCallBtn).click();
		//to switch controller to scheduler
		Thread.sleep(2000);
		driver.switchTo().frame(4);
		Thread.sleep(6000);
	    driver.findElement(dateSel).click();
//	    driver.findElement(By.cssSelector(".private-selectable-box--hovered")).click();
		
	}

}
