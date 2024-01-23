package testNGpgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookingdatepicker {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.booking.com/index.en-gb.html?"
				+ "label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4Au6ijKwGwAIB0gIkZjE2NTVjZTEtNDgyZi00ZDgzLTg2M2ItOTkxOTI4NWM4ZGVi2AIF4AIB&sid=e93e211072b3536eddca45a86dc3033e&keep_landing=1&sb_price_type=total&");
	}
	@Test
	public void datepickertest()
	{
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]/span")).click();
	 datepickermethod("January 2024","15");
	 ////*[@id="indexsearch"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span
	}
	
	public void datepickermethod(String expmonth,String expdate)
	{
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		if (month.equals(expmonth))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
		}
		}
	////*[@id="calendar-searchboxdatepicker"]/div/div[1]/div/div[1]/table/tbody/tr[4]/td[6]/span/span
	List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/span/span"));
	for(WebElement  dateelement:alldates)
	{
		String date=dateelement.getText();
		if(date.equals(dateelement))
		{
			dateelement.click();
			break;
		}
	}
	
	}
}
