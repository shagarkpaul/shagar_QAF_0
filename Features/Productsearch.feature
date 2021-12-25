
Feature: Searching of a product

Scenario Outline: Searching of a product on amazon 

Given i am on amazon home page
When i enter the the product "<name>"
And i click on the search button  

Then i see the relevent search result 

Examples: 
      | name  |
      | iphone 13 |
         
   
   