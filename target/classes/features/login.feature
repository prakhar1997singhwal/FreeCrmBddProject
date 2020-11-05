Feature: Free CRM login Feature

Scenario: Free CRM FreeCrmHome Test Scenario

Given User is already on FreeCrmHome page
When title of FreeCrmpage is Free CRM
Then user clicks on login button 
Then user is on login page
Then close the browser

#Scenario: Free CRM Login Test Scenario
#Given User is already on the login page
#When title of the login page is LoginPage
#Then user enters "prakharsinghwal" and "Prakhar@1234"
#Then user clicks on the login button
#Then end the browser

Scenario Outline: Free CRM Login Test Scenario
Given User is already on the login page
When title of the login page is LoginPage
Then user enters "<username>" and "<password>"
Then user clicks on the login button
Then end the browser

Examples:
      | username | password |
      | prakharsinghwal96@gmail.com | Prakhar@1234 |
      | 1605378@kiit.ac.in | Yash@2412 |




Scenario: Free CRM HogePage Test Scenario
Given User is already on the home page
When the title of the home page is HomePage
Then user clicks on contacts
Then user click on new Contacts
Then finish the browser


