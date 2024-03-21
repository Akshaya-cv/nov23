package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount 
{
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
@Before
public void setup()
{
	driver = new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void linkaccount()
{
	List<WebElement> linklist =driver.findElements(By.tagName("a"));
	System.out.println(linklist.size());
System.out.println("The number of links is " + linklist.size());
for (WebElement li : linklist)
{ 
	String link=li.getAttribute("href");
	String linktext=li.getText();
	System.out.println(link+"---------"+linktext); 
} 
}
}
