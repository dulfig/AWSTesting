package com.bdd.aws.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class EC2View{
	
	public WebElement getAirbnb(WebDriver driver) {
		return driver.findElement(By.xpath("//body/div[@id='aws-page-content']/main[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/a[1]/img[1]"));
	}
	
}