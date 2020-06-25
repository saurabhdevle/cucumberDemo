Feature: PHP login with and without header
@invalidLoginWithoutheader
Scenario: login to php invalid scenario
Given user is already on "login" page
When title of login page is login
And user enters below username and password provided
|testuser1|testpassword|
|testuser2|testpassword2|
And user clicks on Login button
Then login error is displayed
But User is not on home page
And user closes browser


@signupWithHeader
Scenario: signup with header
Given user is already on "signup" page
And user provides signup information
|firstName|lastName|mobileNumber|email|password|confirmPwd|
|sigup|user1|1234567890|test@gmail.com|12132344|12132344|
And user clicks on Signup button
And user closes browser

@CurrencySelection
Scenario: select the INR currency from currency list
Given user is on home page
And user click on the currency dropdown button 
Then user clicked on INR currency
