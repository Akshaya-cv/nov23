package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightAndDoubleclick 
{
		ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/simple_context_menu.html";

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void copypastemethd()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authenticate\"]/span"));
Actions act=new Actions(driver);
act.contextClick(rightclick).perform();
driver.findElement(By.xpath("//*[@id=\"authenticate\"]/ul/li[1]/span")).click();
driver.switchTo().alert().accept();

WebElement doublee=driver.findElement(By.xpath("//*[@id=\"authenticate\"]/button"));
act.doubleClick(doublee).perform();
Alert a=driver.switchTo().alert();
System.out.println("alerttext="+a.getText());
a.accept() ;

	}
	
}
