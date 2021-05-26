Feature: SignIn Application 
@Test1.1
Scenario: Google CreateAccount for User for which gender is not Custum

Given User is at SignIn page
When User SignIn using firstName and lastName and userName and password
And Navigated to WelcomeGoogle page and enter DOB and gender
And if required Mobile verification phone and code
Then Click on I agree on term and condition
And verify Home page

@Test1.2
Scenario: Google CreateAccount for User for which gender is not Custum

Given User is at SignIn page
When User SignIn using firstName and lastName and userName and password
Then Navigated to WelcomeGoogle page and enter DOB and gender is choice please provide preference 
And if required Mobile verification phone and code
Then Click on I agree on term and condition
And verify Home page

@Test2
Scenario: User Modify personal info and save the modified information
Given User Login using username and password
When User navigate to Personal info Name and modify fisrtName and lastName
Then Click on save
And Verify modified info


