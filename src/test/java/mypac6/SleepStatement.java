package mypac6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatement {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
			
			//get(URL)
	  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  		driver.manage().window().maximize();
	  		
	  		Thread.sleep(5000);
	  		//Disadvantages - if application is taking more time to load or if application is taking less time to load
	  		
	  		
	  		
	  		driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']")).click();
	  		
	  		//driver.findElement(By.cssSelector(input[name='username'])).click();
	  		
	  		
	  		
	}

}
