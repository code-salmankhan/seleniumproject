package mypac6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		//same like driver.get("URL")
		driver.navigate().to("https://www.amazon.com.au/");
		
		Thread.sleep(5000);
		
		
		//same like driver.get("URL")
		driver.navigate().to("https://www.uniqlo.com/au/en/");
		
		Thread.sleep(5000);
		
		
		//navigate back on tab
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		//navigate forward on tab
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		//refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		
	}

}
