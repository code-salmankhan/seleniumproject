package mypac2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo2
{
	public static void main(String[] args)
	{
		
		//WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();
		
		//Open app
        driver.get("http://www.automationpractice.pl/index.php");
        
        driver.manage().window().maximize();
        
        
       // Find number of total Sliders on home page
       List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
       System.out.println("Total Number of Sliders : "+ sliders.size());
		
	   // find number of total images on home page
	   List<WebElement> images = driver.findElements(By.tagName("img"));
	   System.out.println("Total Number of Images : " + images.size());
	   
	   // find all the links on home page
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   System.out.println("Total Number of Links : " + links.size());
	   
	}

}