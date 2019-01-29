Feature: Test Facebook Smoke Scenario

  Scenario Outline: Test login with valid credentials
    Given open browser and start application
    When I enter valid "<userna>" and valid "<passwo>"
    Then user should able to login successfully
    And close the site

    Examples: 
      | userna              | passwo  |
      | g.venkat143@gmail.com | venky@143 |
      | g.venkat143@gmail.com | venky@143 |
