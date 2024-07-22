Feature: Facebook login page

  @displayed
  Scenario: Verify login page

    Given Open facebook app
    Then Verify Email textbox is displayed
    Then Verify password textbox is displayed