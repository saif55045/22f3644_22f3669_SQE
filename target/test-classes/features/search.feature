Feature: Search Feature

Scenario: Search for a product
  Given I am on the home page
  When I search for "phones"
  Then I should see the search results
