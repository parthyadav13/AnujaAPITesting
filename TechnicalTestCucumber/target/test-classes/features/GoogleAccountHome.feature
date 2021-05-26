Feature: Google Account Home Page 

Scenario: User Modify personal info and save the modified information
Given User Login using username and password
When User navigate to Personal info Name and modify fisrtName and lastName
Then Click on save
And Verify modified info

