Feature: Login Feature

Scenario Outline: Login with multiple sets of credentials
  Given I am on the login page
  When I enter credentials from CSV
  Then I should see appropriate result based on credentials

