package mypac8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;


public class AssRediffEmailAlert 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();	
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		WebElement SignIn = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit' or @name='proceed']")));
		SignIn.click();
		
		Alert myAlertBox =mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Message on Alert Box : " +myAlertBox.getText());
		
		Thread.sleep(3000);
		
		myAlertBox.accept();
		
		
	}

}
