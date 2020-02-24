@1
Feature: npower page

Background:
	Given I login to npower
	When I enter username and password
	Then I click on login
@smoke	
Scenario:
	When I click on smart meter
	And I enter values
	And I click on something
	Then I logout
@3	
Scenario Outline: 
	When I click on gas
	And I enter gas values
	And I logout
	
	Examples:
	|USERNAME|
	|shshsh|
	

