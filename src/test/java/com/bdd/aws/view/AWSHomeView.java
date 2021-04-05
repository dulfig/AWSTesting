package com.bdd.aws.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AWSHomeView {
	
	public WebElement getComputeLink(WebDriver driver) {
		return driver.findElement(By.xpath("//body/div[@id='aws-page-content']/main[1]/div[3]/div[1]/div[6]/div[7]/div[5]/a[1]"));
	}
}
