package Vow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class New {
		String path="C:\\Users\\Admin\\eclipse-workspace\\Testingselenium\\foldsele\\samp.xls";
		public void write(String Sheet1) throws IOException {
			FileOutputStream f=new FileOutputStream(path);
			HSSFWorkbook work = new HSSFWorkbook(f);
			Sheet s=work.getSheet(Sheet1);
			int row=s.getPhysicalNumberOfRows();
			for(int i=row-1;i>=0;i--) {
				
			}
			
			
		}

	}