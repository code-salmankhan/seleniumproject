package mypc14;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting 
{
	public static void main(String[] args)throws InterruptedException
	{
	
			
	 //Approach 1 Headless mode
	 ChromeOptions options = new ChromeOptions();
	// options.setHeadless(true); //it is giving error but it should not
  
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(options);
	    
	   
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
	}
}
