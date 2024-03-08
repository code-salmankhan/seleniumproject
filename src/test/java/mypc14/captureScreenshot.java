package mypc14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshot {

	public static void main(String[] args) throws IOException 
	{
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		//Capture full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("/Users/salmankhan/Documents/Coding/Eclipse/Project/seleniumproject/screenshots/fullpage1.png");  	
	    FileUtils.copyFile(src1, trg1);
	    
	    driver.get("https://demo.nopcommerce.com/");
	    
	    
	    File src2 = ts.getScreenshotAs(OutputType.FILE);
		File trg2 = new File("/Users/salmankhan/Documents/Coding/Eclipse/Project/seleniumproject/screenshots/fullpage2.png");  	
	    FileUtils.copyFile(src2, trg2);
	    
	    
	    //capture screenshot of specific area from web page
         WebElement featureproducts= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
         File src3 = featureproducts.getScreenshotAs(OutputType.FILE);
         File trg3 = new File("/Users/salmankhan/Documents/Coding/Eclipse/Project/seleniumproject/screenshots/fullpage3.png");
         FileUtils.copyFile(src3, trg3);
	    
	}

}
