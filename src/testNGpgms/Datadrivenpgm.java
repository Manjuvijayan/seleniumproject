package testNGpgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenpgm {

	WebDriver driver;
	@BeforeTest 
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	
	public void test() throws IOException 
	{
		driver.get("http://www.facebook.com");
		
		FileInputStream f=new FileInputStream("C:\\Users\\sreej\\OneDrive\\Documents\\datadriven1.xlsx");
 XSSFWorkbook w=new XSSFWorkbook(f);
 XSSFSheet    s=w.getSheet("sheet1");
 int rowcount =s.getLastRowNum();
 for(int i=1;i<=rowcount;i++)
 {
	 String username=s.getRow(i).getCell(0).getStringCellValue();
	 System.out.println("usename="+username);
	 String pswd=s.getRow(i).getCell(1).getStringCellValue();
	 System.out.println("pswd="+pswd);
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("pass")).sendKeys(pswd);
	 driver.findElement(By.name("login")).click();
 }
	}
}
