package junitpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;

public class LinkValidation {

	String link="https://www.google.com";
	
	@Test
	public void test()
	{
		try{
			URL u=new URL(link);
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			int code = con.getResponseCode();
			System.out.println(code);
		
		
			if(code==200)
			{
				System.out.println("response code is 200:succesfull");
			}
			else
			{
				System.out.println("response code is not expected");

			}
	
     }catch(Exception e)
		{
    	 System.out.println(e.getMessage());
		}
	}
}

	
	