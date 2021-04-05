package com.bdd.aws.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AWSHomeView {
	WebDriver driver;
	
	public AWSHomeView(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getComputeButton() {
		return driver.findElement(By.xpath("//body/div[@id='aws-page-content']/main[1]/div[3]/div[1]/div[6]/div[7]/div[5]/a[1]"));
	}
	
	public WebElement getEC2Link() {
		return driver.findElement(By.xpath("//body/div[@id='aws-page-content']/main[1]/div[3]/div[1]/div[6]/div[7]/div[6]/div[3]/div[1]/a[1]"));
	}
}
