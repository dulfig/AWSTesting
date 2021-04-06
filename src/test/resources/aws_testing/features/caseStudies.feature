@CaseStudies
Feature: Click the Airbnb link to be brought to page with video case study information

    @tag1
    Scenario: Find Airbnb link and redirect to airbnb page
    Given I am on a page with Case Studies
    When I click on the Airbnb link
    Then I am brought to a page with a video titled "A Chronicle of Airbnb Architecture Evolution"