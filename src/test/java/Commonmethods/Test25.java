package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test25 {

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
        
        WebElement contact= driver.findElement(By.linkText("Contacts"));
        contact.click();
        Thread.sleep(4000);
        
        WebElement close= driver.findElement(By.id("tryLexDialogX"));
        close.click();
        Thread.sleep(5000);
        
        WebElement NEW1= driver.findElement(By.name("new"));
        NEW1.click();
        Thread.sleep(4000);
        		
        WebElement LastName= driver.findElement(By.id("name_lastcon2"));
        LastName.sendKeys("parveen");
        Thread.sleep(4000);
        
        WebElement AccName= driver.findElement(By.id("con4_lkwgt"));
        AccName.sendKeys("Reeza");
        Thread.sleep(4000);
        

        WebElement SAVE= driver.findElement(By.xpath("//input[@value=\" Save \"]"));
        SAVE.click();
        
        
	}

}
