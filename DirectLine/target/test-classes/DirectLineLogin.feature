Feature: DirectLine Login Page

Scenario Outline: DirectLine LoginPage
Given I Launch DirectLine Site
When I Enter username and password
|<username>|
|<password>|
And I click on Login
Then I verify whether login is successful
|<Text>|
And Close the browser 



Examples:
|username|password|Text|
|qa@greenflag.com|Password1|Successfully logged in!|
