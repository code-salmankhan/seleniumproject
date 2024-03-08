package mypc12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickDemo 
{
	public static void main(String[] args)
	{
	 WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_onclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement button = driver.findElement(By.xpath("//button[@onclick='myFunction()'][normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(field1).click().build().perform();		
		field1.clear();
		field1.sendKeys("Welcome");
		
		act.moveToElement(field2).click().build().perform();
		
		
		act.doubleClick(button).perform();
		
		//validation
		String s1 = field1.getText();
		String s2 = field2.getText();
          
		if(s1.equals(s2))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
				
	}	
}
