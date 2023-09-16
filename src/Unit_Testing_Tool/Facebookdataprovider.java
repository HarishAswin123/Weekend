package Unit_Testing_Tool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebookdataprovider {
@DataProvider(name="cred")
public String[][] data () {
	String[][] sarr = {

	{"Shiva", "Kumar","9600601271", "Sairam@2311"},
	{"harish", "Aswin", "9791578968", "Shiv@123"},
	{"admin", "Yes", "7865435643", "Admin@234"},
	{"Giri", "Tharan", "7865432345", "Giri@4532"}
	};
	return sarr;
	
	}

@Test(dataProvider="cred")
public void fetch(String[] Credentials) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/signup");
	driver.findElement(By.name("firstname")).sendKeys(Credentials[0]);
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys(Credentials[1]);
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys(Credentials[2]);
	Thread.sleep(2000);
	driver.findElement(By.name("reg_passwd__")).sendKeys(Credentials[3]);
	Thread.sleep(2000);
	driver.quit();
	
}
	
}
