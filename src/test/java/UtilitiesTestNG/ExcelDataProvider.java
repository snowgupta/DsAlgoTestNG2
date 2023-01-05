package UtilitiesTestNG;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	
	
	@DataProvider(name="regdata")
public  Object[][] getData() {
		String excelPath = "C:\\Users\\snowg\\eclipse-workspace\\DsAlgoTestNG2\\src\\test\\java\\TestDataTestNG\\DsAlgoRegisterdata.xlsx";
	Object data[][]=	testData(excelPath, "Sheet1");
	
return data;
	}
public  Object[][] testData(String excelPath, String sheetName) {
	//XLUtils excel = new XLUtils(excelPath, sheetName);
int rowCount = XLUtils.getRowCount();
int colCount= XLUtils.getRowCount();
Object data[][]= new Object[rowCount-1][colCount];

for(int i=1; i<rowCount; i++) {
	for (int j=0; j<colCount; j++) {
	String cellData =	XLUtils.getCellDtataString(i, j);
	data[i-1][j]= cellData;	
	}
	
}
return data;
}
}


