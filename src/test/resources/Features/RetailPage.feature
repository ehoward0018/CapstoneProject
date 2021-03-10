@retailPage
Feature: Retail Website Features 

#Every feature file starts with Feature: <Name of feature file>
#Every Scenario starts with Scenario: <Name of Test case we want to automate>
#Gherkin keywords are Given, When, Then

#Given is a precondition
#When is an Action taken
#Then is an expected result (we write validation)
#And is repeating an action or can be used following Given keyword
#But is used for negative scenarios verification

Background:
	Given User is on Retail website

@Test
Scenario: Search functionality Test case 
	When User search for 'iphone'
	And User click on search button
	Then User should see Iphone image 
	
	#In scenario Outline we can run same scenario with multiple set of data
	# we will use Examples keyword to pass different data
	#Every scenario outline follows with Examples keyword
	#Under
Scenario Outline: Test Search Functionality with multiple set of Data
	When User search for '<itemName>'
	And User click on search button
	
	Examples:
	|itemname|
	|iphone|
	|mac book|
	|Canon|
	
@RegisterTest	
Scenario: Register an Account test case
	When User click  on MyAccount
	And User click on Register option
	And User fill Registration form with Below information
	|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
	|John|Tyson|jtyson@gmail.com|2021015588|wrongpass|wrongpass|no|
	And User accept the privacy and policy
	And User click on Continue button
	Then User should be registered in Retail Website
	