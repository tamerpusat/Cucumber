Feature: deneme

  Scenario: Go to google and search
    Given Go to google
    When  Click search bar
    When  Write cat and search
    Then  Check the result