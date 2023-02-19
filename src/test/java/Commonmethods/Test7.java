package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://login.salesforce.com/");
        WebElement username1=driver.findElement(By.id("username"));
        username1.sendKeys("Rumi@tekarch.com");
      
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Rahish@123");
        Thread.sleep(5000);
        
        WebElement submit= driver.findElement(By.id("Login"));
         submit.click();
         
        WebElement usermenu= driver.findElement(By.id("userNavLabel"));
         usermenu.click();
         
        WebElement MySettings=driver.findElement(By.linkText("My Settings"));
        MySettings.click();
        Thread.sleep(5000);
         
        WebElement personallink=driver.findElement(By.id("PersonalInfo_font"));
        personallink.click();
          
        WebElement LoginHistory=driver.findElement(By.linkText("Login History"));
        LoginHistory.click();
        Thread.sleep(5000);
          
        WebElement Display=driver.findElement(By.linkText("Display & Layout"));
        Display.click();
          
        WebElement customizetabs= driver.findElement(By.id("CustomizeTabs_font"));
        customizetabs.click();
        Thread.sleep(5000);
          
          
        WebElement CustomApp = driver.findElement(By.id("p4"));
        Select CustomApp1 = new Select(CustomApp);
        CustomApp1.selectByVisibleText("Salesforce Chatter");
         Thread.sleep(5000);
        
        WebElement AvailableTab =driver.findElement(By.id("duel_select_0"));
        Select AvailableTab1 = new Select(AvailableTab);
        AvailableTab1.selectByVisibleText("Reports");
        Thread.sleep(5000);
         
        
        WebElement Add = driver.findElement(By.linkText("Add"));
        Add.click();
        Thread.sleep(5000);
        
        WebElement save=driver.findElement(By.name("save"));
        save.click();
        Thread.sleep(5000);
        
        WebElement Email=driver.findElement(By.id("EmailSetup_font"));
        Email.click();
        
        WebElement ESetting=driver.findElement(By.linkText("My Email Settings"));
        ESetting.click();
        
        WebElement Ename=driver.findElement(By.id("sender_name"));
        Ename.clear();
        Ename.sendKeys("Rumi");
        
        WebElement Radiobtn =driver.findElement(By.id("auto_bcc1"));
        Radiobtn.click();
        Thread.sleep(5000);
       
       
     /*  WebElement savebtn =driver.findElement(By.xpath("//input[@type='submit']"));
         savebtn.click();*/
       
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
        btn.click();
        Thread.sleep(5000);
        
        WebElement calender=driver.findElement(By.id("CalendarAndReminders_font"));
        calender.click();
        
        WebElement RemainderLink= driver.findElement(By.id("Reminders_font"));
        RemainderLink.click();
        Thread.sleep(5000);
        
        WebElement TestRemainder= driver.findElement(By.xpath("//input[@value=\"Open a Test Reminder\"]"));
        TestRemainder.click();
        
       
	}

}
