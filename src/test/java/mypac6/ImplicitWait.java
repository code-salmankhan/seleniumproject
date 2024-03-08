package mypac6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 Advantages -
		     1) single time/one statement
		     2) It will not wait till maximum time if the element is available
		     3) Applicable for all elements
		     4) easy to use
		 
		 Disadvantages -
		     1) if the time is not sufficient then you will get exception		 
		*/
		
		
		 
			//get(URL)
	  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  		driver.manage().window().maximize();
	  		
	  		
	  		
	  		
	  		driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']")).sendKeys("Admin");
		
		
		
	}

}
