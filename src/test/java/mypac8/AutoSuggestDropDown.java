package mypac8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown 
{
 public static void main(String[] args) throws InterruptedException
 {
	 ChromeDriver driver = new ChromeDriver();	 
	 
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	
	 Thread.sleep(5000);
	 
	 List<WebElement> presentations = driver.findElements(By.xpath("//div//span[contains(text(),'selenium')]"));
	 System.out.println("Total number of options : "+presentations.size());
	 
	 //print all options
	 for(int i=0;i<presentations.size();i++)
	 {
		 System.out.println(presentations.get(i).getText());
	 }
	 
	 //click one option
	 for(int i=0;i<presentations.size();i++)
	 {
		 String presentation = presentations.get(i).getText();
		 if(presentation.equals("selenium webdriver"))
		 {
			 presentations.get(i).click();
			 break;
		 }
	 }
	 
	 Thread.sleep(3000);
	 
	 
 }
}
