package com.bdd.aws.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AirbnbView {
	WebDriver driver;
	
	public AirbnbView(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getVideoTitle() {
		
		return driver.findElement(By.xpath("//*[@id=\"RE.3AINVENT_2018_.E2.80.93_A_Chronicle_of_Airbnb_Architecture_Evolution\"]"));
		
	}
	public WebElement getSessionLink() {
		
		return driver.findElement(By.xpath("//*[@id=\"aws-page-content\"]/main/div[5]/div[1]/div/a"));		
	}
	

}
