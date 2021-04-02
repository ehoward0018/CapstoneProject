@none
Feature: Retail Page Features

Background:
	Given User is on Retail website
	And User click on 'myAccount' button
	And User click on 'login' button
	And User enter username 'BobbyBrown@gmail.com' and password 'bobby'
	And User click on 'loginButton' button
	Then User should see all 'LoggedIn' are present
	
@capstoneProject
Scenario: Register as an Affiliate userwith Cheque Payment Method
	When User click on 'editYourAffiliateInformation' button
	And User click on 'cheque' button
	And User fill affiliate form with below information
	|company|website|taxID|paymentMethod|
	|toystoys|toystoys.com|222982|Visa|
	And User click on 'continueAffiliate' button
	Then User should see a 'successfullyMadeAffiliate' message

@capstoneProject	
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	When User click on 'editYourAffiliateInformation' button
	And User click on 'bankTransfer' button
	And User fill bank form with below information
	|bankName|abaNumber|swiftCode|accountName|accountNumber|
	|chaching|11123412|123123|bobbyBrown|1231241|
	And User click on 'continueAffiliate' button
	Then User should see a 'successfullyMadeAffiliate' message
	
@capstoneProject
Scenario: Edit your account Information
	When User click on 'editYourAccountInformation' button
	And User fill account information with below information
	|firstname|lastName|email|telephone|
	|Bobby|Brown|BobbyBrown@gmail.com|4444444444|
	And User click on 'continueAffiliate' button
	Then User should see a 'successfullyChangedAccountInfo' message
	

	