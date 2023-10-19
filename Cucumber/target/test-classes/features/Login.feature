Feature: Login functionality of Leaftaps application

Scenario Outline: TC001_Login with positive credentials

And Enter the userName as <userName>
And Enter the password as <password>
When Click login button
Then Home page is displayed

Examples:

|userName|password|
|'DemoSalesManager'|'crmsfa'|
|'democsr'|'crmsfa'|

Scenario: TC002_Login with negative credentials

And Enter the userName as 'demo'
And Enter the password as 'crmsfa'
When Click login button
But Error message is displayed