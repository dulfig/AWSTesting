package com.bdd.aws.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.aws.DataTable;
import com.bdd.aws.controller.AWSController_Home;
import com.bdd.aws.view.AWSHomeView;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeStepDefs {
	private WebPage state;
	WebDriver driver;
	AWSHomeView homeView;
	AWSController_Home AWSController_home;

	public HomeStepDefs(WebPage state) {
		this.state = state;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		this.state.driver = driver;
		DataTable dataTable = new DataTable();
		this.state.dataTable = dataTable;
	}

	@Given("I am on aws.amazon.com")
	public void navigateToAmazonHomePage() {
		AWSController_home = new AWSController_Home();
		AWSController_home.setUp(state.driver);
		homeView = new AWSHomeView(state.driver);
	}

	@When("I click on the Compute link under Explore Our Products")
	public void clickOnComputeLink() {

		// this clicks on compute link and clicks on EC2 link
		AWSController_home.clickCompute();

	}

	@Then("I see a link for Amazon EC2")
	public void verifyLinkForAmazonEC2Appears() {

		Assert.assertTrue(homeView.getEC2Link().isDisplayed());

	}

}
