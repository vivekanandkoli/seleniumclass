package Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EXCEL_Col_Filter 
{

		public static final String EXCELFILELOCATION ="./testdata/RuleExcel.xlsx";
		
		private static FileInputStream fis;
		private static XSSFWorkbook workbook;
		private static XSSFSheet sheet;
		private static XSSFRow row;
		
		public static void loadExcel() throws Exception
		{
			System.out.println("Loadinf Excel data...");
			
			File file=new File(EXCELFILELOCATION);
			fis=new FileInputStream(file);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheet("RuleMaster");
			
			//fis.close();
		}
		
		public static Map<String,Map<String,String>>getDataMap()throws Exception
		{
			
			if(sheet==null)
			{
				loadExcel();
			}
			
			Map<String,Map<String,String>>superMap=new HashMap<String,Map<String,String>>();
			Map<String,String>myMap=new HashMap<String,String>();
			
			for(int i=1; i<sheet.getLastRowNum(); i++)
			{
				row=sheet.getRow(i);
				String keyCell=row.getCell(0).getStringCellValue();
				
				int colNum=row.getLastCellNum();
				for(int j=1; j<colNum ;j++)
				{
					String value=row.getCell(j).getStringCellValue();
					
					myMap.put(keyCell, value.toString());
				}
				superMap.put("MASTERDATA", myMap);
			}					
		return superMap;
		}
	
		public static String getValue(String key)throws Exception
		{
			Hashtable hashtable = new Hashtable();
			Map<String,String> myVal=getDataMap().get("MASTERDATA");
			hashtable.putAll(getDataMap().get("MASTERDATA"));
			
			System.out.println("Elements in Hashtable : " + hashtable);

			String retValue=myVal.get(key);
		
			return retValue;
		}
		
		public static void main(String[] args)throws Exception
		{
			
			
			System.out.println(getValue("BOLLORE LOGISTICS (THAILAND) CO. LTD."));

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
