Feature: Ability to see available providers

  @33540
  Scenario: Verification of doctors availability for next seven days from current day
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the doctors availablity for next seven days from current day

	@33542
  Scenario: Verification of "No Provider" message when doctors are not available
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify the "No Provider" message when doctors are not available
  
  @33543
  Scenario: Verification of "No Availability" session when doctor is not available on a given day
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify "No Availability" session when doctor is not available on any perticular day
  
  @33544
  Scenario: Verify that doctors availability should be sorted by doctor name
  Given User is in Visit Management page
  When User click on Map icon from top navigation bar
  Then Global locator screen should display
  When User click on plus symbol
  Then Verify that doctors availability is sorted by doctor name
  
  
  
  