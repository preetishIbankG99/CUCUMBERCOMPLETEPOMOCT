Feature:  Checking HRM login feature
Scenario: Test Login with valid credentials
    Given Open chromebrowser and launch application
    When I enter correct "username" and correct "password"
    When User click on login button
    Then Desired Page title OrangeHRM
    Then Browser tear down
     