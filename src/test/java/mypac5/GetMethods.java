package mypac5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*get(URL)
getTitle()
getCurrentURL())
getPageSource())
getWindowHandle()
getWindowHandles()
*/

public class GetMethods {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		
		//get(URL)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		
		//getTitle()
		System.out.println("Title of the page : "+ driver.getTitle());
		
		//getCurrentURL
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		
		//getPageSource
		System.out.println("Page source............:\n " + driver.getPageSource());
		
		//getWindowHandle
		System.out.println("Window handle : " + driver.getWindowHandle());
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//getWindowHandles
		Set<String> windowids = driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			System.out.println(winid);
		}
		
				
		
		
	}

}
