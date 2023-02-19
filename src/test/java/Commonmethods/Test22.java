package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test22 {

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

        WebElement view1 = driver.findElement(By.id("fcf"));
        Select VIEW = new Select(view1);
        VIEW.selectByVisibleText("Today's Leads");
        Thread.sleep(6000);
        
        WebElement user= driver.findElement(By.id("userNavLabel"));
        user.click();
        
        WebElement log= driver.findElement(By.linkText("Logout"));
        log.click();
          
        
        
        WebElement username2 = driver.findElement(By.id("username"));
        username2.sendKeys("Rumi@tekarch.com");
        Thread.sleep(5000);
        
         
        WebElement password1=driver.findElement(By.id("password"));
        password1.sendKeys("Rahish@123");
        Thread.sleep(4000);
        
        
        WebElement submit1= driver.findElement(By.id("Login"));
        submit1.click();
        Thread.sleep(4000);
        
        WebElement lead2= driver.findElement(By.linkText("Leads"));
        lead2.click();
        Thread.sleep(4000);
        
        
        WebElement go= driver.findElement(By.linkText("go"));
        go.click();
        
        driver.close();
        
	}

}
