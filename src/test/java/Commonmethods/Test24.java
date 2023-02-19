package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24 {

	    public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://login.salesforce.com/");
        WebElement username1=driver.findElement(By.id("username"));
        username1.sendKeys("Rumi@tekarch.com");
      
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Rahish@123");
        
        WebElement submit= driver.findElement(By.id("Login"));
        submit.click();
        Thread.sleep(4000);
        
        WebElement lead= driver.findElement(By.linkText("Leads"));
        lead.click();
        Thread.sleep(4000);
    
        WebElement close= driver.findElement(By.id("tryLexDialogX"));
        close.click();
        Thread.sleep(4000);
 
        WebElement New = driver.findElement(By.xpath("//*[@value=\" New \"]"));
        New.click();
        Thread.sleep(4000);
        		
        WebElement LName = driver.findElement(By.id("name_lastlea2"));
        LName.sendKeys("ABCD");
        		
        WebElement CompName = driver.findElement(By.id("lea3"));
        CompName.sendKeys("ABCD");
        Thread.sleep(4000);		
        		
        WebElement SAVE = driver.findElement(By.xpath("//*[@value=\" Save \"]"));
        SAVE.click();		

	}

}
