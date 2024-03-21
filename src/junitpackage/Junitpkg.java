package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Junitpkg 
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
public void test()
{
	String exp="Facebook";
	String actualtitle=driver.getTitle();
	if(actualtitle.equals(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");

	}
}
	
	@After
	public void tearDown()
	{
	driver.quit();
	}
}



