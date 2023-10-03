package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AsceCareerPhpPage;
import utilities.BaseClass;

public class AsceCareerPhpTest 
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
		AsceCareerPhpPage acf = new AsceCareerPhpPage(driver);
		acf.navigateTOCareerForm();
		acf.contactFormDetails();
	}
	@Test(priority=2)
	public void test2() throws Exception
	{
		AsceCareerPhpPage acf = new AsceCareerPhpPage(driver);
		acf.negativeInvalidValue();
	}
	@Test(priority=3)
	public void test3() throws Exception
	{
		AsceCareerPhpPage acf = new AsceCareerPhpPage(driver);
		acf.negativeNullValue();
		
	}

}
