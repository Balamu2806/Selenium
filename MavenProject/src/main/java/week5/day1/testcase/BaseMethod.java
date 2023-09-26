package week5.day1.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseMethod {
	
	public RemoteWebDriver driver;
	
	@Parameters ({"browserName","url","userName","pwd"})
	@BeforeMethod
	public void launchLogin(String browserName, String url, String userName, String pwd) {
		if (browserName.equals("Chrome")) {
			System.out.println("chrome Browser");
			driver = new ChromeDriver();
		}else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		}else if (browserName.equals("FireFox")) {
			driver = new FirefoxDriver();
		}else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
	//	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		
		driver.quit();
		
	}
}
