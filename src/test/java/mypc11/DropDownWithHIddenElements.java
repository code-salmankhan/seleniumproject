package mypc11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithHIddenElements {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   //Click on PIM
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	   
	   
	   //drop down
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
	 
	   //Remove blur option from event listener and find xpath of inside values
	   List<WebElement> allHiddenOptions = driver.findElements(By.xpath("//div[@role='listbox']//span"));	
	
	   for(WebElement HiddenOption : allHiddenOptions)
	   {
		System.out.println(HiddenOption.getText());
		  if(HiddenOption.getText().equals("QA Engineer"))
		    {
			  HiddenOption.click();
			  break;
		     }
		
	   }
	}

}
