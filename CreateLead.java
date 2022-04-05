package steps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateLead extends BaseClass {
	
	@When("{string} Link is clicked")
	
	public void clickLink(String LinkText) {
		driver.findElement(By.linkText(LinkText)).click();

	}
	@Then("{string} Page is displayed")
	public void verifyPageDisplayed(String PageText) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+PageText+"']")).isDisplayed();
	System.out.println(displayed);
	}
	@And("Enter CompanyName as TCS")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

	}
	@And("FirstName as Hari")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");

	}
	@And("LastName as R")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

	}
	@When("Create Lead Button is Clicked")
	public void clickLeadButton() {
		driver.findElement(By.name("submitButton")).click();

	}
}
