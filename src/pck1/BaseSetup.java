package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSetup {

	public WebDriver driver;
	public WebDriverWait wait = null;

	public  void baseSetup() throws FileNotFoundException, IOException {

		System.out.println("launching chrome browser");
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Browsers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".//Resource//chromedriver.exe");
		driver = new ChromeDriver();// D:\test

		wait = new WebDriverWait(driver, 60);
		driver.get("http://www.bhu.ac.in/");
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
