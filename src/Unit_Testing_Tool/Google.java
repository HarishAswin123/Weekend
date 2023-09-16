package Unit_Testing_Tool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Google {

		
		@Test(groups="crm")
		public void google()
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://about.google/");
			Reporter.log("Google is Launched",true);
			driver.quit();
			
		}
		

	}


