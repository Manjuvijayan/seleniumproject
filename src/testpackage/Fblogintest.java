package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.Fbloginpage;

public class Fblogintest extends Baseclass{

		@Test
	public void testlogin() 
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("manjuvijayan86@yahoo.in", "manjuv1990");
		ob.login();
	}
}
