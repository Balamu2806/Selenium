package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLink {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			
			String text = links.get(i).getText();
			
			System.out.println(text);
			
			
		}
		List<String> list = new ArrayList<>();
		for (WebElement each : links) {
			
			String text = each.getText();
			list.add(text);
			
		}
		
		//to sort the values in the list by using collections class
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
