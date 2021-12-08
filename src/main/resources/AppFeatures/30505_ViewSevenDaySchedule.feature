Feature: View seven day schedule

  @33522
  Scenario: Verify that the provider availability page displays hospitals availability for next seven days
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the provider availablity for next seven days

  @33523
  Scenario: Verify that the provider availability page displays available hospital contact details correctly
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the provider availablity along with hospital contact details