package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer

{

	
	
	int intcount = 0;
	int maxcount = 2;
	
	public boolean retry(ITestResult result) {
		
		if(intcount<maxcount)
		{
			intcount++;
			return true;
		}
		
		return false;
	}

	
	
}
