package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MyDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		String str =null;
		System.out.println( 2);
		try{
			System.out.println(str.length());
		}
		catch(Exception e){
			System.out.println("catch thru finally");
		}
		
		System.out.println("after finally");
		//BaseSetup bs =new BaseSetup();
		//bs.baseSetup();
		//bs.f1();
	}
	
}
