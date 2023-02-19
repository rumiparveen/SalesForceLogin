package Commonmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test36 {

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
        Thread.sleep(3000);
        
        WebElement close= driver.findElement(By.id("tryLexDialogX"));
        close.click();
        Thread.sleep(4000);
        
        WebElement month=driver.findElement(By.xpath("//*[@colspan=\"5\"]"));
        month.click();
        Thread.sleep(3000);
        
        WebElement date=driver.findElement(By.xpath("//*[@title=\"February 18 (Today)\"]"));
        date.click();
        Thread.sleep(3000);
        		
        WebElement pm=driver.findElement(By.linkText("8:00 PM"));
        pm.click();		
        Thread.sleep(3000); 
        
        WebElement combo=driver.findElement(By.xpath("//*[@class=\"comboboxIcon\"]"));
        combo.click();
        Thread.sleep(3000); 
      //  WebElement popup= driver.findElement(By.linkText("Select a Subject below."));
       // Select popup1=new Select(popup);
       // popup1.selectByVisibleText("Other");
       
    //    driver.getWindowHandle();
      //  WebElement popup= driver.findElement(By.linkText("document.write (getPickValue (4));"));
   //    (String currentWindow: driver.getWindowHandles());
       /* String mainwindow = driver.getWindowHandle();
        for (String ComboBox : driver.getWindowHandles(){
        	Thread.sleep(3000);
            driver.switchTo().window(ComboBox);
        }
        WebElement popup= driver.findElement(By.linkText("listItem4"));
        popup.click();
        driver.switchTo().window(mainwindow); //Switching to main/parent window*/
        
    //   WebElement popup= driver.findElement(By.linkText("listItem4"));
        WebElement popup=driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a/script"));
  //      popup=driver.findElement​(By.xpath("//*[@class=\"listItem4\"]"));
    //    WebElement m =driver.findElement(By.linkText("Refund Policy"));
         popup.click();
        
	}

}
