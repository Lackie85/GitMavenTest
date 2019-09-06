Feature: Check and move functionality

Background:
Given User opens https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html


Scenario: test Check and move functionality

	
	When User checks all items from left and move it to the right
	And User makes screenshot of result with name checkNmove
	Then User close the browser
	
Scenario: Test move selected elements from the page
	When User checks one element and move to the right
	And User makes screenshot of result with name oneElement
	Then User close the browser
	
Scenario: Test move two elements from left to right
	When User checks two elements and move to the right
	And User makes screenshot of result with name two elementsElement
	Then User close the browser