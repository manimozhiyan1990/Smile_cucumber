Feature: Test amazon test Functionality

@sc1
  Scenario: Validate homepage Title
    When user enter search Product name "Table" in search box
    And  user click the search box button
    Then  user validate title of home page

  Scenario: validate next product
    When user enter search Product name "mouse" in search box
    And  user click the search box button

