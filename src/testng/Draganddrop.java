package testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;	

public class Draganddrop {
	 ChromeDriver driver;
		String baseurl="http://demo.guru99.com/test/drag_drop.html";

		
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
    public void DragnDropmethod() throws InterruptedException					
    {		
        				
        	  		
        	WebElement bank=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
            WebElement account=driver.findElement(By.xpath("//*[@id='bank']/li"));					
            WebElement fiveth=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
            WebElement amount=driver.findElement(By.xpath("//*[@id='amt7']/li"));					
            WebElement sales=driver.findElement(By.xpath("//*[@id='credit1']/a"));					
            WebElement salesaccount=driver.findElement(By.xpath("//*[@id='loan']/li"));					
            WebElement fiveth1=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
            WebElement amount1=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
            					
            Actions act=new Actions(driver);					
	        act.dragAndDrop(bank, account).perform();	
	        act.dragAndDrop(fiveth, amount).perform();	
	       act.dragAndDrop(sales, salesaccount).perform();	
	        act.dragAndDrop(fiveth1, amount1).perform();	
	        
           WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equals\"]"));	
           if(perfect.isDisplayed())
           {
        	   System.out.println("perfect button is displayed");
        	   
           }
           else
           {
        	   System.out.println("perfect button is not displayed");

        	   
           }

	        Thread.sleep(2000);
	        


	}		
@AfterTest
public void setdown()
{
	driver.quit();
}
}

