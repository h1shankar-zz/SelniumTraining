package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PopUpAuth extends BaseSetup
 {

	//BaseSetup bs;
	//public WebDriver driver;
	@BeforeTest
	public static void setUp() throws FileNotFoundException, IOException
	{
		BaseSetup.baseSetup();
	}
	//@Test
	public void f1() throws InterruptedException
	{
		//driver.get("sebipaclrefund.co.in/Home/");
		driver.get( "https://artoftesting.com/samplesiteforselenium");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Manual']"))).build().perform();
		act.moveToElement(driver.findElement(By.partialLinkText("What"))).click().perform();;
		
		Thread.sleep(3000);
	}
@Test
public void checkMenuNav()
{
	//driver.get("https://www.google.com/");
     driver.get("https://demoqa.com/datepicker/");
	 JavascriptExecutor jse = (JavascriptExecutor)(driver);
	// jse.executeScript(arg0, arg1)
	
	driver.switchTo().frame("");
	
}

@Test()
public void chekBoxex() throws InterruptedException
{
	driver.get("http://www.ironspider.ca/forms/checkradio.htm");
	List<WebElement> lst = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int l= lst.size();
	for(int i=0;i<l;i++)
	{
		lst.get(i).click();
		Thread.sleep(1000);
	}
	
}
@Test()
public void testWindowHandlers()
{
	driver.get("https://www.naukri.com/");
	Set<String> st= driver.getWindowHandles();
	System.out.println(st.size());
	String str1=driver.getWindowHandle();
	System.out.println("parent :"+str1);
	/*for(String str: st)
			{
		System.out.println(str);
			}*/
	driver.switchTo().window("CDwindow-D5636498AEC99175C4AB9C974073C682");
	driver.switchTo().defaultContent();
	//driver.ge
	//driver.switchTo().window(st.)
}
@Test(invocationCount=3)
public void testInvocation()
{
   System.out.println("testInvocation"); 	
}

@AfterMethod
public void f2(ITestResult r)
{
	System.out.println("f2"+ r.isSuccess());
}
@AfterTest
public void tearDown()
{
	
	driver.quit();
}
 }
