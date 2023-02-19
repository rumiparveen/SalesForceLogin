package Commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	
		driver.get("https://login.salesforce.com/");
        WebElement username1=driver.findElement(By.id("username"));
        username1.sendKeys("rumi@tekarch.com");
      
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Rahish@123");
        
        WebElement submit= driver.findElement(By.id("Login"));
         submit.click();
        WebElement usermenu= driver.findElement(By.id("userNavLabel"));
        usermenu.click();
        
        WebElement profile= driver.findElement(By.linkText("My Profile"));
        profile.click();
        Thread.sleep(5000);
        
        WebElement editbtn= driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
        editbtn.click();
        Thread.sleep(5000);
        
        WebElement frame1= driver.findElement(By.id("contactInfoContentId"));
        
        driver.switchTo().frame(frame1);
        Thread.sleep(4000);
        
        WebElement Abtbtn= driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a[1]"));
        Abtbtn.click();
        Thread.sleep(2000);
       
        WebElement lname= driver.findElement(By.id("lastName"));
        lname.clear();
        lname.sendKeys("Riyaz");
        
        
        WebElement save= driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
        save.click();
        
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        
        Thread.sleep(4000);
        WebElement post =driver.findElement(By.xpath("//span[text()='Post']"));
        post.click();
          
        WebElement postframe= driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]"));
        driver.switchTo().frame(postframe);
        WebElement framebody= driver.findElement(By.xpath("//html[1]/body[1]"));
        framebody.click();
        framebody.sendKeys("welcome to Automation");
        
        
        driver.switchTo().parentFrame();
       Thread.sleep(5000);
        
        WebElement Sharebutton= driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
        Sharebutton.click();
        System.out.println("Message is posted");
        
        
        
        WebElement File= driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']"));
        File.click();
        Thread.sleep(5000);
        
        WebElement Uploadfile=driver.findElement(By.xpath("//*[@id ='chatterUploadFileAction']"));
        Uploadfile.click();
        Thread.sleep(5000);
        WebElement choosefile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
        choosefile.sendKeys("/Users/riyazahmedmohammed/Documents/output.txt");
     
        WebElement AddPhoto=driver.findElement(By.id("displayBadge"));
        AddPhoto.click();
        Thread.sleep(5000);
      
        WebElement frame2= driver.findElement(By.id("uploadPhotoContentId"));
        driver.switchTo().frame(frame2);
        
        
        WebElement choosephoto= driver.findElement(By.xpath("//input[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
        choosephoto.sendKeys("/Users/riyazahmedmohammed/Pictures/2021_Pics/RYZ_3092.jpg");
        
	}

}
