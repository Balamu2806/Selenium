package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableConcept {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]//tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Row Count of the Table is : "+ rows.size());
		List<WebElement> column = table.findElements(By.tagName("th"));
		System.out.println("Row Count of the Table is : "+ column.size());
	}

}
