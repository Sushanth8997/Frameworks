package com.Practice.TestDataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider(name="loginTestData", parallel=true)
	public String[][] getdata() throws Exception {
		
		File excelFile=new File("C:\\Users\\susha\\eclipse-workspace\\farmeworkpractice\\src\\test\\resources\\Practice Sheet.xlsx");
		//System.out.println(excelFile.exists());
		FileInputStream file=new FileInputStream(excelFile);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet st= wb.getSheet("Test Data Sample");
		int noOfRows=st.getPhysicalNumberOfRows();
		int noOfRows2=st.getLastRowNum();
		int noOfColumns=st.getRow(0).getLastCellNum();
		System.out.println(noOfRows);
		System.out.println(noOfRows2);
		System.out.println(noOfColumns);
		
		String[][] data=new String[noOfRows-1][noOfColumns];
		for(int i=0;i<noOfRows-1;i++) {
			for(int j=0;j<noOfColumns;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(st.getRow(i+1).getCell(j));
				//System.out.println(df.formatCellValue(st.getRow(i).getCell(j)));
				//System.out.println(st.getRow(i).getCell(j).getStringCellValue());
			}
			//System.out.println();
		}
		wb.close();
		file.close();
		/*
		 * for(String[]dataArray:data) { System.out.println(Arrays.toString(dataArray));
		 * }
		 */
		return data;
	}

}
