@fb
Feature: Facebook login page

#  Background:
#    Given Open facebook app

  @displayed
  Scenario Outline: Verify login page
    Then Input user name "<UserName>" and password "<Password>"

    Examples:
    |UserName|Password|
    |123456@aaa       | 123456       |
    |123456@bbbb       | 123456       |

  @data
  Scenario Outline: Verify login page
    Then Input user name and password
      | UserName   | Password |
      | <UserName> | <Password>   |

    Examples:
      | UserName   | Password |
      | 123456@aaa | 123456   |



