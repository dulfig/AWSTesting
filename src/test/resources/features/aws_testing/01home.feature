@home 
Feature: AWS site navigation

@tag1 
Scenario: See a link for Amazon EC2 
	Given I am on aws.amazon.com 
	When I click on the Compute link under Explore Our Products 
	Then I see a link for Amazon EC2 
Scenario: Redirection to Case Studies page after clicking on Amazon EC2 link 
	Given I am on the home page 
	When I click on the Amazon EC2 link 
	Then I am brought to a page that has Case Studies 
Scenario: Find Airbnb link and redirect to airbnb page 
	Given I am on a page with Case Studies 
	When I click on the Airbnb link 
	Then I am brought to a page with a video titled 'A Chronicle of Airbnb Architecture Evolution' 
Scenario: Navigate to YouTube from the Airbnb video 
	Given I am on the above page 
	When I click the link to 'Watch the Session' 
	Then I am directed to a YouTube page with the Video 
Scenario: Get the URL to share the video from YT's share button 
	Given I am on the above YouTube page 
	When I click the share link 
	Then I see a popup with the url to copy 
