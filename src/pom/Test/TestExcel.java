package pom.Test;

import com.Twitter.Utils.Xls_Reader;

public class TestExcel {
 

	public static void main(String[] args)
	{
		//System.out.println(System.getProperty("user.dir"));
		Xls_Reader excel =new Xls_Reader("D:\\PomUsingPageFactory\\PomUsingFactory\\src\\com\\Twitter\\TestData\\testcase.xlsx");
		
		String sheetName="testdata";
		
		for(int rowNum=2; rowNum<=excel.getRowCount(sheetName);rowNum++)
		{
			//System.out.println(excel.getCellData(sheetName, "test_name", rowNum));
			//excel.getCellData(sheetName,"test_name", rowNum);
			//System.out.println(excel.getCellData(sheetName, "test_name", rowNum));
			
			if(excel.getCellData(sheetName, "runmode", rowNum).equalsIgnoreCase("y"))
			{
				System.out.println(excel.getCellData(sheetName, "test_name", rowNum));
			}
		}
	}

}
 