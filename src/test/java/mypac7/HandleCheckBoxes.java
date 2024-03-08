package mypac7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://artoftesting.com/samplesiteforselenium#");
		
		driver.manage().window().maximize();
		
		//Select 1 check box
		//driver.findElement(By.xpath("//*[@id=\'commonWebElements\']/form[2]/input[1]")).click();
		
		//Count all check box
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\'checkbox\']"));
	    System.out.println("Total number of checkboxes : " + checkboxes.size());
		
		//Select all check boxes
	   
	    for(int i=0;i<checkboxes.size();i++)
	    {
	    	checkboxes.get(i).click();
	    }
	    
	    Thread.sleep(4000);
	    
	    for(int i=0;i<checkboxes.size();i++)
	    {
	    	if(checkboxes.get(i).isSelected())
	    	{
	    		checkboxes.get(i).click();
	    	}
	    }
	    
	    //or we can use this to select all
	    /*
	    for(WebElement chkbox:checkboxes)
	    {
          chkbox.click();		
     	}
     	*/

}
}