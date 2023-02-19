package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

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
     
        WebElement mergeAcc= driver.findElement(By.linkText("Merge Accounts"));
        mergeAcc.click();
        Thread.sleep(4000);
        
        WebElement AccName= driver.findElement(By.id("srch"));
        AccName.sendKeys("Rumana");
        Thread.sleep(4000);	
        
        WebElement FindAcc = driver.findElement(By.name("srchbutton"));
        FindAcc.click();
        
        //WebElement clickbtn = driver.findElement(By.xpath("//input[@ id=\"cidO\
        //clickbtn.click();
        WebElement Next= driver.findElement(By.xpath("//input[@value=\" Next \"]"));
        Next.click();
        Thread.sleep(4000);
        
        WebElement Merge = driver.findElement(By.xpath("//*[@value=\" Merge \"]"));
        Merge.click();
        
        
        //WebElement AccName1= driver.findElement(By.id("srch"));
       // AccName1.sendKeys("Reham");
        
        
       //WebElement FindAcc1 = driver.findElement(By.name("srchbutton"));
       // FindAcc1.click();
        		

	}

}
