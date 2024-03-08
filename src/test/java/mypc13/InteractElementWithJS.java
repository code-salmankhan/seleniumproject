package mypc13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractElementWithJS {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement inputbox =driver.findElement(By.xpath("//input[@class='form-control']"));
		
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		WebElement radio_button = driver.findElement(By.xpath("//input[@class='form-check-input' and @id='male']"));
		
		js.executeScript("arguments[0].click();", radio_button);
		
	}

}
