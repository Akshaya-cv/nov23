package junitpackage;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	    ChromeDriver driver;
		String baseurl="https://www.facebook.com";
	   
		@Before
	   public void setup()
	   {
			driver=new ChromeDriver();
			driver.get(baseurl);
	   }
		@Test
		public void fblogin()
		{
			//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			//driver.findElement(By.name("pass")).sendKeys("asw");
			//driver.findElement(By.name("login")).click();
			
			//Relative path creation
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath(" //input[@type='password']")).sendKeys("asw");
			driver.findElement(By.xpath("//button[@name='login]")).click();

		

	}

}
