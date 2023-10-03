package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AsceCareerHocsPage;
import utilities.BaseClass;

public class AsceCareerHocsTest 
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
		AsceCareerHocsPage acf = new AsceCareerHocsPage(driver);
		acf.navigateTOCareerForm();
		acf.contactFormDetails();
	}
	@Test(priority=2)
	public void test2() throws Exception
	{
		AsceCareerHocsPage acf = new AsceCareerHocsPage(driver);
		acf.negativeInvalidValue();
	}
	@Test(priority=3)
	public void test3() throws Exception
	{
		AsceCareerHocsPage acf = new AsceCareerHocsPage(driver);
		acf.negativeNullValue();
	}


}
