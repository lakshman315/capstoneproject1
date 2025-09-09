Feature: Remove from Cart
Scenario: Remove product from cart
Given user goes to the nopCommerce site
When user searched for "<ProductName>"
And user adding the product to cart
And user is going to cart
And user removes the product
Then cart should be empty
Examples:
  | ProductName       |
  | Adobe Photoshop   |
  | Apple iPhone 16 128GB |

