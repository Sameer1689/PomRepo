package pom.Test;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Twitter.Utils.Utility;
import com.Twitter.Utils.Xls_Reader;

public class Test1
{
@BeforeTest
public void isExcutable()
{
	Xls_Reader excel=new Xls_Reader("D:\\PomUsingPageFactory\\PomUsingFactory\\src\\com\\Twitter\\TestData\\testcase.xlsx");
	
	if(Utility.isExecutable("TwitMyProfile", excel))
		throw new SkipException("skiping the test case as the run mode is set to NO");
}

@Test
	public void testLogin()
	{
		System.out.println("excuting test login");
	}
}
