Feature: Managing File Functionality
  Agile User Story: As a user, I should be able to manage a file.


  @wip
  Scenario: Verify users can upload a file by clicking the + icon on the Files page.
  - File name should be displayed on the file page after successful upload.
    Given user is on the Files page
    When user clicks plus icon
    And user clicks Upload file
    Then user should see file name on the screen

