package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
 
	
@And("Get Lead ID from List")
	public final String getLeadID() {
	 String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	 return leadID;

	}
@When("Enter ID {string}")
public void enterLead(String leadID) {
 
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

}
@Then("No Records Displayed")
public void SearchResult() {
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equalsIgnoreCase("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}

}
}
