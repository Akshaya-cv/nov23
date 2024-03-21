package testng;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;


public class Testngdemo {
	
	//@beforesuite
	//@beforetest
	//@beforeclass
	//@beforemethod
	//@test
	//@aftermetod
	//@afterclass
	//@aftertest
	//@aftersuite
	
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url loading");
	}
	public void test1()
	{
		System.out.println("test1");
	}
	public void test2()
	{
		System.out.println("test2");
	}
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermethd()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void browserquit()
	{
		System.out.println("close browser");
	}


	
	
}
