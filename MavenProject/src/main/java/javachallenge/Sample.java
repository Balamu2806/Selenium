package javachallenge;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

		public ChromeDriver driver;
		@Test
		public void loginPage() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		


}
