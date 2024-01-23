package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.Fbcreatepage;

public class Fbcreatetest extends Baseclass{

	

	@Test
	public void fbcreatepage()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpage();
		ob.getstarted();
		ob.getClass();
		ob.textcontains();
	}
}
