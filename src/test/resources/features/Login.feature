@login @smoke @regression
Feature: Login Functionality

  Agile User Story: As a user, I should be able to access all the features on the login page.

  Background: User opens the login page
    Given user is on login page

  #AC1

  Scenario: Users should be able to log in with valid credentials should land on the "Dashboard" page after successful login.
    When user enters valid username
    And user enters valid password
    And user clicks on Log in button
    Then user should land on "Dashboard" page

  Scenario: "Invalid username or password." message should be displayed for invalid login attempt.
    When user enters valid username
    And user enters invalid password
    And user clicks on Log in button
    Then user should see "Invalid username or password." message

  Scenario: "Please fill out this field." message should be displayed for any empty field
    When user enters valid username
    And user clicks on Log in button
    Then user should see "Please fill out this field." validation message

  Scenario: The password text box displays the characters entered by a user as bullet point
    When user enters valid password
    Then user should see characters as bullet point
