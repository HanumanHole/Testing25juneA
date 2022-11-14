package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {


public static String readPropertyFile(String value) throws Exception
  {
	  Properties prop = new Properties();
	  FileInputStream file = new FileInputStream("D:\\Saurabh all\\Saurabh Eclipse\\Frame25juneA\\TestData\\config.proerty");
		prop.load(file);
	return prop.getProperty(value);
  }
   public static String readExcelFile(int rowNum,int colnum) throws Exception
   {
	   FileInputStream file = new FileInputStream("D:\\Saurabh all\\Saurabh Eclipse\\Frame25juneA\\TestData\\ReadData.xlsx");
      Sheet excel = WorkbookFactory.create(file).getSheet("ReadData");
     String value = excel.getRow(rowNum).getCell(colnum).getStringCellValue();
     return value;
   
   }

}
//.xls(older version)
//.xlsx(newer version)






