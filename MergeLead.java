package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass {
	@When("From Lead Lookup is selected")
public void FromLeadLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
}
	@And("Enter First Name {string}")
	public void enterFirstName(String firstname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
	}
	
	@When("To Lead Lookup is selected")
	public void ToLeadLookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));

	}
	
	@When("Merge button is clicked")
	 public void clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

	}
	@And("Alert is accepted")
	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}
	
}
