Feature: npower page

	Scenario Outline: npower landing page
	
	Given Launch npower site 
	When user logsin
    |<username>|
    |<password>|
  	And User login into npower Successful
   	|<Text>|
   	Then User click on logout
    
    Examples:       
    | username | password | Text|
    | shiva.siri@gmail.com | siri3043 | npowersample|
    