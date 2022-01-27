Feature: Login to the Application 

Scenario: Login to Application through the Valid Credential 
	Given Launch the Browser
	When Enter URL
	Then Enter Username
	And Enter Password
	Then Click on Login button
	And Close the Browser
	
Scenario: Login to Application through the Valid Credential 
	Given Launch the Browser
	When Enter URL "http://localhost:8888"
	Then Enter Username "admin"
	And Enter Password "123456"
	Then Click on Login button
	And Close the Browser
	
	
