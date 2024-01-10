Feature: Voiture Pricing and Promotions

  Scenario: Apply Promotional Discount to Car
    Given a car has a default price
    When I apply a promotional discount of 10%
    Then the discounted price should be 9000.0
