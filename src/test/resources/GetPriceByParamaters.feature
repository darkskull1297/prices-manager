Feature: Get price by Date, Product Id and Brand Id
  In order to get a Price from the data base
  Loading previously the data base using data on file: src/test/resources/import.sql

  Scenario Outline: Send a request to get a price by Date, Product Id and Brand Id
    When I send a request to get a Price by "<date>", Product Id 35455 and Brand Id 1
    Then I verify the Price "<Id>" received
    Examples:
      | date                 | Id |
      | 2020-06-14T10:00:00Z | 1  |
      | 2020-06-14T16:00:00Z | 2  |
      | 2020-06-14T21:00:00Z | 1  |
      | 2020-06-15T10:00:00Z | 3  |
      | 2020-06-16T21:00:00Z | 4  |