package Unit_Testing_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tcs {

	WebDriver driver;
	@Test(groups="crm")
	public void tcs()
	{
		driver = new ChromeDriver();
		driver.get("https://www.tcs.com/");
		Reporter.log("TCS page is launched");
		driver.quit();

	}

}
