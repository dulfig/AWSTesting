package com.bdd.aws.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubePlayerView {
	WebDriver driver;
	
	public YouTubePlayerView(WebDriver driver) {
		this.driver = driver;
	}

    public WebElement getShareButton() {
        return driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div[1]/ytd-button-renderer[1]/a/yt-icon-button/button/yt-icon"));
    }

    public WebElement getURLtoCopy () {
        return driver.findElement(By.xpath("//*[@id='share-url']"));
    }
    
}
