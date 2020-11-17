package Driven;
//Data driven-used for passing multiple data to the for testcases
//Data Driven is a annotation used for the datadriven testing
//Data Driven is the annotation for TestNG

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class driven {
/*
	@Test(dataProvider="dp1")
	public void testcase1(String User,String Password)
	{
System.out.println(User);
System.out.println(Password);
	}
*/
	@Test(dataProvider="dp2")
	public void testcase2(String user,String password)
	{
System.out.println(user);
System.out.println(password);
	}
	
	
	
	@DataProvider
	public Object[][] dp1()
	{
		Object ob[][]=new Object[3][2];
		ob[0][0]="username1";
		ob[0][1]="Password1";
		ob[1][0]="username2";
		ob[1][1]="Password2";
		ob[2][0]="username3";
		ob[2][1]="Password3";
		return ob;
	}
	
	@DataProvider
	public Object[][] dp2() throws BiffException, IOException
	{
		File f=new File("C:\\Users\\Akanksha\\Desktop\\Testone.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		Object ob[][]=new Object[r][c];
		
		System.out.println("Value of Object= " +r + " & "  +c);
		
		for(int i=0;i<r;i++)
		{
			System.out.println(i);
			
			for(int j=0;j<c;j++)
			{
			
				Cell c1=ws.getCell(j, i);
				ob[i][j]=c1.getContents();
				System.out.println(i+ " & " + j+ " value = " + ob[i][j]);
			 System.out.println(j+"value of J");
			}
		}
				return ob;
	}
}
