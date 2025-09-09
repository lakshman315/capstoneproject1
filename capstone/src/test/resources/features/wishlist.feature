Feature: Product Wishlist
Scenario: Add product to wishlist
Given user open nopCommerce site
When user searches for "<ProductName>" in home page
And user adds product to wishlist
Then sucessfully added to wishlist
Examples:
  | ProductName       |
  | Adobe Photoshop   |
  | MacBook           |