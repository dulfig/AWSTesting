package com.bdd.aws.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import com.bdd.aws.controller.AWSController_Home;

public class HomeToCaseStudiesStepDefs {
	
	AWSController_Home AWSController_home;
	
	@Given("I am on the above page")
	public void verifyCurrentPage(WebDriver driver) {
		
		// verify URL
		Assert.assertEquals("https://aws.amazon.com/", driver.getCurrentUrl());
		// verify title
		Assert.assertEquals("Amazon Web Services (AWS) -  Cloud Computing Services", driver.getTitle());
		
	}
	
	@When("I click on the Amazon EC2 link")
	public void clickOnAmazonEC2Link() {
		
		AWSController_home = new AWSController_Home();
		AWSController_home.toPage();
		
	}
	
	@Then("I am brought to a page that has Case Studies")
	public void verifyRedirectionToCaseStudiesPage(WebDriver driver) {
		
		// verify URL
		Assert.assertEquals("https://aws.amazon.com/ec2/?hp=tile&so-exp=below", driver.getCurrentUrl());
		// verify title 
		Assert.assertEquals("Amazon EC2", driver.getTitle());
		
	}

}
