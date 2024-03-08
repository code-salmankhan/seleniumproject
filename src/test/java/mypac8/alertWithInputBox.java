package mypac8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class alertWithInputBox 
{
	public static void main(String[] args) throws InterruptedException
	 {
	WebDriver driver = new ChromeDriver();	 
	 
	 WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	
     Alert alertWindow = mywait.until(ExpectedConditions.alertIsPresent());
     
     System.out.println("Message on alert Window  : " +alertWindow.getText());
     alertWindow.sendKeys("Welcome"); //Send message in alert box
     
     alertWindow.accept();

     String act_text = driver.findElement(By.xpath("//p[@id='result']")).getText();
     String exp_text = "You entered: Welcome";
     
     if(exp_text.equals(act_text))
     {
         System.out.println("Test Passed");
	 }
     else
     {
    	 System.out.println("Test Failed");
     }

 }
}
