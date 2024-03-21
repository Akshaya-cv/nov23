package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	String baseurl="https://www.amazon.in/";
	  
	@BeforeTest
	  public void beforeTest()
	  {
	  	driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  }
	
		
	
	@Test
	public void amazn() throws InterruptedException
	{
       	driver.get("https://www.amazon.in");
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("/*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("/*[@id=\'nav-search-submit-button\']")).click();
		String actualtitle=driver.getTitle();
		String exptitle="amazon in:Mobile phones";
		if(actualtitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("the title is present");
			
		}
		else
		{
			System.out.println("the title is not present");

			
	}
		String parentWindow = driver.getWindowHandle(); 
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span\r\n")).click();
				
			Set<String> allWindowHandles = driver.getWindowHandles();
	   	   for(String handle : allWindowHandles)
		   if(!handle.equalsIgnoreCase(parentWindow))
		   {
			   driver.switchTo().window(handle);
			   driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
			   driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		   }
	}
}   

