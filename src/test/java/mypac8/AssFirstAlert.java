package mypac8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssFirstAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();	 
		 
		 WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
		 
		 
		 WebElement button = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Click for JS Alert')]")));
		 button.click();
		 
		 Thread.sleep(3000);
		 
		 Alert myAlert = mywait.until(ExpectedConditions.alertIsPresent());
		 
		System.out.println("Pop message : "+ myAlert.getText());
		
		myAlert.accept();
		 
		 
	}

}
