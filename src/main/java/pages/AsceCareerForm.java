package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AsceCareerForm 

{
	public WebDriver driver;
	

	public  AsceCareerForm(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	By cookie =By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll\"]");
	By careerPage = By.xpath("//*[@id=\"header-navbar\"]/div/div/div[2]/div[2]/nav/ul/li[3]/a");
	By phpDevLeadsPage = By.xpath("//a[contains(@href, 'https://ascensor.stage.ascensor.co.uk/careers/laravel-php-developer-leeds')]");
	By fstnm= By.name("firstname");
	By lstnm = By.name("lastname");
	By about = By.xpath("//textarea[@id=\"about\"]");
	By portfolio = By.xpath("//*[@id=\"portfolio\"]");
	By email = By.xpath("//input[@id='email']");
	By phn = By.xpath("//input[@id='phone']");
	By cookieNew = By.xpath("//*[@id=\"top\"]/div[3]/a");
	By CvUploadBtn = By.xpath("//*[@id=\"cv\"]");
	By submitBtn = By.xpath("//*[@id=\"top\"]/div[2]/div[2]/div/div/div/div/form/div[8]/button");
	
	public void navigateTOCareerForm() throws Exception
	{
		
		Thread.sleep(2000);
		//allow cookies    
		
		  driver.findElement(cookie).click();
				  //wait for 3 seconds and click career page
				  

		  Thread.sleep(3000);
		  //click career page
		  driver.findElement(careerPage).click();
		  //wait for 3 seconds and click 'find out more and apply     
		  Thread.sleep(3000); 
		  JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		  js1.executeScript("window.scrollBy(0,800)"); 
		  //to click 'find out more and apply' not working     
		  Thread.sleep(3000); 
		  driver.findElement(phpDevLeadsPage).click(); 
		
	}
	public void contactFormDetails() throws Exception
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver; 
		  Thread.sleep(5000); js.executeScript("window.scrollBy(0,4000)"); 
		  //The below code is for career form 
		  //firstname 
		  driver.findElement(fstnm).sendKeys("Test_Annie"); 
		  //lastname 
		  driver.findElement(lstnm).sendKeys("Test_Kuriakose"); 
		  //About you 
		  driver.findElement(about).sendKeys("Myself Test_annie kuriakose I am working as php developer for 3 year. Worked with Bash, shell scripting, aws service.Myself Tesr_annie kuriakose I am working as php developer for 3 year. Worked with Bash, shell scripting, aws ");  
		  //code repo/portfolio 
		  driver.findElement(portfolio).sendKeys("https://github.com/clayrisser/craco"); 
		  //email 
		  driver.findElement(email).sendKeys("sit10@ascensor.com"); 
		  //phone no 
		  driver.findElement(phn).sendKeys("01111111111"); 
		  JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		  Thread.sleep(4000); 
		  js2.executeScript("window.scrollBy(0,5000)"); 
		  
		 
		  
		  driver.findElement(cookieNew).click();
//		  JavascriptExecutor js3 = (JavascriptExecutor) driver; 
//		  js3.executeScript("window.scrollBy(0,500)"); 
		  //click the upload cv field 
//		  driver.findElement(CvUploadBtn).click();
		  driver.findElement(CvUploadBtn).sendKeys("C:\\my\\testcv.docx");
		  
		  JavascriptExecutor js3 = (JavascriptExecutor) driver; 
		  js3.executeScript("window.scrollBy(0,500)");
		  Thread.sleep(2500);
		  driver.findElement(submitBtn).click();
		  
		  
	}

}

//WebElement upload_file = driver.findElement(By.xpath("//input[@id='cv']")); 