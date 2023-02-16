Feature: Activity page verification
  US: As a user, I should be able to access to the activity page.

  # AC1
  Scenario: Verify 11 app navigators are displayed in Activity page.
    # Step 1
    # pre-condition
    Given user is on dashboard page
    # Step 2
    When user clicks on activity link
    # Step 3
    Then user should see 11 app navigators

