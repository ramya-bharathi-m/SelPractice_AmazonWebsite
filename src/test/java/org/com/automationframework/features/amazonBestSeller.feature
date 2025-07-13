Feature: Amazon BestSeller Purchase EndtoEnd

  Scenario:
    Given I open the Amazon Homepage
    And I login to Amazon application
    When I click on BestSeller
    When I search for Books with required category
    When I add to cart
    Then I continue payment

