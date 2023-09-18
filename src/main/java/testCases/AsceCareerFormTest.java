package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AsceCareerForm;
import utilities.BaseClass;

public class AsceCareerFormTest 
{
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		BaseClass bs =new BaseClass();
		driver=bs.initialize_driver();
		driver.get("https://ascensor.stage.ascensor.co.uk/");
	}
	@Test
	public void test1() throws Exception
	{
		AsceCareerForm acf = new AsceCareerForm();
		acf.navigateTOCareerForm();
	}
	

}
