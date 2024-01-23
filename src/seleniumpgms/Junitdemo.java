package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void titleVerification()
	{
		String s=driver.getTitle();
		System.out.println(s);
	}
	
	@Test
	public void pagesrc()
	{
		String sr=driver.getPageSource();
		if (sr.contains("Gmail"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	@After

		public void exit()
		{
		driver.quit();
	}

}
