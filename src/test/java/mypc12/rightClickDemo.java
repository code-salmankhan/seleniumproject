package mypc12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().window().maximize();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral'][normalize-space()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();
		
		WebElement copy = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']//span"));
		act.moveToElement(copy).click().build().perform();
		
		driver.switchTo().alert().accept();
		
	}

}
