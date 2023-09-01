Feature: feature to test login functionality

  @smoketest
  Scenario Outline: Check the login is successful with valid credential
    Given user is on login page
    When user enters "<username>" and "<password>"
    And click on login button
    Then user is navigate to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
