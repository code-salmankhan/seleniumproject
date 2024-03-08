package mypac8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthAlert {

	public static void main(String[] args) 
	
{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();	 
		 
		 WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 driver.manage().window().maximize();
		 
		 
		 //https://the-internet.herokuapp.com/basic_auth
		 
		 //For auth we need to modify URL
		 //https://admin:admin@the-internet.herokuapp.com/basic_auth
		 
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")));
		 
		String act_text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
	
		
		if(act_text.contains("Congratulations"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login  Failed");
		}
		
		
	}

}
