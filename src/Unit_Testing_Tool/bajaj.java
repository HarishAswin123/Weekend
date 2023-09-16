package Unit_Testing_Tool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bajaj {

		
		@Test(groups="crm")
		public void google()
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://www.bajaj.com/");
			Reporter.log("bajaj is Launched",true);
			driver.quit();
			
		}
		

	}
