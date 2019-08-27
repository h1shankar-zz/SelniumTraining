package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSetup {

	public WebDriver driver;
	public WebDriverWait wait = null;

	public  void baseSetup() throws FileNotFoundException, IOException {

		System.out.println("launching firefox browser");
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Browsers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver.exe");
		driver = new FirefoxDriver();// D:\test

		wait = new WebDriverWait(driver, 60);

		driver.manage().window().maximize();

	}

	public void f1() throws InterruptedException {
		Actions action = new Actions(driver);
		System.out.println(" f1 test");

		driver.get("http://www.bhu.ac.in/");

		action.moveToElement(driver.findElement(By.xpath("//a[ text()='About Us']"))).build().perform();

		Thread.sleep(1000);
		driver.findElement(By.linkText("Founder")).click();

	}

}
