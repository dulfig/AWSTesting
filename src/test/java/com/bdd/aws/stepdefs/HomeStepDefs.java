package com.bdd.aws.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.aws.controller.AWSController_Home;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeStepDefs {

	WebDriver driver;
	AWSController_Home AWSController_home;

	@Given("I am on aws.amazon.com")
	public void navigateToAmazonHomePage() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		AWSController_home = new AWSController_Home();
		AWSController_home.setUp(driver);

	}

	@When("I click on the Compute link under Explore Our Products")
	public void clickOnComputeLink() {

		// this clicks on compute link
		AWSController_home.clickCompute();

	}

	@Then("I see a link for Amazon EC2")
	public void verifyLinkForAmazonEC2Appears() {

		WebElement EC2Link = driver.findElement(By.xpath("//*[@id=\"lb-item-expander-content-06\"]/div[1]/a"));
		Assert.assertTrue(EC2Link.isDisplayed());

	}

}
