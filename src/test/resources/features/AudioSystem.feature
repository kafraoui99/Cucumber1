Feature: AudioSystem Pricing and Promotions

  Scenario: Apply Black Friday Discount
    Given the audio system has a default price
    And a car is associated with the audio system
    When I apply a Black Friday discount of 20%
    Then the total price should be 101000.0
