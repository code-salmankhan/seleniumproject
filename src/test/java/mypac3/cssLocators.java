package mypac3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocators 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		
		//tag #id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Book");
        
		Thread.sleep(2000);
		
		// only #id
		driver.findElement(By.cssSelector("#small-searchterms")).clear();
		
		Thread.sleep(2000);
		
		//tag .class name after removing test after space
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		
		Thread.sleep(2000);
		
		//tag [attribute]
		driver.findElement(By.cssSelector("button[type=\'submit\']")).click();
		
		//tag .class [attribute]
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("End");
		
		Thread.sleep(2000);
	}

}
