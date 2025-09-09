Feature: Search Product
Scenario: Search for a product
  Given user opens nopCommerce site
  When user searches for "<ProductName>"
  Then user should see "<ProductName>" in results
Examples:
  | ProductName |
  | MacBook     |
  | Lenovo      |

