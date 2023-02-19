package Commonmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	 
	   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("https://login.salesforce.com/");
    WebElement username1=driver.findElement(By.id("username"));
    username1.sendKeys("rumi@tekarch.com");
  
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("Rahish@123");
    
     WebElement btn=  (WebElement) driver.findElement(By.id("rememberUn"));
     btn.click();
     
     WebElement submit= driver.findElement(By.id("Login"));
     submit.click();
      
     WebElement user= driver.findElement(By.id("userNavLabel"));
     user.click();
     
     WebElement log= driver.findElement(By.linkText("Logout"));
     log.click();
       
      driver.close(); 
}
    
}

