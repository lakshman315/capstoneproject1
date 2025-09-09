Feature: nopCommerce login
Scenario: user gets successful login
Given User should open nopCommerce home page
When User click on login
And the user enters email "<Email>" and password "<Password>"
And user click on submit button
Then User should be logged in successfully

Examples:
  | Email                  | Password    |
  | lakshman@gmail.com    | lakshman@1234  |
  | sita.devi@gmail.com      | Sita@9876  |
