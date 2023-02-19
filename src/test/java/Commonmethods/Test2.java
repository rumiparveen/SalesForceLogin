package Commonmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://login.salesforce.com/");
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("rumi@tekarch.com");
      
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Rahish@123");
        
        Thread.sleep(3000);
        
         
        WebElement submit= driver.findElement(By.id("Login"));
    
		submit.click();
		driver.close();
		
	}

}
