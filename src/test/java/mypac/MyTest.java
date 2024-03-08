package mypac;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	
	public static void main(String[] args) throws InterruptedException
	{
				
		
		 
		//1) Launch browser
		//System.setProperty("webdriver.chrome.driver", "/Users/salmankhan/Documents/Coding/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//2) Open URL in browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize window
		driver.manage().window().maximize();
		
		//wait to load
		
		
		//3) Provide username : Admin
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("Admin");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		//4) Provide Password :
		driver.findElement(By.name("password")).sendKeys("admin123");

		
		//5)Click on Submit button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		Thread.sleep(7000);
	/*
		//6) Verify the title of dashboard page
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed with title");
		}
		else
		{
			System.out.println("Test failed with title");
		}
		*/
		//7) Verify with label
		String act_label = null;
		try
		{
		act_label = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e)			
		{
			act_label="";
		}
		
		
		String exp_label = "Dashboard";
				
		if(act_label.equals(exp_label))
		{
			System.out.println("Test passed with label");
		}
		else
		{
			System.out.println("Test failed  with label");
		}	
		
		
		
		
		//7) Close browser
		driver.close();
		//driver.quit();
		
		
		System.out.println("Done");
	}

}
