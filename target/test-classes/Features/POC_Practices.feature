@Automation
Feature: This feature is created for POC purpose
  Background:

  @TC1_User_CorrectCredentials @TC01 @Regression @E2E @Postive
  Scenario Outline: Validate if user able to login with Correct 'User' credentials
    Given The 'User' launches the application
    When The 'User' enters the username and password in the "<RowIndex>"
    And The 'User' clicks on Log In Button
    And The 'User' clicks order items
    And 'User' Select lastest Order and view details
    Then 'User' Get the information

    Examples:
      | RowIndex |
      | 1        |

  @TC2_User_CorrectCredentials @TC02 @Regression @E2E @Postive
  Scenario Outline: Validate if user able to login with Correct 'User' credentials
    Given The 'User' launches the application
    When The 'User' enters the username and password in the "<RowIndex>"
    And The 'User' clicks on Log In Button
    And The 'User' clicks order items
    And 'User' Select lastest Order and view details
    Then 'User' Get the information

    Examples:
      | RowIndex |
      | 2      |


  @TC3_User_InCorrectCredentials @TC03 @Smoke  @Negative
  Scenario Outline: Validate if user able to login with Correct 'User' credentials
    Given The 'User' launches the application
    When The 'User' enters the username and password in the "<RowIndex>"
    And The 'User' clicks on Log In Button
    Examples:
      | RowIndex |
      | 3    |


  @TC4_User_InCorrectCredentials @TC04 @Smoke  @Negative
  Scenario Outline: Validate if user able to login with Correct 'User' credentials
    Given The 'User' launches the application
    When The 'User' enters the username and password in the "<RowIndex>"
    And The 'User' clicks on Log In Button
    Examples:
      | RowIndex |
      |4     |