package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AsceScheduleCallPage;
import utilities.BaseClass;

public class AsceScheduleCallTest
{
public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		BaseClass bs =new BaseClass();
		driver=bs.initialize_driver();
		driver.get("https://ascensor.stage.ascensor.co.uk/");
	}
	@Test(priority=1)
	public void test1() throws Exception
	{
		AsceScheduleCallPage ascp =new AsceScheduleCallPage(driver);
		ascp.goToscheduleCall();
		ascp.scheduleCall();
		
	}

}
