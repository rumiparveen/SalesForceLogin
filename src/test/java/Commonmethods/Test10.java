package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	private static final String JavaScriptutil = null;

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
         
         
        WebElement Account= driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
         Account.click();
         Thread.sleep(4000);
        
        WebElement close= driver.findElement(By.linkText("Close"));
         close.click();
        
        
      
        WebElement Newbtn= driver.findElement(By.xpath("//input[@value=\" New \"]"));
         Newbtn.click();
        
        WebElement AccName = driver.findElement(By.id("acc2"));
         AccName.sendKeys("Rumana");
         Thread.sleep(4000);
         
        WebElement Type = driver.findElement(By.name("acc6"));
         Select Type1 = new Select(Type);
         Type1.selectByVisibleText("Technology Partner");
         Thread.sleep(4000);
         	
        WebElement priority = driver.findElement(By.id("00NDn00000SjV42"));
         Select priority1 = new Select(priority);
         priority1.selectByVisibleText("High");
         		
         WebElement Save= driver.findElement(By.name("save"));
         Save.click();		
       	
 
     
       
       
    

	}

}
