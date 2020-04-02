@LogIn
Feature: Login Page 
  As auser i want to be able to log in 
  so I cant buy Products 

 @ValidCredentials @ignore
  Scenario: User should not be able to log in with incorrect credentials
    Given User is on login page     
    When User enters username as "testIncorrecto@hotmail.com"
    And User enters password as "testWrong"
    And User click on sign in button 
    Then User should be logged Incorrectly
  
  @ValidCredentials @ignore
  Scenario: User should be able to log in 
    Given User is on login page     
    When User enters username as "test800@hotmail.com"
    And User enters password as "test123"
    And User click on sign in button 
    Then User should be logged correctly
    
 	@BuyItem 
 	Scenario: Buy an item
 	Given LoginPage Already "test800@hotmail.com" and "test123"
 	And User clicks on Women Tag
 	And User hovers on a dress
 	And User clicks on Add To Cart in a product
 	And User clicks on Proceed to checkout
 	And User clicks on Proceed to checkout again in Summary page
 	And User clicks on Proceed to checkout again in Addres page
 	And User clicks on Agree to the terms of service checkbox 	
 	And User clicks on Proceed to checkout again in Shipping page
 	And User clicks on Pay by check option
 	Then User should be on Order Summary page
 	
 	
 	