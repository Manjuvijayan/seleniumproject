package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alertpgm {
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	
	public void Alert() throws InterruptedException
	{
		driver.get("file:///C:/Users/sreej/OneDrive/Desktop/alertpage1.html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();	
		String alerttext=a.getText();
		Thread.sleep(3000);
		a.accept();
		System.out.println("alert text= "+alerttext);
		//a.dismiss();//for canceling alert
		driver.findElement(By.name("firstname")).sendKeys("manju");
		driver.findElement(By.name("lastname")).sendKeys("vijayan");
	}

}
