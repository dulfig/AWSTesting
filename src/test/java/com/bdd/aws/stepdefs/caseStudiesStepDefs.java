package com.bdd.aws.stepdefs;


import com.bdd.aws.controller.AWSController_EC2;
import com.bdd.aws.controller.AWSController_Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class caseStudiesStepDefs {


    AWSController_EC2 ec2;
    private WebPage state;
    WebDriver driver;


    public caseStudiesStepDefs(WebPage state) {
        this.state = state;
        this.state.driver = driver;
    }

    @Given("I am on the page with Case Studies")
    public void verifyCaseStudies() {


        ec2 = new AWSController_EC2();
        ec2.setUp(state.driver);

        Assert.assertEquals("https://aws.amazon.com/ec2/?hp=tile&so-exp=below&ec2-whats-new.sort-by=item.additionalFields.postDateTime&ec2-whats-new.sort-order=desc",
                driver.getCurrentUrl());


    }

    @When("I click on the Airbnb link")
    public void clickOnAirbnbLink() {
        ec2.toPage();
    }

    @Then("I am brought to a page with a video titled A Chronicle of Airbnb Architecture Evolution")
    public void verifyRedirectionToAirbnb(WebDriver driver) {
        Assert.assertEquals("https://aws.amazon.com/solutions/case-studies/airbnb/?trk=ec2_landing", driver.getCurrentUrl());
    }

}







