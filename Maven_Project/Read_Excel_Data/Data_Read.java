package Read_Excel_Data;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;


public class Data_Read
{

	public static void mffdsfsafafain(String[] args) throws IOException
	{

		FileInputStream fis = new FileInputStream("E:\\Excel\\Book1.xlsx");



		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//ThisWillSelectSheetEgSheet1Sheet2
		XSSFSheet sheet = wb.getSheetAt(0);
        //ThisWillSelect0ThRowToLastRow
		int rows = 	sheet.getLastRowNum();
		 //ThisWillSelect0ThCellToLastCell
		int cols = sheet.getRow(0).getLastCellNum();

		List<List<String>> list = new  ArrayList<List<String>>();

		String[][] arr =  new String[rows+1][cols];
		for(int r=0;r<=rows;r++)
		{
			//List<String> rowlist = new  ArrayList<String>();
			for(int c=0;c<cols;c++)
			{
				org.apache.poi.ss.usermodel.CellType ct =  sheet.getRow(r).getCell(c).getCellType();

				String value = sheet.getRow(r).getCell(c).getStringCellValue();

				System.out.print(" "+value);
				//rowlist.add(value);

				arr[r][c]=value;
			}
			System.out.println(""+list);
			//list.add(rowlist);

		}
		//	System.out.println(list);


		//System.out.println("in Array");
		//System.out.println(arr);

		for(int r=1;r<rows+1;r++)
		{
			for(int c=0;c<cols;c++)
			{
				System.out.print(" "+arr[r][c]);
			}
			System.out.println(" ");
		}

	}



}
