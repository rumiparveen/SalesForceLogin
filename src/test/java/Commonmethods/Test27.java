package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test27 {

	        public static void main(String[] args) throws InterruptedException {
		
		    WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
		
			driver.get("https://login.salesforce.com/");
	        WebElement username1=driver.findElement(By.id("username"));
	        username1.sendKeys("Rumi@tekarch.com");
	        Thread.sleep(4000);
	        
	      
	        WebElement password=driver.findElement(By.id("password"));
	        password.sendKeys("Rahish@123");
	        
	        WebElement submit= driver.findElement(By.id("Login"));
	        submit.click();
	        Thread.sleep(4000);
	        
	        WebElement contact= driver.findElement(By.linkText("Contacts"));
	        contact.click();
	        Thread.sleep(4000);
	        
	        WebElement close= driver.findElement(By.id("tryLexDialogX"));
	        close.click();
	        Thread.sleep(5000);
	       
	        WebElement Rcreated = driver.findElement(By.id("hotlist_mode"));
	        Select Rcreated1 = new Select(Rcreated);
	        Rcreated1.selectByVisibleText("Recently Created");
	        Thread.sleep(4000);
	        
	       driver.close();
		

	}

}
