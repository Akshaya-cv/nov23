package testng;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;


import org.testng.annotations.Test;

public class Excerciseregistration {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/signup";

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		}

@Test
public void login() throws Exception
{

driver=new ChromeDriver();
driver.get("https://automationexercise.com/signup");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("aksh");
driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("trelesforextradingcompany@gmail.com");
driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");//password

//Select date of Birth
WebElement day = driver.findElement(By.xpath("//*[@id=\"days\"]"));
Select daydetails = new Select(day);
daydetails.selectByValue("2");

WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
Select monthdetails =new Select(month);
monthdetails.selectByValue("2");

WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
Select yeardetails =new Select(year);
yeardetails.selectByValue("1957");

//Fill address related details
driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("aksh");
driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("pp");
driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("technopark");
driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("souparnika house");
driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("arathi house");
driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("ernakulam");
driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("683529");
WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
Select countrydetails = new Select(country);
countrydetails.selectByValue("India");
driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("8799989768");
driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
 
}

}


