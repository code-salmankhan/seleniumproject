package mypc11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://jqueryui.com/datepicker/");
	   
	   WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	   
	   driver.switchTo().frame(frame1);
	  
	   
	   //Approach 1
	   //driver.findElement(By.xpath("//input[@id='datepicker' or @class = 'hasDatepicker']")).sendKeys("03/05/2024");
	  
	   
	   
	   //Approach 2
	   String year = "2026";
	   String month = "April";
	   String date = "16";
	   int Int_year = Integer.valueOf(year);
	
	 driver.findElement(By.xpath("//input[@id='datepicker' or @class = 'hasDatepicker']")).click();
	   
	   while(true)
	   {
           String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();		   
           int Int_yr = Integer.valueOf(yr);
           
           String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	       
	       
	       if(yr.equals(year) && mon.equals(month))
	       {
	    	   break;
	       }
	       else	if(Int_year>Int_yr)
           {  
	    	   if(!mon.equals(month))
		       {
		    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e'][normalize-space()='Next']")).click();
		              
		       }  
		       else if(mon.equals(month))
		       {
		    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e'][normalize-space()='Next']")).click();  
		       }
           }
	       else	if(Int_year<Int_yr)
           {  
	    	   if(!mon.equals(month))
		       {
	    		   
		    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w'][normalize-space()='Prev']")).click();
		            
		       }  
		       else if(mon.equals(month))
		       {
		    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w'][normalize-space()='Prev']")).click();  
		       }
           }
	       else if(Int_year==Int_yr)
	       {
	    	   	
	    	   if(mon.equals("December"))
	    	   {
	    		      
	    		   for(int i=0;i<12;i++)
	    		   {
	    			   String mon2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			    	   
	    		    if(!mon2.equals(month))
	    		    {
	    			   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w'][normalize-space()='Prev']")).click();
		    		  
	    		    }
	    		   else if(mon2.equals(month))
	    		   {
	    			   i=13;
	    			   System.out.println("now"+mon2);
	    			   break;
	    		   }
	    		   } 
	    	   }
	    	   if(mon.equals("January"))
	    	   {
	    		   for(int j=0;j<12;j++)
	    		   {
	    			   String mon2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			    	   
	    		   if(!mon.equals(month))
	    	       {
	    			   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e'][normalize-space()='Next']")).click();
		    		}
	    		   else if(mon2.equals(month))
	    		   {
	    			   j=13;
	    			   System.out.println("now"+mon2);
	    			   break;
	    		   }
	    		   } 
	    	   } 
	    	   
	       }
	       
	       
	   }
	   
	   List<WebElement> AllDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	   
	   for(WebElement dt :AllDates)
	   {
		
		   if(dt.getText().equals(date))
		   {
			   dt.click();
			   break;
		   }
	   }
	   
		
		
	}

}
