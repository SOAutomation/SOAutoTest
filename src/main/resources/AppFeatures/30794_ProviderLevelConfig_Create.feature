Feature: Provider Level Config_Create

  @32932
  Scenario: Provider level Config Update
  Given User logged into Okta
  Then Petware login screen should display
  When User enter valid Username "<username>" and password "<password>"
  And Click on login button
  Then Visit Management page should display
  When Click on Admin tab from top navigation bar
	And Click on Associates
	Then Login popup should display
	When User Login With Valid Admin Creds
	Then Associate Information page should display
	When User click on edit option of any available doctor
	Then Verify the visibility of "Opt out Online Scheduling" feature
	And Verify that user can able to select or deselect checkbox