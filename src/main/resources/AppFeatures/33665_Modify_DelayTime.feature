Feature: Modify Delay Time

@33665
Scenario: Verify that the user can able to modify and save the time of the available appointment
Given User is on Visit Management Page
When User Click on Settings Icon in top view options
And Click on Hospital Info 
Then Login popup should display
When User Login With Valid Admin Creds
Then Adminstrator page should display
When User click Online Scheduling option
Then Scheduling Screen should display
When select the different delay hours in override the start time for online appointments
And  Click on save button
Then Verify Selected delay hour in Scheduling Screen
When select the same delay hours in override the start time for online appointments
And  Click on cancel button
Then Verify Previous delay hour in Scheduling Screen