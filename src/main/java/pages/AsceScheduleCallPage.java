package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	By dateSel = By.xpath("/html/body/div[3]/div[1]/div/div/div/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[4]/button/span");
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
//	    driver.findElement(dateSel).click();
//	    driver.findElement(By.cssSelector(".private-selectable-box--hovered")).click();
		selectDateFromCal();
	    
	    
		
	}
	public void selectDateFromCal()
	{
		WebElement table = driver.findElement(By.xpath("//table[@class='DatePicker__StyledTable-sc-1teprn1-0 qSkyQ']"));
		String headerName = "Wed"; 

		int columnIndex = -1; // initialize column index to -1
		
		 List<WebElement> headerCells = table.findElements(By.tagName("th")); // get all the header cells

		for (int i = 0; i < headerCells.size(); i++)
		{

			if (headerName.equals(headerCells.get(i).getText())) {

				columnIndex = i; // update the column index when header name matches
				//System.out.println(" \n Number of coloumn : "+columnIndex);
				break; // exit the loop once the header name is found

			}

		}
		for(int j=0;j<=columnIndex;j++)
		{
			driver.findElement(dateSel).click();
		}
		
//			String actText = driver.findElement(prodFindCat).getText();
//			String exptText = "Category : Air Ionizers";
//			softAssert.assertEquals(actText, exptText, "Field Data Mismatched");
//			Allure.step("Verified product search by category ");
//		}

	}

}
