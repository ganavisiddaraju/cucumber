Feature: payment
Background: User Login

Given User is in the Login Page
When User enters valid credentials and performs Login
Then User must be navigated to the Home Page


Scenario: search

Given Alex should be home page
When Alex enters the first four letter of the product
And selects the product from the list and clicks search button
Then Alex redirected to the product page

Scenario: unsucessful search

Given Alex should be in home page
When Alex enters  first four letter of unavailable product
Then no product message will be displayed
 
Scenario: alex must be in home page
When alex enter product name and click find details button
And try proceed with payment  without selecting product
Then no cart symbol is displayed