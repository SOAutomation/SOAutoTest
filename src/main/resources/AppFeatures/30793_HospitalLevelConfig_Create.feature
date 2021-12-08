Feature: Hospital Level Config - Create

  @32962
  Scenario: To Check the Override start time for online appointments
  Given User is in Visit Management page
  When Click on Admin tab from top navigation bar
	And Click on Hospital Info 
	Then Login popup should display
	When User Login With Valid Admin Creds
	Then Adminstration page should display
	When User click Online Scheduling option
	Then Online Scheduling Screen should display
	And Verify "Override Start Time for Online Appointments" label text

	@32963
  Scenario: Verify the the Validation of the Override start time for online appointments
  Given User is in Visit Management page
  When Click on Admin tab from top navigation bar
	And Click on Hospital Info 
	Then Login popup should display
	When User Login With Valid Admin Creds
	Then Adminstration page should display
	When User click Online Scheduling option
	Then Online Scheduling Screen should display
	When User click on delay option and select any delay time
	Then System should show the selected delay time for the hospital