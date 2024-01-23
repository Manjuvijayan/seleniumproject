package testNGpgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebaypgm {

	ChromeDriver driver;
	
@BeforeTest 
public void setUp()
{
	driver=new ChromeDriver();

	
}

@Test
public void test() throws Exception
{	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("toys");
	driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"item26c4bc3fc8\"]/div/div[2]/a/div/span")).click();
	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("")).click();
	
     Set <String>  allwindowhandles= driver.getWindowHandles();
	for (String handle:allwindowhandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			
			//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
			driver.close();
		}
	driver.switchTo().window(parentwindow);
	
	}
}
}
