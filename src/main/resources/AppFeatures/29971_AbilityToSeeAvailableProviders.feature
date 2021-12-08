Feature: Ability to see available providers

  @33540
  Scenario: Verification of doctors availability for next seven days from current day
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the doctors availablity for next seven days from current day

	@33542
  Scenario: Verification of "No Provider" message when doctors are not available
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the "No Provider" message when doctors are not available
  
  @33543
  Scenario: Verification of "No Availability" session when doctor is not available on a given day
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify "No Availability" session when doctor is not available on any perticular day
  
  @33544
  Scenario: Verify that doctors availability should be sorted by doctor name
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify that doctors availability is sorted by doctor name
  
  
  
  