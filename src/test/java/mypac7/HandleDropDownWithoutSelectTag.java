package mypac7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWithoutSelectTag 
{

	public static void main(String[] args) 
 {
		// TODO Auto-generated method stub

          WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		
		//find total number of Options
		    System.out.println("Total number of options : " + options.size());
		 
		 //Print all option
		    for(int i=0;i<options.size();i++)
		    {
		    	System.out.println(options.get(i).getText());
		    }
		    
		    
		//Select options from drop down
		    for(int i=0;i<options.size();i++)
		    {
		    	if(options.get(i).getText().equals("jQuery") || options.get(i).getText().equals("Bootstrap"))
		    	{
		    		options.get(i).click();
		    	}
		    }
		    
		    //or
		    for(int i=0;i<options.size();i++)
		    {
		    	String option = options.get(i).getText();
		    	if(option.equals("Java") || option.equals("Python"))
		    	{
		    		options.get(i).click();
		    	}
		    }
		    
		    //or
		    for(WebElement option:options)
		    {
		    	String text = option.getText();
		    	if(text.equals("MySQL") || text.equals("Oracle"))
		    	{
		    		option.click();
		    	}
		    }
		    
		    
		    
		    
		
		    
		    
		    
 }

}
