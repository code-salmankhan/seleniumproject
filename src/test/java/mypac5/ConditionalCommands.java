package mypac5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		
		
		//get(URL)
	      driver.get("https://demo.nopcommerce.com/register");
	      driver.manage().window().maximize();
		
	      Thread.sleep(7000);
	      
		//WebElement logo = driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		//System.out.println("Display status of logo : "+logo.isDisplayed());
		
	      
	      
	     //Logo 
	     boolean status =  driver.findElement(By.tagName("img")).isDisplayed();
		System.out.println(status);
		
		
		//Search button
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
		
		System.out.println("Display Status : " + searchbox.isDisplayed());
		System.out.println("Enable status : " + searchbox.isEnabled());
		
		
		//Before selecting radio button
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@id='gender-female']"));
        
		System.out.println("\nBefore selcting.............");
		System.out.println("Male Button Selection status : " + radio1.isSelected());
		System.out.println("Female Button Selection status : " + radio2.isSelected());
		
		
		//Select radio button
		radio1.click();
		
		//After Selecting radio button
		
        System.out.println("\nAfter selcting.............");
		System.out.println("Male Button Selection status : " + radio1.isSelected());
		System.out.println("Female Button Selection status : " + radio2.isSelected());
		
		
	}

}
