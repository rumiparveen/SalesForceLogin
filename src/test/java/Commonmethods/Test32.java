package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32 {

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
        
        WebElement NEW1= driver.findElement(By.name("new"));
        NEW1.click();
        		
        WebElement LastName = driver.findElement(By.id("name_lastcon2"));
        LastName.sendKeys("Indian");
        Thread.sleep(5000);		
        		
        WebElement AccName = driver.findElement(By.id("con4"));
        AccName.sendKeys("Global Media");
        Thread.sleep(4000);
        
        WebElement SaveNew = driver.findElement(By.name("save_new"));
        SaveNew.click();
        
        driver.close();

	}

}
