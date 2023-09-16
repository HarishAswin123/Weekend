package Unit_Testing_Tool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Google1 {

		
		@Test(groups="crm")
		public void googleCompany()
		{
			String title="Google - About Google, Our Culture & Company News";
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://about.google/");
			Reporter.log(driver.getTitle(),true);
			Assert.assertEquals(title, driver.getTitle(),"The page is not proper");
			driver.quit();
			
		}
		

	}
