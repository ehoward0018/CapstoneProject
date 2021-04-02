@none
Feature: Retail Page Desktop Tab Features

Background:
	Given User is on Retail website
	
@capstoneProject
Scenario: Add and Remove a Mac book from Cart
	When User click on 'laptopAndNoteBookTab' tab
	And User click on 'showAllLaptopsNotebooks' button
	And User click on 'macBookItem' button
	And User click on 'addToCart'
	Then User should see a 'successfullyAddedToCartMessage' message
	And User should see ' 1 item(s) - $602.00' showed to the 'cartTotal'
	And User click on 'cart' button
	And User click on 'removeFromCart' button
	
@capstoneProject
Scenario: Product Comparison
	When User click on 'laptopAndNoteBookTab' tab
	And User click on 'showAllLaptopsNotebooks' button
	And User click on 'compareMacBook' button
	And User click on 'compareMacBookAir' button
	Then User should see a 'successfullyAddedToProductComparisonMessage' message
	And User click on 'productComparison' button
	Then User should see a 'productComparisonChart' message
	
@capstoneProject
Scenario: Adding an item to Wish list
	When User click on 'laptopAndNoteBookTab' tab
	And User click on 'showAllLaptopsNotebooks' button
	And User click on 'addSonyVaIOToWishList' button
	Then User should see a 'mustLogInToAddToWishList' message
	
@capstoneProject
Scenario: Validate the price of MacBook Pro is 2000
	When User click on 'laptopAndNoteBookTab' tab
	And User click on 'showAllLaptopsNotebooks' button
	And User click on 'macBookPro' button
	Then User should see '$2,000.00' showed to the 'macBookProPrice'
	
	