package mypc14;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks
{

	public static void main(String[] args) throws IOException 
	{
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " + links.size());
		
		int brokenlinks = 0;
		
		for(WebElement linkEle:links)
		{
			String hrefAttValue = linkEle.getAttribute("href");
			
			
			//Pre-requisite for checking broken links
			if(hrefAttValue==null || hrefAttValue.isEmpty())
			{
				System.out.println("href attribute is empty");
				continue;
			}
			
			//Checking links is broken or not
			URL linkurl = new URL(hrefAttValue); //Convert String --> URL format
			
			//send request to server - open, connect
			HttpURLConnection conn =(HttpURLConnection) linkurl.openConnection();
			
			
			conn.connect();
			
			
			if(conn.getResponseCode()>=400)
			{
			  System.out.println(hrefAttValue+"   " +"=======> Broken Link");
			  brokenlinks++;
			}
			else
			{
			  System.out.println(hrefAttValue+"   " +"=======> Not Broken Link");
			}
		
		}
		
		
		System.out.println("Total number of broken links : "+brokenlinks);
		
		

	}

}
