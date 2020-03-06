Feature: My Store - Items

  Background:
    Given I open the My Store Page

# Scenario to Validate Items
# ===========================================================================================

# An user should be able a discount for an item
  # A/C
  # An user open the webApp and should be able:
  # Select and item
  # Validate the discount
  #
  Scenario: Verify that the discount for "Printed Chiffon Dress" is 20% in Home Page
    When I click on BEST SELLERS
    Then The "Printed Chiffon Dress" item is displayed
    And The discount price showed for "Printed Chiffon Dress" should be "-20%"

