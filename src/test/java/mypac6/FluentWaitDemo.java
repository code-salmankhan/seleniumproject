package mypac6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);
			
			
			
				//get(URL)
		  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  		driver.manage().window().maximize();
		  		
		  		
		  		 WebElement username = mywait.until(new Function<WebDriver, WebElement>() 
		  		 {
		  		     public WebElement apply(WebDriver driver) {
		  		       return driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']"));
		  		     }
		  		   });
		  		
		  		username.sendKeys("Admin");
		  		
		  		WebElement password = mywait.until(new Function<WebDriver, WebElement>() 
		  		 {
		  		     public WebElement apply(WebDriver driver) {
		  		       return driver.findElement(By.xpath("//input[@name='password' or @placeholder='Password']"));
		  		     }
		  		   });
		  		
		  		password.sendKeys("admin123");
		
		
		
		
	}

}
