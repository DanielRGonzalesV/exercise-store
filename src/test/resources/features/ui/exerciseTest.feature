Feature: My Store - Items

  Background:
    Given I open the My Store Page

# Scenario to Validate Items
# ===========================================================================================

## An user should be able a discount for an item
#  # A/C
#  # An user open the webApp and should be able:
#  # Select and item
#  # Validate the discount
#  #
#  Scenario: Verify that the discount for "Printed Chiffon Dress" is 20% in Home Page
#    When I click on BEST SELLERS
#    Then The "Printed Chiffon Dress" item is displayed
#    And The discount price showed for "Printed Chiffon Dress" should be "-20%"

# An user should be able checkout added products to cart
  # A/C
  # An user open the webApp and should be able:
  # Add items to Cart
  # Validate the Items are displayed in the table into cart
  # Validate availability for item is "In Stock"
  #
  Scenario: Verify that the discount for "Printed Chiffon Dress" is 20% in Home Page
    When I click on BEST SELLERS
    When I add the following products to cart
      | Printed Chiffon Dress |
      | Blouse                |
    And I checkout products from cart
    Then The following products should be displayed with the status availability
      | Printed Chiffon Dress | In stock |
      | Blouse                | In stock |
