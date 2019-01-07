Feature: Route Shout Home Page Check

  Scenario: Check Home Page
    Given User is on Home Page
    When User clicks Where my Bus
    Then User is on Routes Page

  Scenario: Navigate to Schedule page from Home
    When User clicks Schedule
    Then User is on Schedule Page

  Scenario: Navigate to Locate Me page from Home
    When User clicks Locate Me
    Then User is on Locate Me Page

  Scenario: Validate the Search Address tab in header
    When User clicks Search Address
    Then User is on Search Address Page

  Scenario: Valdiate My Notifications tab in header
    When User clicks My Notifications
    Then User is on My Notifications page

  Scenario: Validate Service Announcements tab in header
    When User clicks Service Announcements
    Then User is on Service Announcements page
