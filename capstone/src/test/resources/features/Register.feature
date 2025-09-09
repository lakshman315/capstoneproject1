Feature: User Registration
Scenario: Successful registration
  Given User is on nopCommerce homepage
  When User clicks on register link
  And User selects gender "<Gender>"
  And User enters "<FirstName>", "<LastName>", "<Email>", "<Password>", "<ConfirmPassword>"
  And User submits the registration form
  Then User should see registration confirmation
Examples:
  | Gender | FirstName | LastName   | Email                   | Password   | ConfirmPassword |
  | Male   | Lakshman  | Vangapandu | lakshman@gmail.com    | lakshman@1234  | lakshman@1234       |
  | Female | Sita      | Devi       | sita.devi@gmail.com      | Sita@9876  | Sita@9876       |
