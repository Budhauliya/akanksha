package Driven;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/*Get data from Xl file*/

public class AA {
	
	public static void rani() throws BiffException, IOException {
		

		File f=new File("C:\\Users\\Akanksha\\Desktop\\Testone.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		Cell cell = ws.getCell(0,0);
		
		System.out.println(cell.getContents());
		
		
		
		System.out.println(r +"= Number of row" + c + "= Number of column");
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		AA.rani();
	}

}
