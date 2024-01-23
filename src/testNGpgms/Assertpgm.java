package testNGpgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertpgm {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
@Test
public void titleVerification() {
	String exp="google";
	String title=driver.getTitle();
	
    Assert.assertEquals(exp,title);//hard assertion
    System.out.println("hello");
}


}
