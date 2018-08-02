Feature: hrm

Scenario Outline: login
Given openbrowser and url
When Enter un and pwd "<Username>","<Password>"
Then click on login

Examples:
|Username|Password|
|qaplanet1|lab1|

Scenario Outline: Add
Given openbrowser and url
When Enter un and pwd "<Username>","<Password>"
Then click on login
And click on  Add
And enter fn,ln"<First Nmae>","<Last Name>"
Then click on save
And verify
Examples:
|Username|Password|First Nmae|Last Name|
|qaplanet1|lab1|swathi|Reddy|

