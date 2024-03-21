package testng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
    ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void titleverification()
	{
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(exp,actualtitle);
		System.out.println("test1");
	}
}