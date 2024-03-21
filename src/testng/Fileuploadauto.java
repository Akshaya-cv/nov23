package testng;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fileuploadauto {
   WebDriver driver;

       @BeforeTest
public void beforeTest()
{
	driver = new ChromeDriver();
}
@Test
public void main() throws IOException, Exception
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("D:\\autoit folder\\T1.au3");
	Thread.sleep(3000);
}
}
