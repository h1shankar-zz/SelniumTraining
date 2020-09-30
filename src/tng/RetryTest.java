package tng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer{

	int i=0;
	int count=5; 
	
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(i<count)
		{
			i++;
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
