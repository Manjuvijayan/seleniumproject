package herbaltestpackage;



import org.testng.annotations.Test;

import herbalpagepackage.Herballoginpage;

public class Herballogintest extends Herbalbaseclass {

	@Test
	public void herballogin()
	{
	Herballoginpage ob=new Herballoginpage(driver);
	ob.loginmethod();
	ob.details("manjuvijayan14@gmail.com","Deva1234");
	
	
	}
}
