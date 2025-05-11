package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		File file=new File("./src/test/resources/ExcelFiles/Test.xlsx");
		System.out.println(file.exists());
		FileInputStream fi=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheetAt(0);
//		String str=sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(str);
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowcount; i++) {
			XSSFRow row=sheet.getRow(i);
			
			int cellcount=row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellcount; j++) {
				XSSFCell cell=row.getCell(j);
				
			System.out.print("||"+getcellvalue(cell));
				
			}
			System.out.println();
		}
		
		workbook.close();
		fi.close();
	}
	public static String getcellvalue(XSSFCell cell)
	{
		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
			
        case BOOLEAN:
        	return String.valueOf(cell.getBooleanCellValue());
		
        case STRING:
        	return String.valueOf(cell.getStringCellValue());
		
		default:
			return String.valueOf(cell.getStringCellValue());
			
		}
	}

}
