package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSetup {

	public static WebDriver driver;
	public static WebDriverWait wait = null;

	public static void baseSetup() throws FileNotFoundException, IOException {

		System.out.println("launching chrome browser");
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Browsers\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("");*/
		System.setProperty("webdriver.chrome.driver", "//D:///Browsers//chromedriver.exe");
		driver = new ChromeDriver();// D:\test
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);

		driver.manage().window().maximize();
		//driver.get("http://www.bhu.ac.in/");
		/*WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
		w.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.id(""))));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("id")));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));*/
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
