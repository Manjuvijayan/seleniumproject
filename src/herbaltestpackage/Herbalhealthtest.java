package herbaltestpackage;

import org.testng.annotations.Test;

import herbalpagepackage.Herbalhealthpage;
import testpackage.Baseclass;

public class Herbalhealthtest extends Herbalbaseclass{

	@Test
	public void health()
	{
		Herbalhealthpage ob=new Herbalhealthpage(driver);
		ob.healthmethod();
		ob.sort();
		ob.enquiry();
	}
}
