@tag
Feature: Payment dashboard feature

  @tag1
  Scenario: Dashboard check
    Given I want to log in to the system
    When I go to Payments app
    Then I can see all Payments guideposts with correct inner text
