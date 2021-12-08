Feature: Ability to view area hospitals

  @33148
  Scenario: Verify that all available hospitals within a 25 mile radius will be viewable
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  And Verify all available hospitals within 25 miles will be viewable

	@33149
  Scenario: Verify that the hospital list should be sorted by distance ( nearest to furthest)
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  And Verify all available hospitals are sorted by distance
  
  @33150
  Scenario: Verify that the Hospital details to include base hospital contact information
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  And Verify that the Hospital details are included that is base hospital contact info
  
  @33151
  Scenario: User should see title "Banfield Pet Hospital® Locator"
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  And Verify that "Banfield Pet Hospital® Locator" title is displayed
  
  @33152
  Scenario: Verify that "Appointments availability at surrounding hospital for the next 7 days" to be displayed
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  And Verify that "Appointments availability at surrounding hospital for the next 7 days" is displayed
  
  @33153
  Scenario: Clicking on + Symbol should show doctor's availability
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the doctors availablity screen 