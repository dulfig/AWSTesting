package com.bdd.aws.model;

import org.openqa.selenium.WebDriver;

import com.bdd.aws.view.AirbnbView;

public class AirbnbModel {
	
	String title;
	WebDriver driver;
	AirbnbView airbnb;
	
	AirbnbModel(WebDriver driver){
		
		this.driver = driver;
		airbnb = new AirbnbView(this.driver);
		
	}
	
	public String getVideoTitle() {
		
		title = airbnb.getVideoTitle().getText();
		return title;
		
	}
	
	public void setVideoTitle(String title) {
		this.title = title;
	}

}
