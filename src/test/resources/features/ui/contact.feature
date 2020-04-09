Feature: My Store - Login Test

  # An user should be able fills the contact form
  # A/C
  # An user open the webApp and should be able
  # fill form
  # Submit data
  # Validate the sent request
  #
  Scenario: Verify the checkout for added products to cart
    Given Navigate to Contact Page
    When I fill the Sales Inquiry form with the following data:
      | First Name         | Pablo                      |
      | Last Name          | Perez                      |
      | Job Title          | Manager                    |
      | Company            | ACME                       |
      | Email Address      | pablo.perez@acme.com       |
      | Business Phone     | 12345678                   |
      | Country            | United States              |
      | Contact Department | Accounting                 |
      | Message            | I need to contact with you |
    And I submit the form
    Then The message "Thank you for contacting us!" is displayed
