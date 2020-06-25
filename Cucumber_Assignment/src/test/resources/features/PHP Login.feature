Feature: login to PHP travels feature

Scenario: login to php valid scenario
Given user is already on "login" page
When title of login page is login
And user enters "user@phptravels.com" and "demouser"
Then user clicks on Login button
And User is on home page
And user closes browser

Scenario: login to php invalid scenario
Given user is already on "login" page
When title of login page is login
And user enters "testuser" and "demouser"
And user clicks on Login button
Then login error is displayed
But User is not on home page
And user closes browser




