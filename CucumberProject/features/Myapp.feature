Feature: Validate facebook login functionality
Scenario: Validate facebook for valid user credentials
Given Open browser and launch facebook
When Enter valid "<fahadqa900@gmail.com>" and valid "<123>"
Then User should login in facebook account
