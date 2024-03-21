package modulepackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurl=("https://www.google.com/");//url
		ChromeDriver Driver=new ChromeDriver();//to launch chrome browser
Driver.get(baseurl);
String src=Driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("Gmail text is present");
}
else
{
	System.out.println("Gmail text is not present");

	}
Driver.quit();
	}
}
