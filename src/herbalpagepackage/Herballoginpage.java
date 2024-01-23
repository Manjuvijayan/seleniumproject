package herbalpagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herballoginpage
{

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/i")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginclick;
	
	public Herballoginpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	public void loginmethod()
	{
		myaccount.click();
		login.click();
		
	}
	public void details(String mail,String pass)
	{
		email.sendKeys(mail);
		pswd.sendKeys(pass);
		loginclick.click();
	}
}
