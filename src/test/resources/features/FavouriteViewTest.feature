

Feature: Favourite View

#  @currentTest
  Scenario Outline: Add a view to favourites
    Given User is on the column dictionary page
    When User favourites the selected <view>
    Then The <view> should be added to favourites

    Examples:
      |view|
      |newviewedited|