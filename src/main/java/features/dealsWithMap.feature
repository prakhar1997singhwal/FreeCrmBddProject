Feature: Free Crm new Deal Feature

Scenario: Free Crm New Deal Feature
Given user is already on freecrmhome page for the third time
When title of the page is FreeCrmHomePageDemo for the third time
Then user clicks on login buttonnnn on freecrmpage for third time
Then user enters emailId and password for the third Time
| email-Address | password |
| prakharsinghwal96@gmail.com | Prakhar@1234 |
Then user is on homePage for third time
Then user clicks on deals tab for third time
Then user clicks on new button on Home Page for third time
Then user is on DealsPage for third time
Then user enters contact details Title and Assigned To and Company and Products and Contacts for third time
| Title | Company | Products | Contacts |
| Moderate | TCS | TCSHr Solution | 9837257589 |
| Beginner | Wipro | Wipro Solution | 8888888888 |
| Advanced | Altran | AltranSolution | 9999999999 |
Then terminate the browser for third time
