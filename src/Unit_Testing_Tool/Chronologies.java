package Unit_Testing_Tool;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Chronologies {

	@BeforeSuite
	public void suiteFile1() {
		Reporter.log("Before suite", true);
		
		}
	
	@AfterSuite
	public void suiteFile() {
		Reporter.log("After suite", true);
		
		
	}
	@Test
	public void main() {
		Reporter.log("main method", true);
	}
	

}
