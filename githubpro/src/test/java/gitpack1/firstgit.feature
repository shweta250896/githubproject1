Feature: Test Calculator
This file  describes calculator functoinality

Scenario: add two number
Given I want 40 in the calculator
And I press addition
 And I want another 70 add 
When I press equal Symbol button
 Then the result should be 110 on the screen display
