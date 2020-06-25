Feature: login to PHP travels invalid with scenario outline
@withOutline
Scenario Outline: Login to php travels invalid login with scenario outline
Given user is already on login page
When title of login page is login
And user enter "<username>" and "<password>"
And user clicks on login button
Then login error is displayed 
But user is not on home page 
And user closes browser

Examples:
|username|password|
|testuser1|test1234|
|testuser2|test123|
