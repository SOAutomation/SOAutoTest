Feature: Ability to see provider availability

  @33532
  Scenario: Verify that vets availability should be showed as Morning, Afternoon or Evening not in time range
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the doctors availablity should show sessions as Morning, Afternoon or Evening

