Feature: Login data creation
Scenario: Checking login credentials mapping
    Given User is  on loginpage
    When Title is OrangeHRM
    Then User enters  valid username and valid password
      | username | password |
      | Adminabc |      123 |
      | Admindef |      456 |
      | Adminghi |      789 |
    Then Closing browser
