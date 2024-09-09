
Feature: Search and place the order for products 

Scenario Outline: Search Experience for product search in both home and offers Page

Given  user is on GreenCart Landing page 
When user searched with <Name> and extarcted actual name of product
Then User go and search for same shortname <Name> in offers Page 
And validate product name in offers page matches with Landing page

Examples:
|Name |
|Tom |
|Beet |
