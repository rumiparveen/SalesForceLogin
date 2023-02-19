package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 {

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
         
        WebElement Account= driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
        Account.click();
        Thread.sleep(4000);
       
        WebElement close= driver.findElement(By.linkText("Close"));
        close.click();
        Thread.sleep(4000);
    
        WebElement Svname = driver.findElement(By.name("fcf"));
        Select Svname1 = new Select(Svname);
        Svname1.selectByVisibleText("ridaan");
        Thread.sleep(4000);
        
        WebElement edit= driver.findElement(By.linkText("Edit"));
        edit.click();
        
        WebElement viewname= driver.findElement(By.id("fname"));
        viewname.clear();
        viewname.sendKeys("Rahish");
        Thread.sleep(4000);
        
        WebElement field = driver.findElement(By.id("fcol1"));
        Select field1 = new Select(field);
        field1.selectByVisibleText("Account Name");
        Thread.sleep(4000);
        
        WebElement operator = driver.findElement(By.id("fop1"));
        Select operator1 = new Select(operator);
        operator1.selectByVisibleText("contains");
        Thread.sleep(4000);
        
        WebElement Value= driver.findElement(By.id("fval1"));
        Value.sendKeys("<a>");
        		
        WebElement Save= driver.findElement(By.name("save"));
        Save.click();
        
        
	}

}
