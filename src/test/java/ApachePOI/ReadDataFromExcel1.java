package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcel1 {
   @DataProvider
	public String[][] getdata() throws Exception  {

		File file = new File("./src/test/resources/ExcelFiles/Test.xlsx");
		System.out.println(file.exists());
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("Testsheet");
//			String str=sheet.getRow(0).getCell(0).getStringCellValue();
//			System.out.println(str);

		int numberofrows = sheet.getPhysicalNumberOfRows();
		int numberofcolumns = sheet.getRow(0).getLastCellNum();
		String [][] data=new String [numberofrows-1][numberofcolumns];
		for (int i = 0; i <numberofrows-1; i++) {
			for (int j = 0; j < numberofcolumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}

		workbook.close();
		fi.close();
		return data;
		
	}

}
