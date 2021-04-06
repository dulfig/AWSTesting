package com.bdd.aws.stepdefs;


import com.bdd.aws.controller.AWSController_EC2;
import com.bdd.aws.controller.AWSController_Home;
import com.bdd.aws.controller.AWSController_Youtube;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class youtubeURLStepDefs {

    private WebPage state;
    WebDriver driver;


    public youtubeURLStepDefs(WebPage state) {
        this.state = state;
        this.state.driver = driver;
    }
    AWSController_Youtube youtube;

    @Given("I am on the above Youtube page")
    public void verifyYT(WebDriver driver) {


        youtube = new AWSController_Youtube();
        youtube.setUp(state.driver);

        Assert.assertEquals("https://www.youtube.com/watch?v=NxDjKKj4bQE&ab_channel=AmazonWebServices", state.driver.getCurrentUrl());


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
