package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpgm {
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("manju@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("shfdg");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void exit()
	{
		driver.quit();
	}

}
