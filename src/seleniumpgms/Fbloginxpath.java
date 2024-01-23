package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbloginxpath {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		
	}
	
	@Test
	public void login()
	{
driver.get("http://www.facebook.com");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manju@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("manju");
driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
