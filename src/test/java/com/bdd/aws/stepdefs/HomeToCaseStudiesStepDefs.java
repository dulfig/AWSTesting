package com.bdd.aws.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import com.bdd.aws.controller.AWSController_Home;

public class HomeToCaseStudiesStepDefs {
	
	private WebPage state;
	WebDriver driver;
	AWSController_Home AWSController_home;

	public HomeToCaseStudiesStepDefs(WebPage state) {
		this.state = state;
		this.state.driver = driver;
	}
	
	@Given("I am on the above page")
	public void verifyCurrentPage() {
		
		// verify URL
		Assert.assertEquals("https://aws.amazon.com/", state.driver.getCurrentUrl());
		// verify title
		Assert.assertEquals("Amazon Web Services (AWS) -  Cloud Computing Services", state.driver.getTitle());
		
	}
	
	@When("I click on the Amazon EC2 link")
	public void clickOnAmazonEC2Link() {
		
		AWSController_home = new AWSController_Home();
		AWSController_home.setUp(state.driver);
		AWSController_home.toPage();
		
	}
	
	@Then("I am brought to a page that has Case Studies")
	public void verifyRedirectionToCaseStudiesPage() {
		
		// verify URL
		Assert.assertEquals("https://aws.amazon.com/ec2/?hp=tile&so-exp=below", state.driver.getCurrentUrl());
		// verify title 
		Assert.assertEquals("Amazon EC2", state.driver.getTitle());
		
	}

}
