Feature: Mapping Scgedular data into doctor availability UI

  @33198
  Scenario: Verify that doctors are available in nearby hospitals if current selected hospital does not have any doctors
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol of first hospital
  And doctors are not available in current hospital
  Then Verify the doctors availability in nearby hospitals
