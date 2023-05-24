package Vow;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Write {
	String path = "C:\\Users\\Admin\\eclipse-workspace\\Testingselenium\\foldsele\\samp.xls";
	public  void wri() throws IOException {
		String name[]= {"naveen","krishna"};
	    File f = new File(path);
	    FileOutputStream fo= new FileOutputStream(f);
	    HSSFWorkbook work=new HSSFWorkbook();
	    Sheet out=work.createSheet("Sheet1");
	    Row rw=out.createRow(0);
	    for(int i=0; i<2;i++) {
	    	Cell c= rw.createCell(i);
	    	c.setCellValue(name[i]);
	    	
	    }
		work.write(fo);
		work.close();
		fo.close();
		System.out.println("Done......");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Write w=new Write();
		w.wri();
	}

}
