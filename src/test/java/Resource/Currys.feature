Feature:Clicking on a laptop
  Scenario:
    Given user is on CurrysPC World homepage
    When user hovers over computing
    And user moves the mouse to laptop
    And user clicks on all laptops
    And userchanges the sort by feature to High to low
    And user clicks on the most expensive laptop
    Then user should be able to add that laptop to basket