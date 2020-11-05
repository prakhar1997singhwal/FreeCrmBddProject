Feature: Free Crm new Contact Feature

Scenario Outline: Free Crm New Contact Feature
Given user is already on freecrmhome page
When title of the page is FreeCrm
Then user clicks on login buttonn on freecrmpage
Then user enters "<emailId>" and "<password>"
Then user is on homepage
Then user clicks on contacts tab
Then user clicks on new button
Then user is on NewContactPage
Then user enters contact details "<Firstname>" and "<Lastname>" and "<Comapny>" and "<EmailAddress>" and "<category>" and "<Status>" and "<SocialChannel>"
Then user clicks on save button
Then end the browser

Examples:
     | emailId | password | Firstname | Lastname | Comapny | EmailAddress | category | Status | SocialChannel | 
     | prakharsinghwal96@gmail.com | Prakhar@1234 | Prakhar | Singhwal | TCS | prakharsinghwal96@gmail.com | Lead | New | Instagram |
     | prakharsinghwal96@gmail.com | Prakhar@1234 | Hritik | Sahu | Wipro | hritik@gmail.com | Customer | Active | Twitter | 
     | prakharsinghwal96@gmail.com | Prakhar@1234 | Divyansh | Dwedi | White hat Junior | divyansh@gmail.com | Lead | New | Facebook |
     | prakharsinghwal96@gmail.com | Prakhar@1234 | Pranit | Sinha | Altran | pranit@gmail.com | Lead | New | TikTok |
     | prakharsinghwal96@gmail.com | Prakhar@1234 | Anubhav | Raj | Air Force | anubhav@gmail.com | Lead | New | LinkedIn |
