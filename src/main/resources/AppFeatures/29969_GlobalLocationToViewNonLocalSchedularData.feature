Feature: Global locator view

  @32967
  Scenario: Verifying the Global Icon Availability in Banfield Pet Ware Application
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User mouse hover on top navigation bar
  Then Global locator map icon should display

	@33155
  Scenario: Verifying Global Locator Screen
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display