package mypac4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String productname = driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
		//or xpath = //a[(normalize-space()='MacBook']
		
		
		System.out.println("Product name : "+ productname);
		
		
		 
	}

}
