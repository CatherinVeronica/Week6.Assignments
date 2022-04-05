package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	
//@Given("A chrome browser is launched")	
//public void openChromeBrowser()
// {
//	WebDriverManager.chromedriver().setup();
//	 driver = new ChromeDriver();
//	
//}
//@And("Load LeafTaps URL {string}")
//public void LoadURL(String url) {
//	driver.get(url);
//}
//
//@And("Maximize the browser")
//public void maximizeBrowser() {
//	driver.manage().window().maximize();
//
//}
@Given("Enter the username as {string}")
public void enterUsername(String username) {
	driver.findElement(By.id("username")).sendKeys(username);

}
@And("Enter the password as {string}")
public void enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);

}
@When("The login button is clicked")
public void clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();

}

@Then("Welcome Page is displayed")
public void welcomePage() {
	System.out.println("Welcome Page is displayed");

}








}
