package mypac5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCammands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

          WebDriver driver = new ChromeDriver();
		
		
		//get(URL)
  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  		driver.manage().window().maximize();
		
  		Thread.sleep(7000);
  		
  		  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
  		
  		  Thread.sleep(5000);
  		  
	      //close single browser window at a time
	      driver.close();	      
	      
	      //quit close multiple browser window at a time
	    //  driver.quit();
	      
	      
	}

}
