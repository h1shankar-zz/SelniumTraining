package tng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(tng.ListnersDemo.class)
public class ListnerTest {

	@Test()
	public void f1()
	{		
		System.out.println("f1");
		Assert.assertTrue(true);
	}
	
	@Test()
	public void f2()
	{		
		System.out.println("f2");
		Assert.assertTrue(false);
	}
}
