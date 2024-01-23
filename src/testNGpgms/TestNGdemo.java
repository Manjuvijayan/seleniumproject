package testNGpgms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {

	ChromeDriver driver;

	@BeforeTest(alwaysRun = true)
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void url()
	{
		driver.get("https://automationexercise.com/login");
	}
	
	@Test(priority =3,groups= {"sanity"})
	public void test1()
	{
		System.out.println("test1");
		String s=driver.getTitle();
		if(s.equalsIgnoreCase("Automation Exercise - Signup / Login"))
		{
			System.out.println("title is as per expected");
		}
		else
		{
			System.out.println("title not expected");
		}
	}
			
	@Test(priority=2,enabled =false)
	public void test2()
	{
		System.out.println("test2");
		Boolean b=driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']")).isDisplayed();
		if(b)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		}
	@Test
	public void test3()
	{
		System.out.println("test3");
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));

		System.out.println("link count="+linkdetails.size());
	}
	@Test(priority=1)
	public void test4()
	{
System.out.println("test4");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("manju");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("manju@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
	}
	
	@AfterMethod
	public void aftermethddetails()
	{
		System.out.println("after method details");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("browser close");
		driver.close();
	}
}
