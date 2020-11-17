

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class FbloginwithDataprovider {
	WebDriver driver;
	
	@Test(dataProvider="dp1")
	public void login(String Username,String Password)
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Class\\loaclrepo\\Seleniumclass\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("u_0_b")).click();
		driver.close();
	}

	@DataProvider
	public Object[][] dp1() throws BiffException, IOException
	{
		File f=new File("C:\\Users\\Akanksha\\Desktop\\Rani_test.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		Object ob[][]=new Object[r][c];
		for(int i=0; i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws.getCell(j, i);
				ob[i][j]=c1.getContents();
				
				
			}
		}
		
		return ob;
		
	}
	
}
