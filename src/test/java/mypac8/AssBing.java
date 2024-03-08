package mypac8;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AssBing 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://www.bing.com/");
		
		String s = "Google";
		
		
		try
		{
			WebElement Text = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Search the web']")));
			Text.sendKeys(s);
			
			
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//li//span[contains(text(),'"+s+"')]")));
			List<WebElement> options = driver.findElements(By.xpath("//div//li//span[contains(text(),'"+s+"')]"));
			System.out.println("Number of text options : " + options.size());
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}
			
			}
		catch(TimeoutException e)			
		{
			System.out.println("Number of text options : 0" );
		}
		
	try	
	{
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[strong]")));
		List<WebElement> strgoptions = driver.findElements(By.xpath("//div[strong]"));
		System.out.println("Number of Strong text options : " + strgoptions.size());
		
		for(int i=0;i<strgoptions.size();i++)
		{
			System.out.println(strgoptions.get(i).getText());
		}
	}	
	catch(TimeoutException e)	
	{
		System.out.println("Number of Strong text options : 0" );
	}

}
}
