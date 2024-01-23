package testNGpgms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandleamzn {
ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
public void test()
{
	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));

Set<String>allwindowhandle=driver.getWindowHandles();
for(String handle:allwindowhandle)
{
	if(!handle.equalsIgnoreCase(parentwindow))
	{
		driver.switchTo().window(handle);
		
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	}
}
driver.switchTo().window(parentwindow);
}
}
