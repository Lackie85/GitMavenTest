Feature: Drag and Drop testing

	

Scenario: Make sure that Drag and drop of Z-figure works good

	Given User go to http://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager
	When User drag and drop draggable on the droppable
	And User makes screenshot of result
	Then User close the browser
	
	