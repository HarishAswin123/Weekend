package Unit_Testing_Tool;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Wipro {

	@Test
	public void Wipro()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("wipro page is launched", true);
		driver.quit();
		
	
		
		

	}

}
