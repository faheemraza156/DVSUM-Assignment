Feature: Edit View
#  @currentTest
  Scenario Outline: Successfully Edit Column View
    Given User is on the column dictionary page
    When User edits the column view
      | <viewName> | <editedViewName> | <databaseType> | <databaseFilter> | <databaseName> | <selectedColumns> |
    Then The view name should be <editedViewName>
    And The criteria should be equal to <selectedCriteria>
    And The columns should be equal to selectedColumns
      |<selectedColumns>|

    Examples:
    | viewName      | editedViewName | databaseType | databaseFilter | databaseName | selectedCriteria | selectedColumns                                                                                                                              |
    | newviewedited | newview        | Source       | Includes       | sarah db     | "sarah db"       | Analysis Type,Blanks %,Column,Column Description,Column Group,Column Name,Column Type,Count Blanks,Count All,Count Distinct,Data Type,Source |