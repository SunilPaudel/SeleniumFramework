package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFactory {
	
	//read the excel file and store the key, value in the hashtable
	public static Hashtable<String, String> excelValue = new Hashtable<String, String>();
	
	private static void readExcel() {
		
		//the excel sheet is located at src/test/resources
		//the name is obtained from config.properties
		String fileName = PropertiesFileFactory.getPropertyValue("excel");
		String filePath = "src/test/resources";
		File file = new File(filePath + "/" + fileName);
		Workbook workBook = null;
		
		try {
			
			InputStream input = new FileInputStream(file);
			
			//get the excel file extension name
			String fileExtension = fileName.substring(fileName.indexOf("."));
			
			if (fileExtension.equals(".xls")) {
				
				workBook = new HSSFWorkbook(input);
			} 
			else if (fileExtension.equals(".xlsx")) {
				
				workBook = new XSSFWorkbook(input);
			} 
			
			//now read the work sheet
			Sheet workSheet = workBook.getSheet("Data");
			
			int rowCount = workSheet.getLastRowNum() - workSheet.getFirstRowNum();
			
			for (int i = 0; i < rowCount + 1; i++) {
				
				Row row = workSheet.getRow(i);
				
				//currently we have only two cells/columns:: key->value and store them in a hashtable
				excelValue.put(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public static String getExcelValue(String key) {
		
		//just to make sure that the readExcel is read only once 
		//check if the hashtable is empty
		if (excelValue.isEmpty()) {
			
			readExcel();
		}
		
		return excelValue.get(key);
		
	}

}
