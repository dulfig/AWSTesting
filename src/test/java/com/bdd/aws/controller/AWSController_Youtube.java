package com.bdd.aws.controller;

import com.bdd.aws.model.YoutubeModel;
import com.bdd.aws.view.YouTubePlayerView;
import org.openqa.selenium.WebDriver;

public class AWSController_Youtube {
	WebDriver driver;
	YouTubePlayerView view;
	YoutubeModel model;

	// Prepare the page
	public void setUp(WebDriver driver) {
		this.driver = driver;
		this.view = new YouTubePlayerView(driver);
		this.model = new YoutubeModel();
	}

	public void clickShare() {
		view.getShareButton().click();
		//Short wait to ensure popup loads
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Navigate to the page
	public void toPage() {
		// Click necessary buttons to get to page

	}
/*
	// Additional methods required for testing
	private String getShareLink() {
		// Get the share link and return it
		
		return "";
	}
*/


}
