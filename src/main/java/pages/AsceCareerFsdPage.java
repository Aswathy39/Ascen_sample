package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.Allure;

public class AsceCareerFsdPage 
{
	
	public WebDriver driver;
	SoftAssert softAssert =new SoftAssert();
	

	public  AsceCareerFsdPage(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	By cookie =By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll\"]");
	By careerPage = By.xpath("//*[@id=\"header-navbar\"]/div/div/div[2]/div[2]/nav/ul/li[3]/a");
	By fsdDevLeadsPage = By.xpath("//*[@id=\"top\"]/div[2]/div[2]/div/div[1]/div[1]/div[2]/a");
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
		  driver.findElement(cookie).click();
		  Allure.step("Clicked on cookie accept button");

		  Thread.sleep(3000);
		  //click career page
		  driver.findElement(careerPage).click();
		  Allure.step("Clicked on button to navigate to career page");
		  
		  // to compare actual and expected url matching or not
		  String ActUrlTxt =driver.getCurrentUrl();
		  String ExpUrlTxt = "https://ascensor.stage.ascensor.co.uk/careers";
		  softAssert.assertEquals(ActUrlTxt, ExpUrlTxt, "URL Mismatched");
		  
		  //wait for 3 seconds and click 'find out more and apply     
		  Thread.sleep(3000); 
		  JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		  js1.executeScript("window.scrollBy(0,800)"); 
		  //to click 'find out more and apply' not working     
		  Thread.sleep(3000); 
		  driver.findElement(fsdDevLeadsPage).click(); 
		  Allure.step("Clicked on button to navigate to Php developer leads page");
		  
		  // to compare actual and expected url matching or not
		  String ActUrlTxt1 =driver.getCurrentUrl();
		  String ExpUrlTxt1 = "https://ascensor.stage.ascensor.co.uk/careers/full-stack-developer-leeds";
		  softAssert.assertEquals(ActUrlTxt1, ExpUrlTxt1, "URL Mismatched");
		  
		  softAssert.assertAll();
		
	}
	public void contactFormDetails() throws Exception
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver; 
		  Thread.sleep(5000); js.executeScript("window.scrollBy(0,4000)"); 
		  //The below code is for career form 
		  //firstname 
		  driver.findElement(fstnm).sendKeys("Test_Annie"); 
		  Allure.step("Entered first name");
		  //lastname 
		  driver.findElement(lstnm).sendKeys("Test_Kuriakose"); 
		  Allure.step("Entered last name");
		  //About you 
		  driver.findElement(about).sendKeys("Myself Test_annie kuriakose I am working as php developer for 3 year. Worked with Bash, shell scripting, aws service.Myself Tesr_annie kuriakose I am working as php developer for 3 year. Worked with Bash, shell scripting, aws ");  
		  Allure.step("Entered about details");
		  //code repo/portfolio 
		  
		  driver.findElement(portfolio).sendKeys("https://github.com/clayrisser/craco"); 
		  Allure.step("Entered portfolio details");
		  //email 
		  driver.findElement(email).sendKeys("sit10@ascensor.com"); 
		  Allure.step("Entered email id");
		  //phone no 
		  driver.findElement(phn).sendKeys("01111111111"); 
		  Allure.step("Entered Phone number");
		  JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		  Thread.sleep(4000); 
		  js2.executeScript("window.scrollBy(0,5000)"); 
		  
		 
		  
		  driver.findElement(cookieNew).click();
		  
		  driver.findElement(CvUploadBtn).sendKeys("C:\\my\\testcv.docx");
		  Allure.step("Resume file location is entered");
		  
		  JavascriptExecutor js3 = (JavascriptExecutor) driver; 
		  js3.executeScript("window.scrollBy(0,500)");
		  Thread.sleep(2500);
		  driver.findElement(submitBtn).click();
		  Allure.step("Submit button is clicked");
		  
	}
	public void negativeInvalidValue() throws Exception
	{
		//to refresh and clear form data
		driver.navigate().refresh();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		  Thread.sleep(5000); js.executeScript("window.scrollBy(0,4000)"); 
		  //The below code is for career form 
		  //firstname 
		  driver.findElement(fstnm).sendKeys("jhg523w=-yjfr8-0=-0FH_)(*&^%"); 
		  Allure.step("Entered first name");
		  //lastname 
		  driver.findElement(lstnm).sendKeys("POIUSD#$%^&*(098765"); 
		  Allure.step("Entered last name");
		  //About you 
		  driver.findElement(about).sendKeys("Worked with Bash, shell scripting, aws [GFRCFOIR45890-OJKBW234%*()&%$weDCFvhbjui_i%^DF ");  
		  Allure.step("Entered about details");
		  //code repo/portfolio 
		  
		  driver.findElement(portfolio).sendKeys("LKJHGF5896UHGUY344*^%#Gkjhhdcfgvm.com"); 
		  Allure.step("Entered portfolio details");
		  //email 
		  driver.findElement(email).sendKeys("sit1tyfhjjh(&*^%4667..com"); 
		  Allure.step("Entered email id");
		  //phone no 
		  driver.findElement(phn).sendKeys("khjg76r(*^&%111"); 
		  Allure.step("Entered Phone number");
//		  JavascriptExecutor js2 = (JavascriptExecutor) driver; 
		  Thread.sleep(2000); 
		
//		  js2.executeScript("window.scrollBy(0,5000)"); 
//		  driver.findElement(cookieNew).click();
		  
		  driver.findElement(CvUploadBtn).sendKeys("C:\\my\\testcv.docx");
		  Allure.step("Resume file location is entered");
		  
//		  JavascriptExecutor js3 = (JavascriptExecutor) driver; 
//		  js3.executeScript("window.scrollBy(0,500)");
		  Thread.sleep(3000);
		  driver.findElement(submitBtn).click();
		  Allure.step("Submit button is clicked");
		
	}
	public void negativeNullValue() throws Exception
	{
		driver.navigate().refresh();
		Thread.sleep(2500); 
		
		  driver.findElement(submitBtn).click();
		  Allure.step("Submit button is clicked");
		
	}

}
