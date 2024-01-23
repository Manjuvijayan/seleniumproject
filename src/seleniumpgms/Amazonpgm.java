package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {

	ChromeDriver driver;
	
@Before
public void setUp()
{
	driver=new ChromeDriver();
	
}
	
@Test
public void test1()
{
	driver.get("https://www.amazon.in/");

driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
	driver.findElement(By.xpath("//*[@id='s-refinements']/div[2]/ul/li/span/a")).click();
}
}
