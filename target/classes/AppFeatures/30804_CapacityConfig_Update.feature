Feature: Capacity Config_Update

  @32934
  Scenario: Capacity Config Update
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When Click on Admin tab from top navigation bar
	And Click on Hospital Info 
	Then Login popup should display
	When User Login With Valid Admin Creds
	Then Adminstration page should display
	When User click Online Scheduling option
	Then Online Scheduling Screen should display
	And Verify the error message when user enter a number less than 5 in Capacity field
	And Verify the error message when user enter a number greater than 99 in Capacity field
	And Verify that capacity field should not allow characters other than number
	When User enter a number between 5 and 99 and click on Save button
	Then Verify the success message displayed
	When User enter a number between 5 and 99 and click on Cancel button
	Then Verify the previously saved value in the textbox
	When User restart the application
	Then Verify the value in Doctor Day Max Capacity
	