package Commonmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	   public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 
		   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.id("un")).sendKeys("rumi@tekarch.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.linkText("Return to Login")).click();
        driver.close();
	}

}
