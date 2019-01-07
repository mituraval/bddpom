Feature: Schedule Page check

  Scenario: Go to Schedule Page
    Given User is on the Schedule Page
    And user verifies the schedule page
    When user clicks on Route
    And the user sees the schedule page
    #Verify if user sees AM, PM text on trips page
    Then user is on scheduled trips page

  Scenario: Check the AM trips
    Given user is on Direction Cumming to Downtown
    When user clicks on AM times
    And user sees AM times
    Then users is on select trip time page

  Scenario: Check the PM trips
    Given user is on Direction Cumming to Downtown
    When user clicks on PM times
    And user sees PM times
    Then users is on select trip time page
