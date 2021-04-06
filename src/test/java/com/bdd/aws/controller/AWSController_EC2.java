package com.bdd.aws.controller;

import org.openqa.selenium.WebDriver;

import com.bdd.aws.view.EC2View;

public class AWSController_EC2 {
	WebDriver driver;
	EC2View ec2;
	public void setUp(WebDriver driver) {
		this.driver = driver;
		ec2 = new EC2View(driver);
		
	}
	public void toPage() {
		ec2.getAirbnb().click();
	}

}
