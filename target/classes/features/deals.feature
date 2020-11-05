Feature: Free Crm new Deal Feature

Scenario: Free Crm New Deal Feature
Given user is already on freecrmhome page for the first time
When title of the page is FreeCrmHomePageDemo
Then user clicks on login buttonnnn on freecrmpage
Then user enters emailId and password
| prakharsinghwal96@gmail.com | Prakhar@1234 |
Then user is on homePage
Then user clicks on deals tab
Then user clicks on new button on Home Page
Then user is on DealsPage
Then user enters contact details Title and Assigned To and Company and Products and Contacts
| Moderate | Prakhar Singhwal | TCS | TCSHRSolution | 8338879212 |
Then user clicks on save button on dealsPage
Then terminate the browser
