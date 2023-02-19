package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31 {

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
        Thread.sleep(4000);
        
        WebElement submit= driver.findElement(By.id("Login"));
        submit.click();
        Thread.sleep(5000);
        
        WebElement contact= driver.findElement(By.linkText("Contacts"));
        contact.click();
        Thread.sleep(4000);
        
        WebElement close= driver.findElement(By.id("tryLexDialogX"));
        close.click();
        Thread.sleep(5000);
        
        WebElement newview= driver.findElement(By.linkText("Create New View"));
        newview.click();
        Thread.sleep(5000);	
        
        WebElement vname= driver.findElement(By.id("fname"));
        vname.sendKeys("ABCD");
        Thread.sleep(5000);
        
        WebElement UniqueName= driver.findElement(By.id("devname"));
        UniqueName.clear();
        UniqueName.sendKeys("EFGH");
        		
        WebElement CANCEL= driver.findElement(By.name("cancel"));
        CANCEL.click();		

        driver.close();
	}

}
