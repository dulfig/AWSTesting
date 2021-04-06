package com.bdd.aws.stepdefs;


import com.bdd.aws.controller.AWSController_EC2;
import com.bdd.aws.controller.AWSController_Youtube;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class youtubeURLStepDefs {

    WebDriver driver;
    AWSController_Youtube youtube;

    @Given("I am on the above Youtube page")
    public void verifyYT(WebDriver driver) {

        this.driver = driver;
        youtube = new AWSController_Youtube();
        youtube.setUp(driver);

        Assert.assertEquals("https://www.youtube.com/watch?v=NxDjKKj4bQE&ab_channel=AmazonWebServices", driver.getCurrentUrl());


    }

    @When("I click the share link")
    public void clickOnAirbnbLink() {
        youtube.clickShare();
    }

    @Then("I see a popup with the url to copy")
    public void verifyCopyUrl(WebDriver driver) {
        //NEED TO WRITE THIS STILL
        Assert.assertEquals("https://youtu.be/NxDjKKj4bQE", "");
    }

}
