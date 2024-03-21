package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiff {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
		driver.get(baseurl);
}
@BeforeMethod
public void urlloading()
{
	driver.get(baseurl);
}
@Test
public void contentverification()
{
	String src=driver.getPageSource();
if(src.contains("fullname"))
{
	System.out.println("Full name label is present");
}
else
{
	System.out.println("Full name is not present");

}
}
@Test
public void buttonverification()
{
	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
  if(buttontext.equals("create my account")) 
  {
	  System.out.println("pass");
	  }
	  else
	  {
	  	System.out.println("fail");

	  }
}
}
	  

