Feature: Free orangehrm application testing
@Smoke 
Scenario: Login with correct username and correct password
Given This is valid logintest
 @Regression
Scenario: Login with incorrect username and incorrect password
Given This is invalid logintest
@Smoke
Scenario: Create user
Given This is new usertestcase
@Smoke @Regression
Scenario: Create deals
Given This is new dealtestcase
@Regression
Scenario: Create task
Given This is new taskrtestcase