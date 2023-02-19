package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test34 {

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
        
        WebElement Home= driver.findElement(By.id("home_Tab"));
        Home.click();
        Thread.sleep(5000);
        
        WebElement close= driver.findElement(By.id("tryLexDialogX"));
        close.click();
        Thread.sleep(5000);
        
        WebElement FLName= driver.findElement(By.linkText("rumi Riyaz"));
        FLName.click();
        Thread.sleep(5000);		
        		
        WebElement Edit= driver.findElement(By.xpath("//*[@class=\"recImage user\"]"));
        Edit.click();
        Thread.sleep(5000);	
        
        WebElement Frame1= driver.findElement(By.id("aboutMeContentId"));//id="aboutMeContentId"
        driver.switchTo().frame(Frame1);
        Thread.sleep(4000);
        		
         
        WebElement Abtbtn= driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a[1]"));
        Abtbtn.click();
        Thread.sleep(2000);
       
        WebElement lname= driver.findElement(By.id("lastName"));
        lname.clear();
        lname.sendKeys("Abcd");
        		
        		
        WebElement SAVE= driver.findElement(By.xpath("//*[@value=\"Save All\"]"));
        SAVE.click();
        
        driver.switchTo().defaultContent();
       // driver.close();

	}

}
