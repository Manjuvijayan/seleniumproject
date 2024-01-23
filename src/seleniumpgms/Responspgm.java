package seleniumpgms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responspgm {
	ChromeDriver driver=new ChromeDriver();

	@Test
	public void Linkcount()
	
	{
		driver.get("http://www.google.com");
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("link count="+linkdetails.size());
		
		for(WebElement element:linkdetails)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
	}
		
		public void verify(String link)
		{
			try
			{
			URL u=new URL(link);
	HttpURLConnection	con	=(HttpURLConnection)u.openConnection();
		int r=	con.getResponseCode();
		System.out.println(r);
		
		if(r==200)
		{
			System.out.println("response code is 200");
			
		}
		else if(r==404)
		{
			System.out.println("response code is 404");
		}
		else
		{
			System.out.println("other responses");
		}
			
			}
			catch (Exception e)
			{
				
			}
	}
}
