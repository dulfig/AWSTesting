package com.bdd.aws.stepdefs;


import com.bdd.aws.controller.AWSController_Airbnb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class bnbToYT {

    WebDriver driver;
    AWSController_Airbnb airbnb;

    @Given("I am on the above page")
    public void verifyAirbnb(WebDriver driver) {

        this.driver = driver;
        airbnb = new AWSController_Airbnb();
        airbnb.setUp(driver);

        Assert.assertEquals("https://aws.amazon.com/solutions/case-studies/airbnb/?trk=ec2_landing",
                driver.getCurrentUrl());


    }

    @When("When I click the link to Watch the Session")
    public void clickOnAirbnbLink() {
        airbnb.toPage();
    }

    @Then("Then I am directed to a YouTube page with the Video")
    public void verifyRedirectionToYT(WebDriver driver) {
        Assert.assertEquals("https://www.youtube.com/watch?v=NxDjKKj4bQE&ab_channel=AmazonWebServices", driver.getCurrentUrl());
    }

}
