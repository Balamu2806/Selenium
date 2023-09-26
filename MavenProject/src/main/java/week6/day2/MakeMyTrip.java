package week6.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();
		driver.findElement(By.xpath("//span[text()='From City']//following::input[1]")).click();
		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='Enter City']"));
		Thread.sleep(1000);
		fromCity.clear();
		fromCity.sendKeys("Madurai",Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='Madurai, ']")).click();
		driver.findElement(By.xpath("//span[text()='From City']//following::input[2]")).click();
		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(1000);
		toCity.clear();
		toCity.sendKeys("Chennai",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dest-city-name']")).click();
		
		driver.findElement(By.xpath("//div[text()='October 2023']//following::p[text()='27']")).click();
		driver.findElement(By.xpath("//span[text()='Above 12 Years']//following::div[contains(@class,'minus')][1]")).click();
		driver.findElement(By.xpath("//span[text()='Above 12 Years']//following::div[contains(@class,'plus')][2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Above 12 Years']//following::li[text()=3]")).click();
		Thread.sleep(2000);
		
		WebElement applyButton = driver.findElement(By.xpath("//span[text()='Above 12 Years']//following::button[text()='APPLY']"));
		driver.executeScript("arguments[0].click();", applyButton);
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDropBy(driver.findElement(By.xpath("//div[@role='slider']")),100,200).perform();
		Thread.sleep(1000);
		a.dragAndDropBy(driver.findElement(By.xpath("//div[@role='slider'][2]")),100,25).perform();
		applyButton = driver.findElement(By.xpath("//span[text()='Flights']//following::button[text()='APPLY']"));
		driver.executeScript("arguments[0].click();", applyButton);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		//button[text()='SKIP']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		//driver.executeScript("arguments[0].click();", applyButton);
		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click(); 
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("ScreenShot/text.jpg"));
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
