package seleniumpgms;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	
	public void Alert() throws InterruptedException, IOException
	{
		driver.get("file:///C:/Users/sreej/OneDrive/Desktop/alertpage1.html");
		//driver.findElement(By.xpath("//input[@type='button']")).click();
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s, new File("C:\\Users\\sreej\\OneDrive\\Desktop//Screenshotsdemo.png"));
WebElement button=driver.findElement(By.xpath("//input[@type='button']"));
File s2=button.getScreenshotAs(OutputType.FILE);
FileHandler.copy(s2, new File("./Screenshot/displaybutton.png"));
}
}