package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AsceContactUsForm 
{

	public WebDriver driver;
	

	public  AsceContactUsForm(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	
	By contactFormBtn = By.xpath("//*[@id=\"header-navbar\"]/div/div/div[2]/div[2]/nav/ul/li[7]/a");
	By cookie = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll");
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By companyName= By.name("company");
	By phoneBtn = By.cssSelector("input[value='Phone']");
	By phoneNumber = By.id("phonenumber");
	By email = By.id("emailaddress");
	By howfindDrop = By.id("how_did_you_find_us_");
	By message = By.name("message");
	By legalConcent = By.xpath("//input[@id='legal_consent']");
	By submitBtn = By.cssSelector("button.hs-button");
	
	
	public void navigateToContactForm()
	{
		driver.findElement(contactFormBtn).click();
		
		driver.findElement(cookie).click(); 
	}
	public void contactFormData() throws Exception
	{
		//first name
		driver.findElement(firstName).sendKeys("Francis"); 
		
		//lastname     
		//driver.findElement(By.cssSelector("#lastname-47779a75-0b74-4a23-9332-dfaaaa6a413e")).sendKeys("fs");    
		driver.findElement(lastName).sendKeys("Francis");
		//Entered lastname     
		Thread.sleep(3000);//wait for 3s    
		driver.findElement(lastName).clear();//clear the entered last          
		driver.findElement(lastName).sendKeys("Michale");
		
		//tag and class      
		//companyname      
		driver.findElement(companyName).sendKeys("Frncis company ltd");
		
		
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
		
		//driver.findElement(By.name("phone")).sendKeys("01100000000");
		
		driver.findElement(email).sendKeys("sit12@ascensor.com");
		 
		WebElement dropdown =driver.findElement(howfindDrop);
		Select selectobject=new Select(dropdown);
		selectobject.selectByValue("Networking");
		
		//message    
		driver.findElement(message).sendKeys("Would like to connect with for further action to improve our business");
		
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		js2.executeScript("window.scrollBy(0,400)"); 
		Thread.sleep(2000);
		//input[@id='legal_consent']
		driver.findElement(legalConcent).click();
		
        driver.findElement(submitBtn).click();
		Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,-800)"); 
		
		
	}
	public void negCaseBlank() throws Exception
	{
		driver.findElement(contactFormBtn).click();
//		driver.findElement(cookie).click(); 
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js1.executeScript("window.scrollBy(0,500)"); 
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		js2.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(5000);
		driver.findElement(submitBtn).click();
		
		Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,-800)"); 
	}
	
	public void invalidData() throws Exception
	{
		driver.findElement(contactFormBtn).click();
		
		driver.findElement(firstName).sendKeys("fsdf45454rgfgg!@3_==+"); 
		//lastname     
		//driver.findElement(By.cssSelector("#lastname-47779a75-0b74-4a23-9332-dfaaaa6a413e")).sendKeys("fs");    
		driver.findElement(lastName).sendKeys(")(*&^%$#45678908ughfgv");
		
		//companyname      
				driver.findElement(companyName).sendKeys("09*&^%UjHGYTHoigf$%Y");
				
				
				 Thread.sleep(3000);
				JavascriptExecutor js1 = (JavascriptExecutor) driver; 
				js1.executeScript("window.scrollBy(0,500)"); 
				Thread.sleep(4000);
				
				  WebElement l=driver.findElement(phoneBtn); 
				  l.click();
				
				//select radio button with click()          
				driver.findElement(phoneNumber).sendKeys("jghfhffhfhfdt"); 
				
				driver.findElement(email).sendKeys("iuyfytd6r(^%$");
				 
				WebElement dropdown =driver.findElement(howfindDrop);
				Select selectobject=new Select(dropdown);
				selectobject.selectByValue("Networking");
				
				//message    
				driver.findElement(message).sendKeys("fgxtffgghTR*^&^&$#@%574635244364rfghjvoupoy896r6e^F");
				
				Thread.sleep(5000);
				JavascriptExecutor js2 = (JavascriptExecutor) driver; 
				js2.executeScript("window.scrollBy(0,400)"); 
				Thread.sleep(2000);
				//input[@id='legal_consent']
				driver.findElement(legalConcent).click();
				
		        driver.findElement(submitBtn).click();
				Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver; 
				js.executeScript("window.scrollBy(0,-800)");
		
	}

	
}
