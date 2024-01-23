package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbcreatepage;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
WebElement fbgetstarted;
	
	@FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
	WebElement containscreatepage;
	
	public Fbcreatepage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

public void createpage()
{
	fbcreatepage.click();
	
}
public void textcontains()
{
	String exp="Create a Page";
	String act=driver.getPageSource();
	if(act.contains(exp))
	{
	System.out.println("present");
	}
	else
	{
		System.out.println("not present");
	}
}
public void getstarted()
{
	fbgetstarted.click();
}

}
