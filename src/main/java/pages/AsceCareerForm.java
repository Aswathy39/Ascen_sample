package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AsceCareerForm 

{
	public WebDriver driver;
	public void AsceCareerForm(WebDriver driver)
	{
		this.driver=driver; 
	}
	public void navigateTOCareerForm() throws Exception
	{
		
		Thread.sleep(2000);
		//allow cookies    
		
		  driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll\"]")).click();
				  //wait for 3 seconds and click career page
				  

		  Thread.sleep(3000);
		  //click career page
		  driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/div/div/div[2]/div[2]/nav/ul/li[3]/a")).click();
		  //wait for 3 seconds and click 'find out more and apply     
		  Thread.sleep(3000); 
		  JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		  js1.executeScript("window.scrollBy(0,800)"); 
		  //to click 'find out more and apply' not working     
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//a[contains(@href, 'https://ascensor.stage.ascensor.co.uk/careers/laravel-php-developer-leeds')]")).click(); 
		
	}
	

}
