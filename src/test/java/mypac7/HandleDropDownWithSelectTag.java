package mypac7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleDropDownWithSelectTag 
{
  public static void main(String[] args)
  {
	  WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		
		//driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country-list']"));		
		Select drpCountry = new Select(drpCountryEle);
		
		//Select option from drop down
		drpCountry.selectByVisibleText("France");
		
		//or Select by value, if value attribute is there
		drpCountry.selectByValue("3");
		
		//Find total option in dropdown
		List<WebElement> options = drpCountry.getOptions();
		System.out.println("Number of Countries in option : " + options.size());
		
		System.out.println("\nCountry's options : ");
		for(int i=0;i<options.size();i++)
		{
		  System.out.println(options.get(i).getText());
		}
    }
}
