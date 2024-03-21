package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadRobot {

	ChromeDriver driver;
	String baseurl=("https://www.ilovepdf.com/word_to_pdf");

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
		driver.get(baseurl);
}

@Test
public void fileuploadingpgm() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileUpload("D:\\akshaya\\seminaraug.docx");

}
public void fileUpload (String p) throws AWTException
{
	StringSelection strSelection = new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
Robot robot = new Robot();
robot.delay(3000);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyPress(KeyEvent.VK_ENTER);
//robot.delay(2000);



}
}
