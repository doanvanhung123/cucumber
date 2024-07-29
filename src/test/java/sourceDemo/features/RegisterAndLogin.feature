Feature: Register

  @login
  Scenario: Login to systems
  #open url -> hooks
    Given Input user name
    When Input password
    And Click to Login button
    Then Login successfully