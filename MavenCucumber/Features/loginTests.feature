Feature: Login tests 

	This feature file conatains all the login tests
	
	Background: 
	Given User is on http://www.torrent.kg/forum/
	

Scenario: Verify that user is able to login using valid username and password 
	
	#When User clicks on MyAccount link 
	When User logs in using username lackie and password 99852998iki
	Then User is taken to the myaccount page
	
	Scenario: Verify that user is able to login using invalid username and password 
	
	#When User clicks on MyAccount link 
	When User logs in using username lackie and password 99852998iki7
	Then User is taken to the myaccount page
	
#Scenario: Verify that user is able to login using valid username and password 
	#Given User navigates to http://facebook.com
	
	#Scenario: Verify that user is able to login using valid username and password 
	#Given User opens http://amazon.com 
	
	