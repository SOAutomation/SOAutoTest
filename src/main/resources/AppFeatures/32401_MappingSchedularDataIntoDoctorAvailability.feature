Feature: Mapping Scgedular data into doctor availability UI

  @33198
  Scenario: Verify that doctors are available in nearby hospitals if current selected hospital does not have any doctors
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol of first hospital
  And doctors are not available in current hospital
  Then Verify the doctors availability in nearby hospitals
