package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

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
      
       
        WebElement view= driver.findElement(By.linkText("Create New View"));
        view.click();
        Thread.sleep(4000);
        
      	
        WebElement vname= driver.findElement(By.id("fname"));
        vname.sendKeys("ridaan");
        Thread.sleep(4000);
        		

        WebElement uniquename= driver.findElement(By.id("devname"));
        uniquename.click();	
        
     
        WebElement Savebtn= driver.findElement(By.xpath("//*[@title=\"Save\"]"));
        Savebtn.click();	
        		
	}

}
