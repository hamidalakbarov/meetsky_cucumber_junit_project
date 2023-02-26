@logout
Feature: Logout functionality

  Agile User Story: As a user, I should be able to logout.

  Background: User is on the dashboard page
    Given user is on dashboard page


  Scenario: Users can log out by using log out button inside profile info and ends up in login page.
    When user clicks on profile info
    And user clicks on logout button
    Then user should end up in Login page


  Scenario: Users cannot go to the home page again by clicking the step back button after successfully logged out.
    When user clicks on profile info
    And user clicks on logout button
    Then user should end up in Login page
    When user clicks step back button
    Then user should stay in login page

  Scenario: Users must be logged out if the user is away from keyboard for 3 minutes (AFK-away from keyboard)
  (if the user does not do any mouse or keyboard action for 3 minutes)
    When user is away from keyboard for 3 minutes
    Then user is logged out