package mypc12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
	    WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
	    
	    System.out.println("Current Location of min slider : "+min_slider.getLocation());//(59,250)
	
	    act.dragAndDropBy(min_slider, 100,250).perform();
	    
	    System.out.println("Current Location of min slider : "+min_slider.getLocation());//(100,250)
		
        
	    WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	    
	    System.out.println("Current Location of min slider : "+max_slider.getLocation());//(767,250)
		
	    act.dragAndDropBy(max_slider, -200, 250).perform();
	    
	    System.out.println("Current Location of min slider : "+max_slider.getLocation());//(600,250)
		
		
	}

}
