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
	@Test(priority =1)
	public void contactTest() throws Exception
	{
		AsceContactUsForm acfm =new AsceContactUsForm(driver);
		acfm.navigateToContactForm();
		acfm.contactFormData();
	}
	
	@Test(priority =2)
	public void negativeCase1() throws Exception
	{
//		AsceContactUsForm ac =new AsceContactUsForm(driver);
//		ac.negCaseBlank();
		
		
	}
	@Test(priority =3)
	public void invalidDatas() throws Exception
	{
//		AsceContactUsForm ac =new AsceContactUsForm(driver);
//		ac.invalidData();
		
	}




}



