Feature: Activity page verification
  US: As a user, I should be able to access to the activity page.

  Background: User logged in to Dashboard page
    # Step 1
    # pre-condition
    Given user is on dashboard page

    # AC1
  Scenario: Verify 11 app navigators are displayed in Activity page.
    # Step 2
    When user clicks on activity link
    # Step 3
    Then user should see 11 app navigators

    # AC 2
  Scenario: Verify app user can see given app navigators
    # Step 2
    When user clicks on activity link
    # Step 3
    Then user should see given app navigators
      | By you       |
      | Bu others    |
      | Circles      |
      | Favorites    |
      | File changes |
      | Calendar     |
      | Todos        |
      | Comments     |
      | Deck         |

