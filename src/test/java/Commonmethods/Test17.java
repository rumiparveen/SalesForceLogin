package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 {

	       public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			driver.get("https://login.salesforce.com/");
	        WebElement username1=driver.findElement(By.id("username"));
	        username1.sendKeys("Rumi@tekarch.com");
	      
	        WebElement password=driver.findElement(By.id("password"));
	        password.sendKeys("Rahish@123");
	        
	        WebElement submit= driver.findElement(By.id("Login"));
	        submit.click();
	        Thread.sleep(4000);
	        
	        WebElement opp=driver.findElement(By.linkText("Opportunities"));
	        opp.click();
	        Thread.sleep(4000);
	        
	        WebElement close= driver.findElement(By.id("tryLexDialogX"));
	        close.click();
	        Thread.sleep(4000);
	        
	         
	        WebElement pipeline = driver.findElement(By.linkText("Opportunity Pipeline"));
	        pipeline.click();
           
	        driver.close();
	        
	}

}
