package testNGpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdroppgm {
	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
	WebElement source=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement des=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	act.dragAndDrop(source, des);
	act.perform();
	WebElement source1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement des1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	act.dragAndDrop(source1, des1);
	act.perform();
	}
}
