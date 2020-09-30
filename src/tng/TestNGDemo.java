package tng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	static int a=1;

@Test(retryAnalyzer =tng.RetryTest.class)
public void getreTryTest()
{
	
		System.out.println("count :"+ a++);
	Assert.assertTrue(false);
}
}


