package seleniumpgms;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercise {

ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://automationexercise.com/login");
	}	
	
	@Test
	
	public void tes1()
	{
		//driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
String s=driver.getTitle();
System.out.println(s);
if(s.equalsIgnoreCase("Automation Exercise - Signup / Login"))
{
	System.out.println("same logo");
}
else
{
	System.out.println("not same");
}

	}
	
	@Test
	
	public void test2()
	{
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));

	System.out.println("link count="+linkdetails.size());
	}
 
	@Test
	
	public void test3()
	{
	
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("manju");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("manju@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
	driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("manju");
		WebElement day=driver.findElement(By.xpath("//*[@id='days']"));
		Select daydetails=new Select(day);
		daydetails.selectByVisibleText("2");
		WebElement month=driver.findElement(By.xpath("//*[@data-qa='months']"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("1");
		WebElement year=driver.findElement(By.xpath("//*[@data-qa='years']"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2014");
		driver.findElement(By.xpath("//*[@data-qa='first_name']")).sendKeys("manju");
		driver.findElement(By.xpath("//*[@data-qa='last_name']")).sendKeys("vijay");
		driver.findElement(By.xpath("//*[@data-qa='company']")).sendKeys("cts");
		driver.findElement(By.xpath("//*[@data-qa='address']")).sendKeys("L7");
		driver.findElement(By.xpath("//*[@data-qa='address2']")).sendKeys("jewel");
		WebElement country=driver.findElement(By.xpath("//*[@id='country']"));
		Select countryname=new Select(country);
		 countryname.selectByVisibleText("India");
		 driver.findElement(By.xpath("//*[@data-qa='state']")).sendKeys("kerala");
			driver.findElement(By.xpath("//*[@data-qa='city']")).sendKeys("kochi");
			driver.findElement(By.xpath("//*[@data-qa='zipcode']")).sendKeys("691525");
			driver.findElement(By.xpath("//*[@data-qa='mobile_number']")).sendKeys("6915250876");
			driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
	}
	 
	
}
