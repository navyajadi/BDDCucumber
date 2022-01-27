Feature: Creating Organization to the Application 

Scenario Outline: Login to Application through the Valid Credential 

	Given Launch the Browser
    And Enter URL "http://localhost:8888"
    When login page should be displayed
    Then Enter Username "admin"
    And Enter Password "123456"
    Then Click on Login button
    And Verify the homepage title
    Then Click on organizationlink
    Then Just wait
    And Click on createorganization img
    Then Enterorgname "<orgname>"
    And Enter phonenumber "<phoneNO>"
    Then Save the organization
    And Logout from the application
    Then Close the Browser
	
	Examples: 
	
	| orgname       |  |    phoneNo      |
	| Gmail_HYD     |  |       123456789 |
	| Infosys_HYD   |  |       776747 v  |
	|  Wiporo_HYD   |  |       9876543210|
	| IBM_HYD       |  |       45758     |
	
	
	
	
	
