package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Allure;

public class AsceContactUsPage 
{

	public WebDriver driver;
	SoftAssert softAssert =new SoftAssert();
	

	public  AsceContactUsPage(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	
	By contactFormBtn = By.xpath("//*[@id=\"header-navbar\"]/div/div/div[2]/div[2]/nav/ul/li[7]/a");
	By cookie = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll");
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By companyName= By.name("company");
	By phoneBtn = By.cssSelector("input[value='Phone']");
	//*[@id="phone"]
	By phoneNumber = By.id("phonenumber");
	By email = By.id("emailaddress");
	By howfindDrop = By.id("how_did_you_find_us_");
	By message = By.name("message");
	By legalConcent = By.xpath("//input[@id='legal_consent']");
	By submitBtn = By.cssSelector("button.hs-button");
	By contactVerify = By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/h2");
	
	public void navigateToContactForm()
	{
		driver.findElement(contactFormBtn).click();
		Allure.step("Clicked on contact form button to navigate to contact form");
		driver.findElement(cookie).click(); 
		Allure.step("Clicked on cookie button");
		
		String ActnmTxt =driver.getCurrentUrl();
		String ExpnmTxt = "https://ascensor.stage.ascensor.co.uk/contact";
		softAssert.assertEquals(ActnmTxt, ExpnmTxt, "URL Mismatched");
		
		softAssert.assertAll();
		
	}
	public void contactFormData() throws Exception
	{
		//first name
		driver.findElement(firstName).sendKeys("Francis"); 
		Allure.step("Entered first name");
		
		//lastname     
		//driver.findElement(By.cssSelector("#lastname-47779a75-0b74-4a23-9332-dfaaaa6a413e")).sendKeys("fs");    
		driver.findElement(lastName).sendKeys("Francis");
		Allure.step("Entered last name");
		//Entered lastname     
		Thread.sleep(3000);//wait for 3s    
		driver.findElement(lastName).clear();//clear the entered last          
		Allure.step("Last name is cleared");
		driver.findElement(lastName).sendKeys("Michale");
		Allure.step("Last name is entered");
		
		//tag and class      
		//companyname      
		driver.findElement(companyName).sendKeys("Frncis company ltd");
		Allure.step("Company name is entered");
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js1.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(4000);
		
		//phone no      
		//driver.findElement(By.cssSelector("input[value='Phone']")).click();
		  WebElement l=driver.findElement(phoneBtn); 
		  l.click();
		
		//select radio button with click()          
		driver.findElement(phoneNumber).sendKeys("01100000000"); 
		Allure.step("Phone number is entered");
		
		driver.findElement(email).sendKeys("sit12@ascensor.com");
		Allure.step("Email is entered");
		 
		WebElement dropdown =driver.findElement(howfindDrop);
		Select selectobject=new Select(dropdown);
		selectobject.selectByValue("Networking");
		
		//message    
		driver.findElement(message).sendKeys("Would like to connect with for further action to improve our business");
		Allure.step("Message is entered");
		
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		js2.executeScript("window.scrollBy(0,400)"); 
		Thread.sleep(2000);
		//input[@id='legal_consent']
		driver.findElement(legalConcent).click();
		Allure.step("Clicked on legal concent checkbox");
		
        driver.findElement(submitBtn).click();
        Allure.step("Submit button is clicked");
		Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,-800)"); 
		
//		
		String ActnmTxt =driver.findElement(contactVerify).getText();
		String ExpnmTxt = "We'll get back to you as soon as possible.";
		softAssert.assertEquals(ActnmTxt, ExpnmTxt, "Contact form sumbit message mismatched");
		
		softAssert.assertAll();
		
	}
	public void negCaseBlank() throws Exception
	{
		driver.findElement(contactFormBtn).click();
		 Allure.step("Contact form button is clicked");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js1.executeScript("window.scrollBy(0,500)"); 
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		js2.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		driver.findElement(submitBtn).click();
		 Allure.step("Submit button is clicked");
		Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,-800)"); 
	}
	
	public void invalidData() throws Exception
	{
//		driver.findElement(cookie).click(); 
		driver.findElement(contactFormBtn).click();
		 Allure.step("Contact form button is clicked");
		
		driver.findElement(firstName).sendKeys("fsdf45454rgfgg!@3_==+"); 
		 Allure.step("Invalid first name is entered");
		//lastname     
		//driver.findElement(By.cssSelector("#lastname-47779a75-0b74-4a23-9332-dfaaaa6a413e")).sendKeys("fs");    
		driver.findElement(lastName).sendKeys(")(*&^%$#45678908ughfgv");
		 Allure.step("Invalid first name is entered");
		
		//companyname      
				driver.findElement(companyName).sendKeys("09*&^%UjHGYTHoigf$%Y");
				Allure.step("Invalid company name is entered");
				
				
				Thread.sleep(3000);
//				JavascriptExecutor js1 = (JavascriptExecutor) driver; 
//				js1.executeScript("window.scrollBy(0,500)"); 
//				Thread.sleep(4000);
				
				  WebElement l=driver.findElement(phoneBtn); 
				  l.click();
				  
				  Allure.step("Clicked on phone number selection button");
				
				//select radio button with click()          
				driver.findElement(phoneNumber).sendKeys("jghfhffhfhfdt"); 
				 Allure.step("Invalid phone number is entered");
				
				driver.findElement(email).sendKeys("iuyfytd6r(^%$");
				 Allure.step("Invalid email id is entered");
				 
				WebElement dropdown =driver.findElement(howfindDrop);
				Select selectobject=new Select(dropdown);
				selectobject.selectByValue("Networking");
				
				//message    
				driver.findElement(message).sendKeys("fgxtffgghTR*^&^&$#@%574635244364rfghjvoupoy896r6e^F");
				Allure.step("Invalid message is entered");
				
				Thread.sleep(5000);
				JavascriptExecutor js2 = (JavascriptExecutor) driver; 
				js2.executeScript("window.scrollBy(0,400)"); 
				Thread.sleep(2000);
				//input[@id='legal_consent']
				driver.findElement(legalConcent).click();
				Allure.step("Legal concent button is clicked");
				
		        driver.findElement(submitBtn).click();
		        Allure.step("Submit button is entered");
				Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver; 
				js.executeScript("window.scrollBy(0,-800)");
		
	}

	
}
