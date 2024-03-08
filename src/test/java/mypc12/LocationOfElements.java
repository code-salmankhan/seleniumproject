package mypc12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocationOfElements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo =driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		driver.manage().window().maximize();
		System.out.println("After maximizing window :"+logo.getLocation()); //(630, 187)
		
		driver.manage().window().minimize();
		System.out.println("After maximizing window :"+logo.getLocation()); //(342, 156)
		
		driver.manage().window().fullscreen();
		System.out.println("After full screen : "+logo.getLocation()); //(630, 221)
		
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		
		System.out.println("new resolution : "+logo.getLocation());
		driver.close();

	}

}
