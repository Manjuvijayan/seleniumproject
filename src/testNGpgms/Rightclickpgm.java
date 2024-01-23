package testNGpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickpgm {
	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
	     driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test 
	public void test() throws InterruptedException
	{
	 Actions act=new Actions(driver);
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(right);
		act.perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	edit.click();
	
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	Thread.sleep(3000);
	System.out.println("alert text= "+alerttext);
	a.accept();
	
WebElement doubleclick=	driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleclick);
	act.perform();
	Alert a1=driver.switchTo().alert();
	String alertmsg=a1.getText();
	Thread.sleep(3000);
	System.out.println("alert text= "+alertmsg);
	a1.accept();
	
	}
	
}
