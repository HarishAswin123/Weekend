package Unit_Testing_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameters {

	
		// TODO Auto-generated method stub

			@Test(dependsOnMethods="Facebook")
			public void DemoWebshop() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("DemoWebshop page is opened", true);
			driver.quit();
		}
			@Test(priority=12)
			public void Facebook()
			{
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Reporter.log("Facebook page is opened",true);
				driver.quit();
			}
			
			@Test(enabled=false)
			public void instagram()
			{
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.instagram.com/");
				Reporter.log("Instagram page is opened",true);
				driver.quit();
			}
			
			@Test(priority=10)
			public void Zomato()
			{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zomato.com/");
			Reporter.log("Zomato page is opened", true);
			driver.quit();
		}

		@Test(invocationCount=2, threadPoolSize=2)
		public void Swiggy()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.swiggy.com/");
			Reporter.log("Swiggy page is opened", true);
			driver.quit();
			
		}

			
			
			
				
				

			




	

}
