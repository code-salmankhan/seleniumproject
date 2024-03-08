package mypac6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
			/*
			 * Adv:
			 * 1)Conditional based, it will work more effectively
			 * 2)finding element in inclusive
			 * 3)it will wait for condition to be true, the consider the time
			 * 
			 * Dis:
			 * 1) Multiple statements for multiple transactions
			 */
			
			
			
			
				//get(URL)
		  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  		driver.manage().window().maximize();
		  		
		  		
		  		WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username' or @placeholder='Username']")));
		  		username.sendKeys("Admin");
		  		
		  		WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password' or @placeholder='Password']")));
		  		password.sendKeys("admin123");
		
		
	}

}
