package mypc13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboradActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Welcome to Automation");
		
		Actions act = new Actions(driver);
		
		//alt+a
		act.keyDown(Keys.ALT).sendKeys("a").keyUp(Keys.ALT).perform();
		
		
		//alt+c
		act.keyDown(Keys.ALT).sendKeys("c").keyUp(Keys.ALT).perform();		
		
		
		//tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//act.sendKeys(Keys.TAB).perform();
		
		
		//alt+v
		act.keyDown(Keys.ALT).sendKeys("v").sendKeys(Keys.ALT).perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.findElement(By.xpath("//*[@id=\"target\"]"));
		
		act.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).perform();
		
	}

}
