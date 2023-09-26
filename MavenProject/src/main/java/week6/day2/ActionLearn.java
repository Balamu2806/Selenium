package week6.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActionLearn {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
