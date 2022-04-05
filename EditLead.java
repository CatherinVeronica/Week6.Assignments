package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	
	@And("Phone tab is clicked")
	public void clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@And("Enter the Phone Number as {string}")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);

	}
	@When("Find Leads Button is Clicked")
	public void clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@Then("{string} List is displayed")
	public void verifyListDisplayed(String ListResult) {
		boolean displayed = driver.findElement(By.xpath("//span[text()='"+ListResult+"']")).isDisplayed();
	System.out.println(displayed);
	}
	
	@When("Click First Lead Link")
	public void clickFirstLeadLink() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("{string} updated company Name")
	public void updateCompanyName(String updatedCompanyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatedCompanyName);

	}
	@And("Update Button is clicked")
	public void clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	
}
