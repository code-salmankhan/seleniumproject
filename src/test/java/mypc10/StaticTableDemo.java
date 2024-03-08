package mypc10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo 
{
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1. Find total number of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of Rows : " + rows);
		
		
		//2. Find total number of columns
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of Columns : "+ columns);
		
		//3. Reading specific row & column data
		String SpecificData =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println("Specific data from Table : " + SpecificData);
		
		//For Header
		//4. Read all data from rows and columns
				
					for(int c=1;c<=columns;c++)
					{
						String Data =driver.findElement(By.xpath("//table[@name='BookTable']//th["+c+"]")).getText();
						System.out.print(Data + "\t");
					}
				
				System.out.println();
		
		
		//4. Read all data from rows and columns
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String Data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(Data + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		//5. Print Book whose author is Amit
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String Data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				
				if(Data.equals("Amit"))
				{
					String result =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println("Book Name :" + result);
				}
			}
		}
		
		
		
       
		
		//6. Find sum of prices of all books
		int price,total;
		total=0;
		for(int r=2;r<=rows;r++)
		{
			String Data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			price = Integer.valueOf(Data);
			total=total+price;
			
		}
	  System.out.println("Total of prices : "+total);
		
	}

}
