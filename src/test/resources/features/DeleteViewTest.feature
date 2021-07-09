Feature: Delete View
#@currentTest
  Scenario Outline: Delete a view
    Given User is on the column dictionary page
    When User deletes the selected <view>
    Then The <view> should be deleted

    Examples:
      | view    |
      | newview |