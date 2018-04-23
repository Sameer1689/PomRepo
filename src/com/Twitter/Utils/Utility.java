package com.Twitter.Utils;

public class Utility {

 public static boolean isExecutable(String test_name, Xls_Reader excel)
 {

				String sheetName="testdata";
		
				for(int rowNum=2; rowNum<=excel.getRowCount(sheetName);rowNum++)
		{
				if(excel.getCellData(sheetName, "test_name", rowNum).equals(test_name))
			{
				
			}
			
				if(excel.getCellData(sheetName, "runmode", rowNum).equalsIgnoreCase("y"))
			
				return true;
				else
				return false;
			
		}
 
				return false;
 }
}
