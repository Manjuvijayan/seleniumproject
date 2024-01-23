package seleniumpgms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffchekavailbility {

	ChromeDriver driver=new ChromeDriver();
	
	
	@Test
	public void checkavail()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_detail");
		String buttontext=driver.findElement(By.xpath("//*[@value='Check availability']")).getAttribute("value");
	
		
		if(buttontext.equals("Check availability"))
			
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
