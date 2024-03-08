package mypac9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrameDemo1
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();	 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://ui.vision/demo/webtest/frames/");
		 driver.manage().window().maximize();
		 
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	    driver.switchTo().frame(frame1);
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1"); //frame 1
	   
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));		
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2"); //frame 2
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3"); //frame 3
		
		//inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='i5']/div[3]/div")).click();
		
		
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Frame4");//frame 4
		
        driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame5");//frame 4
		
	}

}
