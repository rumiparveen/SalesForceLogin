package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {

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
         
        WebElement New= driver.findElement(By.name("new"));
        New.click();
        
        WebElement OpportunityName = driver.findElement(By.id("opp3"));
        OpportunityName.sendKeys("Adversitment");
        Thread.sleep(4000);
        
        WebElement AccName = driver.findElement(By.id("opp4"));
        AccName.sendKeys("Rumana");
        		
        WebElement closingdate = driver.findElement(By.id("opp9"));
        closingdate.sendKeys("[ 2/14/2023 ]");
        Thread.sleep(4000);
        
        WebElement Stage = driver.findElement(By.id("opp11"));
        Select Stage1 = new Select(Stage);
        Stage1.selectByVisibleText("Qualification");
        Thread.sleep(4000);
        		
        		
        WebElement probability = driver.findElement(By.id("opp12"));
        probability.clear();
        probability.sendKeys("20%");
        
        WebElement Lead = driver.findElement(By.id("opp6"));
        Select Lead1 = new Select(Lead);
        Lead1.selectByVisibleText("Partner Referral");
        Thread.sleep(4000);
        
        		 
        WebElement campaign = driver.findElement(By.id("opp17"));
        campaign.sendKeys("ADVERSIMENT");
        
        driver.close();
        		
        				
        		
        Thread.sleep(4000);
        

	}

}
