package mypc10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationTable 
{
 public static void main(String[] args) throws InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.manage().window().maximize();
	 
	 driver.get("https://demo.opencart.com/admin/");
	 
	 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	 username.clear();
	 username.sendKeys("demo");
	 System.out.println("Done1");
	 
	 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	 password.clear();
	 password.sendKeys("demo");
	 System.out.println("Done2");
	 
	 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	 login.click();
	 System.out.println("Done3");
	 
	 Thread.sleep(5000);
	
	 
	 
	 try
	 {
	 if(driver.findElement(By.xpath("//h1[normalize-space()='demo.opencart.com']")).isDisplayed())
	 {
		 WebElement frame1 = driver.findElement(By.xpath("//iframe"));
		    driver.switchTo().frame(frame1);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.switchTo().defaultContent();
		 System.out.println("Done4");
		 }
		}
		 catch(NoSuchElementException e)
		 {
			 System.out.println("NotFound");
		 }
	 
	 
	 
	 Thread.sleep(5000);
	try { 
	 if(driver.findElement(By.xpath("//h1[normalize-space()='demo.opencart.com']")).isDisplayed())
	 {
		 WebElement frame1 = driver.findElement(By.xpath("//iframe"));
		    driver.switchTo().frame(frame1);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.switchTo().defaultContent();
		 System.out.println("Done5");
	 }
	}
	 catch(NoSuchElementException e)
	 {
		 System.out.println("NotFound");
	 }
	
	 
	 Thread.sleep(3000);
	 
	 
	 
	 
	 try 
	 { 
	 if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
	   {
		 driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		 System.out.println("Clicked");
	    }
      }
      catch(NoSuchElementException e)
      {
	  System.out.println("NotFound");
      }
	 
	 driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
	 driver.findElement(By.xpath("//ul[@id='collapse-5']//a[normalize-space()='Customers']")).click();
 }             
}
