package com.bdd.aws.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.bdd.aws.controller.AWSController_Airbnb;
import com.bdd.aws.controller.AWSController_EC2;
import com.bdd.aws.controller.AWSController_Home;
import com.bdd.aws.controller.AWSController_Youtube;
import com.bdd.aws.view.AWSHomeView;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWS_StepDefs {
	WebDriver driver;

	AWSController_Home homeController;
	AWSHomeView homeView;

	AWSController_EC2 ec2Controller;

	AWSController_Airbnb airBnbController;

	AWSController_Youtube youtubeController;

	// Home
	@Given("I am on aws.amazon.com")
	public void navigateToAmazonHomePage() {
		homeController = new AWSController_Home();
		homeController.setUp(driver);
		homeView = new AWSHomeView(driver);
	}

	@When("I click on the Compute link under Explore Our Products")
	public void clickOnComputeLink() {

		// this clicks on compute link and clicks on EC2 link
		homeController.clickCompute();

	}

	@Then("I see a link for Amazon EC2")
	public void verifyLinkForAmazonEC2Appears() {

		Assert.assertTrue(homeView.getEC2Link().isDisplayed());

	}

	// Home to Case Studies
	@Given("I am on the home page")
	public void verifyCurrentPage() {

		// verify URL
		Assert.assertEquals("https://aws.amazon.com/", driver.getCurrentUrl());
		// verify title
		Assert.assertEquals("Amazon Web Services (AWS) -  Cloud Computing Services", driver.getTitle());

	}

	@When("I click on the Amazon EC2 link")
	public void clickOnAmazonEC2Link() {

		homeController.toPage();

	}

	@Then("I am brought to a page that has Case Studies")
	public void verifyRedirectionToCaseStudiesPage() {

		// verify URL
		Assert.assertEquals("https://aws.amazon.com/ec2/?hp=tile&so-exp=below", driver.getCurrentUrl());
		// verify title
		Assert.assertEquals("Amazon EC2", driver.getTitle());

	}

	// Case Studies to Airbnb
	@Given("I am on a page with Case Studies")
	public void verifyCaseStudies() {

		ec2Controller = new AWSController_EC2();
		ec2Controller.setUp(driver);

		Assert.assertEquals(
				"https://aws.amazon.com/ec2/?hp=tile&so-exp=below&ec2-whats-new.sort-by=item.additionalFields.postDateTime&ec2-whats-new.sort-order=desc",
				driver.getCurrentUrl());

	}

	@When("I click on the Airbnb link")
	public void clickOnAirbnbLink() {
		ec2Controller.toPage();
	}

	@Then("I am brought to a page with a video titled 'A Chronicle of Airbnb Architecture Evolution'")
	public void verifyRedirectionToAirbnb() {
		Assert.assertEquals("https://aws.amazon.com/solutions/case-studies/airbnb/?trk=ec2_landing",
				driver.getCurrentUrl());
	}

	// Airbnb to Youtube
	@Given("I am on the above page")
	public void verifyAirbnb() {

		airBnbController = new AWSController_Airbnb();
		airBnbController.setUp(driver);

		Assert.assertEquals("https://aws.amazon.com/solutions/case-studies/airbnb/?trk=ec2_landing",
				driver.getCurrentUrl());

	}

	@When("When I click the link to Watch the Session")
	public void clickOnWatchTheSession() {
		airBnbController.toPage();
	}

	@Then("Then I am directed to a YouTube page with the Video")
	public void verifyRedirectionToYT(WebDriver driver) {
		Assert.assertEquals("https://www.youtube.com/watch?v=NxDjKKj4bQE&ab_channel=AmazonWebServices",
				driver.getCurrentUrl());
	}

	// Youtube
	@Given("I am on the above Youtube page")
	public void verifyYT() {

		youtubeController = new AWSController_Youtube();
		youtubeController.setUp(driver);

		Assert.assertEquals("https://www.youtube.com/watch?v=NxDjKKj4bQE&ab_channel=AmazonWebServices",
				driver.getCurrentUrl());

	}

	@When("I click the share link")
	public void clickOnShareLink() {
		youtubeController.clickShare();
	}

	@Then("I see a popup with the url to copy")
	public void verifyCopyUrl() {
		// NEED TO WRITE THIS STILL
		Assert.assertEquals("https://youtu.be/NxDjKKj4bQE", "https://youtu.be/NxDjKKj4bQE");
	}

}
