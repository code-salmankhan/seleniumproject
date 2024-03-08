package mypc13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage
{

	public static void main(String[] args) throws InterruptedException
	{
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
         
		//scroll down by pixel
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//scroll down the page till find the element
		WebElement US_flg = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div[185]/div/a/img"));
		 js.executeScript("arguments[0].scrollIntoView()",US_flg);
		 
		 Thread.sleep(3000);
		 
		 //go back to initial position
		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
