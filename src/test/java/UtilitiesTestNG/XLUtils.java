package UtilitiesTestNG;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
static XSSFWorkbook workbook;
static XSSFSheet sheet;

public XLUtils (String excelPath, String sheetName){
try {
	workbook= new XSSFWorkbook(excelPath);
	sheet = workbook.getSheet(sheetName);
}
catch(Exception e) {
	e.printStackTrace();
}
}
public static int  getRowCount() {
	int rowCount=0;
	try {
		rowCount=sheet.getPhysicalNumberOfRows();
		
	}
	catch (Exception exp) {
		exp.printStackTrace();
	}
	return rowCount;
}

public static   String getCellDtataString(int rowNum, int colNum ) {
	String cellData= null;
	try {
		 cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	catch(Exception exp) {
		exp.printStackTrace();
	}
	return cellData;
}

public static int getColCount() {
	int colCount= 1;
	try {
		 colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
	}
	catch (Exception exp) {
		exp.printStackTrace();
	}
	return colCount;
}


}



//static Workbook book;
//static Sheet sheet;
//public static String TESTDATA_SHEET_PATH = "C:/Users/snowg/eclipse-workspace/DsAlgoTestNG2/src/test/java/TestDataTestNG/DsAlgoRegisterdata.xlsx";
//
//
//public static Object [][]  getTestData(String sheetName) throws EncryptedDocumentException, IOException {
//	FileInputStream file = null;
//	try {
//		file = new FileInputStream(TESTDATA_SHEET_PATH);
//	
//	}
//	catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}
//	try {
//	book = WorkbookFactory.create(file);
//}
//	catch (IOException e) {
//		e.printStackTrace();
//	}
//	sheet = book.getSheet(sheetName);
//	Object[][] data =  new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//	for (int i=0; i<sheet.getLastRowNum(); i++) {
//		for (int k=0; k<sheet.getRow(0).getFirstCellNum(); k++) {
//			data[i][k] = sheet.getRow(i+1).getCell(k).toString();
//		}
//	}
//	return data;
//}

