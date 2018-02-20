package pack1;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;





public class readxl {
public static void main(String[] args) throws  IOException, BiffException {
	File f=new File("C:\\Users\\user\\Documents\\ft.xls");
	Workbook wb=Workbook.getWorkbook(f);
	Sheet s=wb.getSheet(0);
	int rows=s.getRows();
	s.getRows();
	s.getColumns();
	//for(int i=0;i<=rows;i++) {
	String d=s.getCell(0,0).getContents();
	System.out.println(d);
	
}
}
