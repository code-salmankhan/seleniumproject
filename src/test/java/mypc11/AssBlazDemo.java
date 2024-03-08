package mypc11;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssBlazDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//select[@name='fromPort' and @class='form-inline']")).click();
		
		List<WebElement> Dep_options =driver.findElements(By.xpath("//select[@name='fromPort']//option"));
		System.out.println(Dep_options.size());
		for(int i=0;i<Dep_options.size();i++)
		{
			System.out.println(Dep_options.get(i).getText());
			if(Dep_options.get(i).getText().equals("Portland"))
			{
				driver.findElement(By.xpath("/html/body/div[3]/form/select[1]/option[4]")).click();
			    break;
			}
			
		}
		
	
		
       List<WebElement> Dest_options =driver.findElements(By.xpath("//select[@name='toPort']//option"));
		
		for(WebElement Dest_optn:Dep_options)
		{
			if(Dest_optn.getText().equals("London"));
			{
				System.out.println(Dest_optn.getText());
				Dest_optn.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		List<WebElement> prices = driver.findElements(By.xpath("//tbody//tr//td[6]"));
		
		int i;
		double[] a = new double[prices.size()];
		
		
		for(i=0;i<prices.size();i++)
		{
			String str = prices.get(i).getText(); 
			String strNew = str.replace("$", "");
			System.out.println(strNew);
			a[i] = Double.parseDouble(strNew);
		}
		
		Arrays.sort(a);
		System.out.println("Smallest number : " + a[0]);
		String s = "$"+a[0];
		System.out.println(s);
		
         int j=1;
		for(i=0;i<prices.size();i++)
		{
			
			if(prices.get(i).getText().equals("$"+a[0]))
			{
				driver.findElement(By.xpath("//table//tr["+j+"]//td[1]")).click();
				break;
			}
			j++;
		}
		
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  Thread.sleep(5000);
	  driver.close();		
	}


}
