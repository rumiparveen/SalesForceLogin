package Commonmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tekarch-a7-dev-ed.develop.my.salesforce.com/");
		
        WebElement username1=driver.findElement(By.id("username"));
        username1.sendKeys("rumi@tekarch");
     
        WebElement password1=driver.findElement(By.id("password"));
        password1.clear();
      
		WebElement submit= driver.findElement(By.id("Login"));
		submit.click();
	     System.out.println(driver.findElement(By.id("error")).getText());
	    
	     
	     		
		driver.close();
		

	}

}
