package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUpAuth
 {

	BaseSetup bs;
	@BeforeTest
	public void setUpBase()
	{
		bs =new BaseSetup();
	}
	
	@Test
	public void f1()
	{
		bs =new BaseSetup();
		try {
			bs.baseSetup();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bs.driver.get("sebipaclrefund.co.in/Home/");
	}
}
