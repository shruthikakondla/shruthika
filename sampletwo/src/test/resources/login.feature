Feature: Login

	Scenario: Valid Login
	
		Given Application is open
		When entered valid username as ajaykkdasari@gmail.com and password as Waterf@11
		Then homepage is displayed

	Scenario: Invalid login with incorrect username
	
		Given Application is open
		When entered incorrect username as ajaydasari@gmail.com and correct password as Waterf@11
		Then login is failed
		
	Scenario: Invalid login with incorrect password
	
		Given Application is open
		When entered correct username as ajaykkdasari@gmail.com and incorrect password as Water@11
		Then login is failed
				
	