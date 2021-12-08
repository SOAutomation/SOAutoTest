Feature: Login To PetWare

  Scenario: Petware login with valid credentials
    Given User logged into Okta
    Then Petware login screen should display
    When User enter valid Username "<username>" and password "<password>"
    And Click on login button
    Then Visit Management page should display