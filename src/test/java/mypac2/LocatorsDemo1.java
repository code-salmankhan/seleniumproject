package mypac2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsDemo1 
{
	public static void main(String[] args)
	{
		
		//WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();
		
		//Open app
        driver.get("http://www.automationpractice.pl/index.php");
        
        driver.manage().window().maximize();
        
        //find field and type text
        driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
        
        
        // Click search button 
        driver.findElement(By.name("submit_search")).click();
        
        
       // driver.findElement(By.linkText("Blouse")).click();
        driver.findElement(By.partialLinkText("Faded Short Sleeve")).click();
        
        
		
	}

}
