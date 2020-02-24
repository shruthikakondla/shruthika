Feature: yunojuno page

	Scenario Outline: Yunojuno landing page
	
	Given Launch yunojuno site 
	When user logged in using username as “username” and password as “password” 
    |<username>|
    |<password>|
    Then User login into yunojuno Successful
    |<Text>|
    
    Examples:       
    | username | password | Text |
    | shruthika.siri@gmail.com | Omsairam@95 | sample |
    
    