package Day_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;

public class rule_finder {

	private static FileInputStream fis=null;
	private static FileOutputStream fos=null;
	private static HSSFWorkbook workbook=null;
	private static HSSFSheet sheet=null;
	public HSSFRow row=null;
	public HSSFCell cell=null;
	public static int lastrowno=0;
	
	public static final String xlFilePath="E:\\Selenium_Class\\Selenium_test\\testdata\\RuleExcel.xls";
	
	public static void loadExcel() throws Exception
	{
	File file=new File(xlFilePath);
	fis=new FileInputStream(file);
	workbook=new HSSFWorkbook(fis);
	sheet=workbook.getSheet("RuleMaster");
	lastrowno=sheet.getLastRowNum();
	fis.close();
	
	}
	public static void main(String[] args) throws Exception
	{
		int i=0;
		
		if(sheet==null)
		{
			loadExcel();
		}
		String Prefix ="010";
    	String OrganizationName="SIAM KARGO LOGISTICS CO LTD";
    	rule_finder rf=new rule_finder();
    	for(i=1; i<lastrowno; i++)
    	{
    		String OrgName=rf.getCellData("RuleMaster", "Agent_Name",i);
    		if(OrganizationName.equals(OrgName))
    		{
    			for(int j=i; j<lastrowno; j++)
    			{
    				String Pref=rf.getCellData("RuleMaster", "Prefix",j);
    				OrgName=rf.getCellData("RuleMaster", "Agent_Name",j);
    				if(OrganizationName.equals(OrgName))
    				{
    					if(Prefix.equals(Pref))
    					{
    						String RuleName=rf.getCellData("RuleMaster", "Rule_Name",j);
    						
    						String UpdatedRule=RuleName+"_"+Prefix;
    						System.out.println(UpdatedRule);
    						j=lastrowno;
    						i=lastrowno;
    					}    				
    				}
    				else
    				{
    					System.out.println();
    					j=lastrowno;
						i=lastrowno;
    				}
    			}
    		}
    		
    	}
	
	}
	
	
	public String getCellData(String sheetName, String colName, int rowNum) 
	{
		try
		{
			int colNum=-1;
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++)
			{
				if(row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum=i;
			}
			row=sheet.getRow(rowNum);
			cell=row.getCell(colNum);
			

			if(cell.getCellTypeEnum()==CellType.STRING)
				return cell.getStringCellValue();
			else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA) 
			{
				String cellValue=String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					DateFormat dt=new SimpleDateFormat("dd/mm/yy");
					java.util.Date date=cell.getDateCellValue();
					cellValue=dt.format(date);
				}
				return cellValue;
				
			}
			else if(cell.getCellTypeEnum()== CellType.BLANK)
				return"";
			else
				return String.valueOf(cell.getBooleanCellValue());				
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return"data not found";
		}
		
			
	}
}
