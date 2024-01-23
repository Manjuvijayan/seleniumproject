package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayxpath {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void ebay() throws InterruptedException
	{
		driver.get("http://www.ebay.com");
		String actual=driver.getTitle();
		System.out.println(actual);
		String s="ebay.com";
		if(s.equals(actual))
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("title not same");
		}
		
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();//shop by category
		driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td/ul/li[4]/a")).click();//art
		String sr=driver.getPageSource();
		if (sr.contains("Shop by Category"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		driver.findElement(By.xpath("//div[@class='b-visualnav__title']")).click();//art drawing
		driver.findElement(By.xpath("//*[@class='gh-cart-icon']")).click();//cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='actions multi-actions']/a[2]")).click();//start shoppin
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("books",Keys.ENTER);//books search
	}
	
		@After
		public void exit()
		{
			driver.quit();
		}
	}
