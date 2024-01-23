package testNGpgms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadAutoit {

ChromeDriver driver;
	
	@BeforeTest
	 public void setUp()
	 {
		driver=new ChromeDriver();
	 }
	@Test
	
	public void test() throws InterruptedException, IOException
	{
		driver.get("https://www.ilovepdf.com/excel_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\sreej\\OneDrive\\Documents\\sample.exe");
	Thread.sleep(3000);
	}
}
