package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

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
     
        WebElement Report= driver.findElement(By.linkText("Accounts with last activity > 30 days"));
        Report.click();
        Thread.sleep(5000);
     
        WebElement To= driver.findElement(By.id("ext-gen154"));
        To.click();
        
        WebElement Today= driver.findElement(By.id("ext-gen153"));
        Today.click();
        Thread.sleep(4000);
        
        WebElement Savebtn = driver.findElement(By.id("ext-gen49"));
        Savebtn.click();
        
        WebElement ReportName= driver.findElement(By.id("saveReportDlg_reportNameField"));
        ReportName.sendKeys("Finals");
        Thread.sleep(4000);
        		
        WebElement UniqueReport= driver.findElement(By.id("saveReportDlg_DeveloperName"));
        UniqueReport.sendKeys("Final_Report");	
        Thread.sleep(4000);
        		
        WebElement saverun= driver.findElement(By.id("dlgSaveAndRun"));
        saverun.click();		
        		
        		
	}

}
