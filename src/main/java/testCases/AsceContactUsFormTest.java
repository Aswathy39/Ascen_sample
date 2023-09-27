package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AsceContactUsForm;
import utilities.BaseClass;

public class AsceContactUsFormTest 
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
	public void contactTest() throws Exception
	{
		AsceContactUsForm acfm =new AsceContactUsForm(driver);
		acfm.navigateToContactForm();
		acfm.contactFormData();
	}




}



