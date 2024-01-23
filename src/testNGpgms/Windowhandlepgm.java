package testNGpgms;

import java.util.Set;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlepgm {
ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
@Test
public void test() throws InterruptedException
{
	driver.get("https://demo.guru99.com/popup.php");
	
	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
     Set <String>  allwindowhandles= driver.getWindowHandles();
	for (String handle:allwindowhandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
			driver.close();
		}
	driver.switchTo().window(parentwindow);
	
	}
}


}
