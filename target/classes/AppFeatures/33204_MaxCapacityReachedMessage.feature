Feature: Hospital Level Config - Create

  @34610
  Scenario: Verify the confirmation message when doctor reached max capacity
  Given User is in Visit Management page
  When Click on Admin tab from top navigation bar
	And Click on Hospital Info 
	Then Login popup should display
	When User Login With Valid Admin Creds
	Then Adminstration page should display
	When User click Online Scheduling option
	Then Online Scheduling Screen should display
	When User enter a number between 5 and 99 and click on Save button
	And User navigate to Schedule screen and click on clock icon to add a doctor to calender
	Then Added doctor should be displayed in calendar
	When User click on create button to make appointments
	Then Verify the confirmation message when the doctor reach max capacity
	