Feature: Add to Cart
Scenario: Add product to cart
Given user opens the nopCommerce site
When user searching for "<ProductName>"
And user adds product to cart
Then successfully product added to cart
Examples:
  | ProductName       |
  | Adobe Photoshop   |
  | MacBook           |
  | Samsung Galaxy    |
