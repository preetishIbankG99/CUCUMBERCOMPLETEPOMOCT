Feature: Login data creation
Scenario: OrangeHRM checkinglogin credentials
Given User is already on loginpage
Then User enters username and password
|Admin|admin123| 
Then User clicks on loginbutton
Then Close browser