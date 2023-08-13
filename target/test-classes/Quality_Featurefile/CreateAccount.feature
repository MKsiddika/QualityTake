Feature: This is a Create Account feature Sprint1

@jon1

Scenario: Verify user can CreateAccount

Given Open <"URL"> application
Then Click Mousehover Signinlink
Then Click Start here
Then Enter FirstName LastName
Then Enter Email
Then Enter Password and Re-enter password
Then Click Continue

@jon2

Scenario: Verify user can Signin

Given Open <"URL"> application
Then Click Mousehover Signinlink
Then Click Signinlink
Then Enter email2
Then Click continue2
Then Enter password
Then Click Signin button
Then Verify user can Signin successfully