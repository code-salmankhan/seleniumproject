package mypac9;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiBowserHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		
		for(String winID:windowIDs)
		{
			String Title = driver.switchTo().window(winID).getTitle();
			System.out.println(Title);
			Thread.sleep(2000);
			driver.close();
			
		}
				
		
		
	}

}
