package StepDefinition_Sample;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class sample {
	WebDriver driver;
	 
	@Given("Launch Brower")
	public void launch_brower() {
		System.out.println("Open the Brower");
	}

	@Then("Search for Nokia Mobile")
	public void search_for_nokia_mobile() {
		System.out.println("Search for Mobile");
	    
	}

	@Then("Close Brower")
	public void close_brower() {
		System.out.println("Close the Browser");
	    
	}

	@Then("Search For Samsung Tv")
	public void search_for_samsung_tv() {
		System.out.println("Search for Tv");
	    
	}
	@When("Enter URL")
	public void enter_url() {
		System.out.println("Url page displayed");
	}


}
