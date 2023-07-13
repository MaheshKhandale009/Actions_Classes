package Read_Excel_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel 
{

	public static void name() throws IOException{
		FileInputStream fis=new FileInputStream("E:\\Excel\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet xs=wb.getSheetAt(0);
		int row=xs.getLastRowNum();
		int colom=xs.getRow(0).getLastCellNum();
		
		XSSFCell[] []arr =new XSSFCell[row+1][colom];
        for (int i = 0; i <=row; i++) 
        {
			for (int j = 0; j <colom; j++)
			{
				arr[i][j]=xs.getRow(i).getCell(j);
				
			}
		}
       
	}

	
}
