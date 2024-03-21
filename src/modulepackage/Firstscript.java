package modulepackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {
//ChromeDriver
//FirefoxDriver
//EdgeDriver	
	public static void main(String[] args) {
		ChromeDriver Driver=new ChromeDriver();//to launch chromr browser
		Driver.get("https://www.google.com/");//url
        String exp="Google";
        //title verify
        String actualtitle=Driver.getTitle();
        if(exp.equals(actualtitle))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");

        }
        Driver.quit();//full close
        //Driver.close();//one tab close
	}



}
