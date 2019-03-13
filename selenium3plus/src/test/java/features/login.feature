Feature: login

Scenario: login
	Given user loads url
	When user enters credentials and submits
	Then verify home page title 
