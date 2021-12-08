Feature: Provider Level Config Update

	@34009
	Scenario: Verifying the exit or attempt Save again when we click on Cancel button
	Given User is on Visit Management Page
	When User Click on Settings Icon in top view options
	And Click on Associates
	Then Login popup should display
	When User Login With Valid Admin Creds
	Then Associate page should display
	When User Click on Edit Option of any Available doctor
	And Select OPt out Online Scheduling Checkbox
	And Click on Save button
	Then Verify Sucess Message
	When User Expand Selected Doctor 
	Then Verify "optout information saved" message