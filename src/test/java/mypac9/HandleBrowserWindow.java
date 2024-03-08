package mypac9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
       
WebDriver driver = new ChromeDriver();	 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
	
		 //Window IDs Set
		 Set<String> windowIDs = driver.getWindowHandles();
		 
		 
		//Approach1 
		 
		 /*
		 //Store Windows IDs in List
		 List<String> windowsList = new ArrayList(windowIDs);
		 
		 //store in strings
		 String parentWindowID = windowsList.get(0);
		 String childWindowID = windowsList.get(1);
		 
		 //Switch to Child Window
		 driver.switchTo().window(childWindowID);
		 driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-contact-sales'][normalize-space()='Book a Free Demo'])[2]")).click();
		
		 //switch to ParentWindow	
		 driver.switchTo().window(parentWindowID);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
         */


		 //Approach2
		 for(String winID:windowIDs)
		 {
			 String title = driver.switchTo().window(winID).getTitle();
			 
			 if(title.equals("Human Resources Management Software | OrangeHRM"))
			 {
				 driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-contact-sales'][normalize-space()='Book a Free Demo'])[2]")).click(); 
				 driver.close();  //which is currently focused by driver
			 }
			 
			 
		 }
		 
		 driver.close(); //which is currently focused by driver
		// driver.quit(); // all opened windows
		 
}

}
