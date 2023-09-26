package week6.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		//clear and input  from station
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai Egmore",Keys.ENTER);
		//clear and input the to station
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Madurai Jn",Keys.ENTER);
		
		//click on the Get Train
		driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		String text;
		for (int i = 1; i <=rowCount; i++) {
		text =	driver.findElement(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2])["+i+"]")).getText();
		System.out.println(text);	
		}
		
	}

}
