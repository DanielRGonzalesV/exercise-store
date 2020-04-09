Feature: Test CRUD methods in Sample REST API testing framework


  Scenario: Create an automated test to get the first student
    Given I send GET request for student with ID "1"
    Then I receive valid response code "200"
    And I validate response content

#  Scenario: Create an automated test to create a new student
#    Given I have the following student data:
#      | firstName | lastName | email               | programme        | courses              |
#      | Daniel    | Gonzales | daniel@gonzales.com | Computer Science | Calculus, Algorithms |
#    When I send a "POST" HTTP request with that data
#    Then I receive valid response code "201"
#    And I validate response content
