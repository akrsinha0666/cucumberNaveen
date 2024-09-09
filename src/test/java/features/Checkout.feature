Feature: Search and Place the Order for Products

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and Offers page


Given User is on GreenCart Landing Page
When user searched with Shortname <name> and extracted actual aname of product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
|Name|  
|Tom |  

