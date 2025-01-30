Feature: Add product to cart and wishlist

  Scenario: Verify that the user is able to select a product and add it to the cart
    Given the user is on the Home Page
    When the user selects a category from the menu
    And the user selects a product from the products page
    Then the user verifies the product name and product title
    When the user selects the product size
    And the user clicks on the "Add to Bag" button
    Then the user verifies the product name and price in the bag
    And the user adds the product to the wishlist