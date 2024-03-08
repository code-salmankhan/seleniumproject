package mypac;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin1");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		String act_Label = "";
		
		try {
			act_Label = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		}
		catch(NoSuchElementException e)
		{
			
		}
		
		String exp_Label = "Dashboard";
		
		if(act_Label.equals(exp_Label))
		{
			System.out.println("Test Passed");
		}
		else
		{
			 System.out.println("Test Failed");
		}
		
		Thread.sleep(5000);
		
		driver.close();
		//driver.quit();
	}

}
