package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests{
	 static ChromeDriver driver;
	 @BeforeMethod
		
		public void preconditions() {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/");
			 driver.manage().window().maximize();

		}
		@AfterMethod
		public void postconditions() {
			driver.close();

	}
	}
	

