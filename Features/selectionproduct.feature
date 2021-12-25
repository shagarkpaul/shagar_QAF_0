
Feature: Selecting of a product

Scenario Outline: Selecting of a product on amazon 

Given i am on amazon home page
When i enter the the product "<name>"
And i click on the search button
And i click on the product that i want to select  

Then i see the product is selected 

    Examples: 
      | name  |
      | iphone 13 |
          
  
