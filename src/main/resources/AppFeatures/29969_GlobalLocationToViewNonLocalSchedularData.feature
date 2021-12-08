Feature: Global locator view

  @32967
  Scenario: Verifying the Global Icon Availability in Banfield Pet Ware Application
  Given User is in Visit Management page
  When User mouse hover on top navigation bar
  Then Global locator map icon should display

	@33155
  Scenario: Verifying Global Locator Screen
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display