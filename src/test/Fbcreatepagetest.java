package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass
{
	//WebDriver driver;
	//@BeforeTest
	//public void setUp()
	//{
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
	//} use base classes so these are needed for instead we use base class
	@Test
	public void test2()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpageclick();
		String actualtitle=ob.titleverification();
		Assert.assertEquals(actualtitle, "createpage");
		ob.signupclick();
	}
}
