package testNGpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadpgm {
	ChromeDriver driver;
	
	@BeforeTest
	 public void setUp()
	 {
		driver=new ChromeDriver();
	 }
	@Test
	
	public void test()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		//C:\\Users\\sreej\\OneDrive\\Documents\\Book1.xlsx
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("	C:\\\\Users\\\\sreej\\\\OneDrive\\\\Documents\\\\Book1.xlsx");
		//"C:\Users\sreej\OneDrive\Pictures\Screenshots\Screenshot (10).png"
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
