Feature: Login
#Background:
#Given A chrome browser is launched
#And Load LeafTaps URL 'http://leaftaps.com/opentaps/'
#And Maximize the browser

@smoke @sanity
Scenario Outline:TC001 Login LeafTaps
Given Enter the username as <username>
And Enter the password as <password>
When The login button is clicked
Then Welcome Page is displayed
When 'CRM/SFA' Link is clicked
Then 'My Home' Page is displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|