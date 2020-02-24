Feature: Smartmeter page
	Scenario Outline: Smartmeter page
	
	Given Launch npower site 
	When user logsin
    |<username>|
    |<password>|
    When User navigates to smartmeter page
  	And User click on Smart meter installation reviews
  	Then User click on logout
    
    Examples:       
    | username | password | 
    | shiva.siri@gmail.com | siri3043 |