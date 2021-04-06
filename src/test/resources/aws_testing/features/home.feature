@tag
Feature: Click on Compute Link to Reveal Amazon EC2 Link

	@tag1
	Scenario: See a link for Amazon EC2
	Given I am on aws.amazon.com
	When I click on the Compute link under Explore Our Products
	Then I see a link for Amazon EC2
	