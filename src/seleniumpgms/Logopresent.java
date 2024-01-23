package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logopresent {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	}	

	@Test
	
	public void test() throws InterruptedException
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement logo=	driver.findElement(By.xpath("//*[@title='Rediff.com']"));
	Boolean b=logo.isDisplayed();
	if(b)
	{
		System.out.println("present");
	}
	
	else
	{
		System.out.println("not present");
	}
}
	
	
}
