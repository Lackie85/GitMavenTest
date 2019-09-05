Feature: This file has registration tests

Scenario: Virify that User is able to register
	Given User goes to http://facebook.com
	When User fills in the given details regisrtation form regisration form
		 |FirstName| Virender   |
		 |LastName	| Singh	  |
		 |PhoneNumber| 9898889989 |
		 |Password| Testuser001|