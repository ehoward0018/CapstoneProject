@none
Feature: Retail Page Desktop Tab Features

Background:
	Given User is on Retail website

@capstoneProject	
Scenario: User verify all items are present in Desktops tab
	When User click on 'desktopsTab' tab
	And User click on 'showAllDesktops' button
	Then User should see all 'iMac' are present in Desktop page


@capstoneProject
Scenario: User add HP LP 3065 from Desktops tab to the cart
	When User click on 'desktopsTab' tab
	And User click on 'showAllDesktops' button
	And User click on 'addToCartHPLP3065' button
	And User select 'quantity' '1'
	And User click on 'addToCart'
	Then User should see a 'successfullyAddedToCartMessage' message
	
@capstoneProject
Scenario: User add Canon EOS 5Dfrom Desktops tab to the cart
	When User click on 'desktopsTab' tab
	And User click on 'showAllDesktops' button
	And User click on 'addToCartCanonEOS5D' button
	And User select color from 'dropDown' 'Red'
	And User select 'quantity' '1'
	And User click on 'addToCart'
	Then User should see a 'successfullyAddedToCartMessage' message
	
@capstoneProject
Scenario: User add a review to Canon EOS 5D item inDesktops tab
	When User click on 'desktopsTab' tab
	And User click on 'showAllDesktops' button
	And User click on 'canonEOS5D' button
	And User click on 'writeAReview' button
	And user fill the review information with below information
	|yourname|yourReview|Rating|
	|name|reviewissuperawesomestuff|bad|
	And User click on 'continueButton' button 
	Then User should see a 'thankYouForYourReviewMessage' message
	
	
		
