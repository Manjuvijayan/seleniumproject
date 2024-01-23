package testNGpgms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Practise {

	WebDriver driver=new ChromeDriver();
	@Test
	public void test()
	{
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		//WebElement atoc=driver.findElement(By.xpath("//*[contains(@class,'btn btn_primary btn_small btn_inventory ')]"));
		//Select addtocart =new Select(atoc);
		//addtocart.selectByValue("Add to cart");
		//atoc.click();
	List<WebElement> atc=driver.findElements(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']"));
	for(WebElement element:atc)
	{
		element.click();
	}
	
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("manju");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("v");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("691525");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	//Actions act=new Actions(driver);
	//WebElement mouse=driver.findElement(By.xpath("//*[@id=\\\"logout_sidebar_link\\\"]"));
//act.moveToElement(mouse).perform();
	driver.findElement(By.id("logout_sidebar_link)")).click();
	
	
	}
	 
	
}
