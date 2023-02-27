@widgets
Feature: Customize Dashboard Functionality

  Agile User Story: As a user, I should be able to customize the Dashboard.

  Background: User is on the dashboard page
    Given user is on dashboard page

  Scenario: Verify users get 9 editable widgets as shown in the design after clicking the “customize” button.
    When user clicks on Customize button
    Then user should see 9 widgets

  Scenario: Verify users can check any widget option.
    When user clicks on Customize button
    And user clicks on "Weather" widget
    Then user should see the "Weather" widget is selected

  Scenario: Verify users can uncheck any widget option.
    When user clicks on Customize button
    And user clicks on "Weather" widget
    Then user should see "Weather" widget is not selected
