package ApachePOI;

import java.io.File;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
public class CreateAndWriteExcel {

	public static void main(String[] args) throws IOException {
//		XSSFWorkbook workbook =new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("Testsheet");
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Ajay");
//		sheet.getRow(0).createCell(1).setCellValue("Kumar");
//		
//		File file=new File("C:\\Automation\\myworkspace\\TestNGAutomation\\ExcelFiles\\Test.xlsx");
//		FileOutputStream FIS=new FileOutputStream(file);
//		workbook.write(FIS);
//		 workbook.close();
		 HSSFWorkbook workbook =new HSSFWorkbook();
			HSSFSheet sheet=workbook.createSheet("Testsheet");
			sheet.createRow(0);
			sheet.getRow(0).createCell(0).setCellValue("Ajay");
			sheet.getRow(0).createCell(1).setCellValue("Kumar");
			
			sheet.createRow(1);
			sheet.getRow(1).createCell(0).setCellValue("AJAY");
			sheet.getRow(1).createCell(1).setCellValue("KUMAR");
			
			File file=new File("C:\\Automation\\myworkspace\\TestNGAutomation\\ExcelFiles\\Test1.xls");
			FileOutputStream FIS=new FileOutputStream(file);
			workbook.write(FIS);
			 workbook.close();
		}

}
