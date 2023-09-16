package Actionclass;

public class clickandhold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		package Actionclass;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class clicknhold {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
				driver.findElement(By.id("password")).sendKeys("Harish@125");
				Actions action = new Actions(driver);
				action.moveByOffset(1211, 298).clickAndHold().perform();

	}

}
