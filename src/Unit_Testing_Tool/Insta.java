package Unit_Testing_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Insta {

	WebDriver driver;
	@Test
	public void Insta()
	{
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Reporter.log("Insta page is Launched", true);
		driver.quit();

	}

}
