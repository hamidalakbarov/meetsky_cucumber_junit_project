Feature: File Functionality
  Agile User Story: As a user, I should be able to access the features on the file page.

  Background: User is on the Files page
    Given user is on the Files page

  Scenario: Verify users see 7 options in the Files page as shown in the design.
    Then user should see 7 options in the Files page


  Scenario: Verify users see 6 option after clicking the 3 dots in any file as shown in the design.
    When user clicks three dots in a any file
    Then user should see 6 options
