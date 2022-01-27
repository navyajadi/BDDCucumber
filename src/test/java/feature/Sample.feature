Feature: Searching for Mobile and Tv 

@regressiontest
Scenario: Searching for Nokia Mobiles 

	Given Launch Brower 
	When Enter URL 
	Then  Search for Nokia Mobile	
	Then Close Brower
@smoketest	
Scenario: Searching for Samsung Tv 

	Given Launch Brower 
	When Enter URL 
	Then  Search For Samsung Tv
	Then Close Brower
	
	
	
	
