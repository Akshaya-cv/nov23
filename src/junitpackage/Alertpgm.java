package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
                               
ChromeDriver driver;                       
String baseurl="file:///D:/alert.html"; 
@Before                                        
public void setup()                            
{                                              
driver = new ChromeDriver();               
driver.get(baseurl);                       
}                                              
@Test                                          
public void titleverification()                      
{   
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	 Alert a=driver.switchTo().alert();
	 String alerttext = a.getText();
     // System.out.println("alerttext="+alerttext);


	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("anu");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("cd");
	driver.findElement(By.xpath("/html/body/input[4]")).click();
	// oru window to next window pokan
		 //Alert a=driver.switchTo().alert();
		// a.accept();
		 //a.dismiss;//to cancel alert
		 //alert open cheythitii text open or verify cheyan text 
		 //String alerttext = a.getText();
	     // System.out.println("alerttext="+alerttext);

}
}

