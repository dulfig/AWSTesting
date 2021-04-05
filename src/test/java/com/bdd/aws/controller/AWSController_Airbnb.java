package com.bdd.aws.controller;

import org.openqa.selenium.WebDriver;

import com.bdd.aws.view.AirbnbView;

public class AWSController_Airbnb {
	
	WebDriver driver;
	AirbnbView airbnb;

	// Prepare the page
	public void setUp(WebDriver driver) {
		
		this.driver = driver;
		airbnb = new AirbnbView(this.driver);

	}

	// Navigate to the page
	public void toPage() {
		
		// navigate to YouTube page
		airbnb.getSessionLink().click();
	
	}

}
