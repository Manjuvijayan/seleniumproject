package testNGpgms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {

	
ChromeDriver driver;

@BeforeTest 
public void setUp()
{
	driver=new ChromeDriver();
	
}
@Test 
public void test() throws AWTException
{
	driver.get("https://www.ilovepdf.com/excel_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileUpload("C:\\Users\\sreej\\OneDrive\\Documents\\Book1.xlsx");
}

public void fileUpload(String p) throws AWTException
{
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);

Robot robot=new Robot();

robot.delay(3000);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);


}


}
