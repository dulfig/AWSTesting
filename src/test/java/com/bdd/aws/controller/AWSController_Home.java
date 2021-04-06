package com.bdd.aws.controller;

import org.openqa.selenium.WebDriver;

import com.bdd.aws.view.AWSHomeView;

public class AWSController_Home implements AWSController {
	WebDriver driver;
	AWSHomeView home;

	// Prepare the page
	public void setUp(WebDriver driver) {
		this.driver = driver;
		this.driver.get("https://aws.amazon.com/");
		home = new AWSHomeView(driver);

	}

	// Click compute link before page navigation
	public void clickCompute() {
		home.getComputeButton().click();
	}

	// Navigate to the page
	public void toPage() {
		// Click necessary buttons to get to page
		home.getEC2Link().click();
	}
	// Additional methods required for testing

}
