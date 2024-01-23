package seleniumpgms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumpgm {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();//to launch browser
	driver.get("http://www.facebook.com");
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	
	String s="Facebook – log in or sign up";
	if(s.equals(actualtitle))

	{
		System.out.println("title is same");
	}
	else
	{
		System.out.println("title not same");
		
	}
	driver.quit();
	}

}
