@account
Feature: Account user

  @openmodal
  Scenario: open modal
    Given user in the home page
    When user click avatar in navbar
    Then modal is open