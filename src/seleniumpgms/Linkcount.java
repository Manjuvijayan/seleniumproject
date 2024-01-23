package seleniumpgms;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	}	
	@Test
	public void linkCount() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
	
	
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("link count="+linkdetails.size());
		for(WebElement element:linkdetails)
		{
			String link=element.getAttribute("href");
			String linktext=element.getText();
			System.out.println("link="+link);
			System.out.println("text="+linktext);
		}
	
	}
}
