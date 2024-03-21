package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	//page factory
	//@FindBy(id="email")
	//WebElement fbemail;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		//pageFactory.initElements(driver, this);
	}
	public void setvalues(String username,String password)
	{
		driver.findElement(fbemail).sendKeys(username);
		driver.findElement(fbpassword).sendKeys(password);

	}
	public void loginclick()
	{
		driver.findElement(fblogin).click();
       //fblogin.click();
	}


}
