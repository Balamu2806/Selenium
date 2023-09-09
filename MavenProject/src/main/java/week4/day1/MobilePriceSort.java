package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePriceSort {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
	//	driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> links = driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<>();
		
		int low =0,rate;
		for (WebElement each : links) {
			
			String text = each.getText();
			rate = Integer.parseInt(text.replaceAll(",", ""));
			
			list.add(rate);
			
		}
				
//		Collections.sort(list);
//		
//		System.out.println(list);
//		
//		System.out.println("Lowest Price is : " + list.get(0));
		
		Set<Integer> set = new TreeSet<>(list);
		System.out.println("print List : " + list);
		
		System.out.println("Print Set :" +set);
		
		if (set.size()!= list.size()) {
			System.out.println("Duplicate Present");
		}else {
			System.out.println("Duplicate Not Present");
		}
			
		

		
	}

}
