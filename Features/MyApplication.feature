Feature: Test OrangeHRM smoke scenario

  Scenario Outline: Test Login with valid credentials
    Given Open chrome and start application
    When I enter valid "<username>" and valid "<password>"
    Then Browser should be closed

    Examples: 
      | username | password |          
      | Admin123 | admin123 |          
      | Admin456 | admin456 |          
      | Admin789 | admin789 |          
