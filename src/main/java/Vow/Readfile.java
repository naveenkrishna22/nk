package Vow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile {
	
	String path="C:\\Users\\Admin\\eclipse-workspace\\Testingselenium\\foldsele\\samp.xls";
	public void read(String Sheet1) throws IOException {
		FileInputStream f= new FileInputStream(path);
		FileOutputStream f1= new FileOutputStream (path);
		HSSFWorkbook workbook = new HSSFWorkbook(f);
		//HSSFWorkbook workbook1 = new HSSFWorkbook();
		Sheet sh = workbook.getSheet(Sheet1);
		int rows=sh.getPhysicalNumberOfRows();
		for(int i=0;i<rows;i++) {
			Row eachRow=sh.getRow(i);
			int columns =eachRow.getLastCellNum();
			for(int j=0;j<columns;j++)
		{
				Cell eachCell= eachRow.getCell(j);
		
			System.out.print(Celltype(eachCell));
			
		}System.out.println(" ");
		
		}workbook.write();
		workbook.close();
		f1.close();
		System.out.println(" done...");
		System.out.println(f1);
		
		
	}
	public Object Celltype(Cell cellvalue) {
		if(cellvalue.getCellType().equals(CellType.STRING))
		{
		return cellvalue.getStringCellValue();
		}else if(cellvalue.getCellType().equals(CellType.NUMERIC))
		{
			//return cellvalue.getNumericCellValue();
			DataFormatter dataformatter= new DataFormatter();
			return dataformatter.getDefaultFormat(cellvalue).toString();
			}
			
		return null;
		
	}


public static void main(String[] a) throws IOException {
	Readfile r= new Readfile();
	r.read("Sheet1");
}
}