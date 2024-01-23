package herbalpagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Herbalhealthpage {

	
WebDriver driver;

@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
WebElement health;
@FindBy(xpath="//*[@id=\"input-sort\"]")
WebElement sortby;
@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
WebElement sendenq;

@FindBy(xpath="//*[@id=\"Enquiry\"]")
WebElement enq;
@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
WebElement send;


public Herbalhealthpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void healthmethod()
{
	health.click();
}
public void sort()
{
	Select dropdown=new Select(sortby);
	dropdown.selectByVisibleText("A-Z alphabetical order");
}
public void enquiry()
{
	sendenq.click();
	enq.sendKeys("what");
	send.click();
}
}
