@YTURL 
Feature: Click the share button on YT and get a URL to copy 

Scenario: Get the URL to share the video from YT's share button 
	Given I am on the above YouTube page 
	When I click the share link 
	Then I see a popup with the url to copy