package pe.edu.galaxy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;


@Listeners({ pe.edu.galaxy.SuiteListeners.class})
public class MultiBrowser {

	WebDriver driver = null;

	@Parameters("BrowserName")
	@BeforeTest
	public void setUp(String BrowserName) {

		System.out.println("This test is running on: " + BrowserName );
		
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BrowserName.equalsIgnoreCase("opera")) {
			driver = new OperaDriver();
		}

	}

	@Test
	public void openUrl() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = { "openUrl" })
	public void search() {
		driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys(Keys.ENTER);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
