Feature: Wheres my Bus Page check

  Scenario: Go to Wheres my Home Page
    Given User is on the Home Page
    When User clicks Wheres my Bus
    Then User is on Wheres My Bus Page

  Scenario: Verify route exists and click the route
    Given User is on Wheres My Bus Page
    And User verifies routes display
    When User clicks the route
    Then User in on the trips page

    Scenario: Verify Trip and stop
    Given User verifies trip name
    When User clicks a Stop
    Then User is on Stops page