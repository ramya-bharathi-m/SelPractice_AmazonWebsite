Feature: Amazon product search

  Scenario: Search for bluetooth headphones
    Given I open the Amazon Homepage
    And I login to Amazon application
    When I search for "Bluetooth headphones"
    Then I should see search results
